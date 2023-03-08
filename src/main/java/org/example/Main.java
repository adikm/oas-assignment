package org.example;

public class Main {
    public static void main(String[] args) {
        PathAnalyzer pathAnalyzer = new PathAnalyzer();
        PathAnalyzeResult oas = pathAnalyzer.analyze("OAS/is/us");
        System.out.println(oas);
    }
}