package com.umg.bilingualcode;


import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import java.io.IOException;
import java.util.List;

import com.umg.bilingualcode.LexicalGenerators.*;
import com.umg.bilingualcode.SyntacticGenerators.*;


public class Main {

    public static void main(String[] args) {
        try {
            String sourceFile = "input.spc";

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

            // Parser
            SpanglishCodeParser parser = new SpanglishCodeParser(tokens);

            // Parse once and store tree
            ParseTree tree = parser.program();

            // Generate syntax tree output

            SyntacticTreeGenerator syntacticTreeGenerator = new SyntacticTreeGenerator();
            syntacticTreeGenerator.generate(tree, parser);

            // Compilation status
            if (parser.getNumberOfSyntaxErrors() == 0) {
                System.out.println("Compilation successful.");
            } else {
                System.out.println("Compilation finished with syntax errors.");
            }

        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}