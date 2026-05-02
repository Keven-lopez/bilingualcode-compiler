package com.umg.bilingualcode;


import com.umg.bilingualcode.ExecutionGenerators.ExecutionGenerator;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import java.io.IOException;
import java.util.List;

import com.umg.bilingualcode.LexicalGenerators.*;
import com.umg.bilingualcode.SyntacticGenerators.*;


public class Main {

    public static void main(String[] args) {
        try {
            String sourceFile = "input/incorrect/input3.spc";

            // Read source file
            CharStream input = CharStreams.fromFileName(sourceFile);

            // Lexer
            SpanglishCodeLexer lexer = new SpanglishCodeLexer(input);

            // Token stream
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            tokens.fill();

            List<Token> tokenList = tokens.getTokens();

            // Generate lexical analysis outputs
            SymbolTableGenerator symbolTableGenerator = new SymbolTableGenerator();
            symbolTableGenerator.generate(tokenList);

            LexicalErrorGenerator lexicalErrorGenerator = new LexicalErrorGenerator();
            lexicalErrorGenerator.generate(tokenList);

            RegexTableGenerator regexTableGenerator = new RegexTableGenerator();
            regexTableGenerator.generate();

            // Reset token stream before parsing
            tokens.seek(0);

            SpanglishCodeParser parser = new SpanglishCodeParser(tokens);
            SyntacticTreeGenerator syntacticTreeGenerator = new SyntacticTreeGenerator();

            SyntaxErrorGenerator syntaxErrorGenerator = new SyntaxErrorGenerator();

            parser.removeErrorListeners();
            parser.addErrorListener(syntaxErrorGenerator);

            ParseTree tree = parser.program();

            syntaxErrorGenerator.close();

            if (parser.getNumberOfSyntaxErrors() == 0) {
                syntacticTreeGenerator.generate(tree, parser);

                ExecutionGenerator executionGenerator = new ExecutionGenerator();
                executionGenerator.execute(tree);

                System.out.println("Compilation successful.");

            } else {

                syntacticTreeGenerator.generateEmpty();

                System.out.println("Compilation finished with syntax errors.");
            }

        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}