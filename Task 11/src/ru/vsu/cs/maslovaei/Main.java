package ru.vsu.cs.maslovaei;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String text = readStringFromConsole();
        FindWordLength findWordLength = new FindWordLength();
        String textWithCountedWordLengths = findWordLength.writeLengthOfEachWord(text);
        printNamesFromText(textWithCountedWordLengths);
    }

    private static String readStringFromConsole() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the text: ");
        return scanner.nextLine();
    }

    private static void printNamesFromText(String changedText) {
        System.out.println(changedText);
    }
}
