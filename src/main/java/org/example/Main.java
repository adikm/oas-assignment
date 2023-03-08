package org.example;

public class Main {
    public static void main(String[] args) {
        PathAnalyzer pathAnalyzer = new PathAnalyzer();
        PathAnalyzeResult result = pathAnalyzer.analyze("OAS/is/us");
        System.out.println(result);
    }
}