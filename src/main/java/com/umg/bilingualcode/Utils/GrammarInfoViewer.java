package com.umg.bilingualcode.Utils;

public class GrammarInfoViewer {

    public void show() {

        System.out.println("\n===== SPANGLISHCODE LANGUAGE GUIDE =====");

        // =========================
        // Keywords
        // =========================
        System.out.println("\n--- Keywords (English / Spanish) ---");
        System.out.println("start / inicio");
        System.out.println("finish / fin");
        System.out.println("define / definir");
        System.out.println("as / como");
        System.out.println("set / poner");
        System.out.println("to / para");
        System.out.println("input / entrada");
        System.out.println("display / mostrar");
        System.out.println("if / si");
        System.out.println("then / entonces");
        System.out.println("else / sino");
        System.out.println("end_if / fin_si");
        System.out.println("while / mientras");
        System.out.println("do / hacer");
        System.out.println("end_while / fin_mientras");
        System.out.println("function / funcion");
        System.out.println("end_function / fin_funcion");
        System.out.println("return / retornar");
        System.out.println("call / llamar");

        // =========================
        // Data types
        // =========================
        System.out.println("\n--- Data Types ---");
        System.out.println("number / numero");
        System.out.println("text / texto");
        System.out.println("boolean / booleano");

        // =========================
        // Operators
        // =========================
        System.out.println("\n--- Operators ---");
        System.out.println("Arithmetic: +  -  *  /");
        System.out.println("Comparison: ==  !=  <  >  <=  >=");
        System.out.println("Logical: and/y  or/o  not/no");

        // =========================
        // Symbols
        // =========================
        System.out.println("\n--- Symbols ---");
        System.out.println("=  ;  ( )  ,  { }");

        // =========================
        // Basic Syntax
        // =========================
        System.out.println("\n--- Basic Syntax ---");

        System.out.println("\nProgram:");
        System.out.println("start");
        System.out.println("   ... statements ...");
        System.out.println("finish");

        System.out.println("\nDeclaration:");
        System.out.println("define x as number;");
        System.out.println("definir x como numero;");

        System.out.println("\nAssignment:");
        System.out.println("set x to 10;");
        System.out.println("poner x para 10;");

        System.out.println("\nDisplay:");
        System.out.println("display x;");
        System.out.println("mostrar x;");

        System.out.println("\nIf:");
        System.out.println("if x > 5 then");
        System.out.println("   display x;");
        System.out.println("end_if;");

        System.out.println("\nWhile:");
        System.out.println("while x < 10 do");
        System.out.println("   set x to x + 1;");
        System.out.println("end_while;");

        System.out.println("\nFunction:");
        System.out.println("function sum(a, b) do");
        System.out.println("   return a + b;");
        System.out.println("end_function;");

        System.out.println("\nCall:");
        System.out.println("call sum(5, 3);");

        System.out.println("\n===== END OF GUIDE =====\n");
    }
}
