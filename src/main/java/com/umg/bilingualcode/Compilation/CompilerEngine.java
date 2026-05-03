package com.umg.bilingualcode.Compilation;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import com.umg.bilingualcode.SpanglishCodeLexer;
import com.umg.bilingualcode.SpanglishCodeParser;
import com.umg.bilingualcode.LexicalGenerators.*;
import com.umg.bilingualcode.SyntacticGenerators.*;
import com.umg.bilingualcode.ExecutionGenerators.*;

import java.io.IOException;
import java.util.List;

public class CompilerEngine {

    public void compileAndExecute(String sourceFile) {

        try {
            // =========================
            // Read file
            // =========================
            CharStream input = CharStreams.fromFileName(sourceFile);

            // =========================
            // Lexer
            // =========================
            SpanglishCodeLexer lexer = new SpanglishCodeLexer(input);

            CommonTokenStream tokens = new CommonTokenStream(lexer);
            tokens.fill();

            List<Token> tokenList = tokens.getTokens();

            // =========================
            // Lexical outputs
            // =========================
            new SymbolTableGenerator().generate(tokenList);
            new LexicalErrorGenerator().generate(tokenList);
            new RegexTableGenerator().generate();

            // =========================
            // Reset tokens before parsing
            // =========================
            tokens.seek(0);

            // =========================
            // Parser
            // =========================
            SpanglishCodeParser parser = new SpanglishCodeParser(tokens);

            SyntaxErrorGenerator syntaxErrorGenerator = new SyntaxErrorGenerator();
            parser.removeErrorListeners();
            parser.addErrorListener(syntaxErrorGenerator);

            ParseTree tree = parser.program();
            syntaxErrorGenerator.close();

            // =========================
            // Syntactic + Execution
            // =========================
            SyntacticTreeGenerator treeGenerator = new SyntacticTreeGenerator();

            if (parser.getNumberOfSyntaxErrors() == 0) {

                treeGenerator.generate(tree, parser);

                ExecutionGenerator executionGenerator = new ExecutionGenerator();
                executionGenerator.execute(tree);

                System.out.println("Compilation successful.");

            } else {

                treeGenerator.generateEmpty();
                System.out.println("Compilation finished with syntax errors.");
            }

        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}