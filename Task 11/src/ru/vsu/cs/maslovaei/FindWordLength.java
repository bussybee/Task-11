package ru.vsu.cs.maslovaei;

public class FindWordLength {

    public String writeLengthOfEachWord(String text) {

        StringBuilder sentences = new StringBuilder();
        String[] sortedText = text.split("[^A-Za-zА-Яа-я0-9]");

        for (int i = 0; i < sortedText.length; i++) {
            if (i == sortedText.length - 1) {
                sentences.append(sortedText[i]).append("(").append(sortedText[i].length()).append(")");
            } else {
                sentences.append(sortedText[i]).append("(").append(sortedText[i].length()).append(") ");
            }
        }

        return sentences.toString();
    }
}
