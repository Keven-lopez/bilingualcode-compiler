package com.umg.bilingualcode.SyntacticGenerators;

import com.umg.bilingualcode.SpanglishCodeParser;
import org.antlr.v4.runtime.tree.ParseTree;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class SyntacticTreeGenerator {

    public void generate(ParseTree tree, SpanglishCodeParser parser) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter("output/syntaxOutput/syntactic_tree.txt"));

        writeTree(tree, parser, writer, 0);

        writer.close();
    }

    public void generateEmpty() throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter("output/syntaxOutput/syntactic_tree.txt"));
        writer.write("");
        writer.close();
    }

    private void writeTree(ParseTree tree, SpanglishCodeParser parser,
                           BufferedWriter writer, int indent) throws IOException {

        String indentation = "  ".repeat(indent);

        String nodeText;

        if (tree.getChildCount() == 0) {
            nodeText = tree.getText();
        } else {
            nodeText = parser.getRuleNames()[((org.antlr.v4.runtime.RuleContext) tree).getRuleIndex()];
        }

        writer.write(indentation + nodeText + "\n");

        for (int i = 0; i < tree.getChildCount(); i++) {
            writeTree(tree.getChild(i), parser, writer, indent + 1);
        }
    }
}