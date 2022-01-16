package ru.vsu.cs.maslovaei;

import org.junit.Assert;
import org.junit.Test;

public class Tests {
    FindWordLength findingLengthOfEachWord = new FindWordLength();

    @Test
    public void testFindingLengthOfEachWordWithOneWord() {
        String testedText = "Я завтра еду на соревнования";
        String expectedResult = "Я(1) завтра(6) еду(3) на(2) соревнования(12)";
        String actualResult = findingLengthOfEachWord.writeLengthOfEachWord(testedText);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testFindingLengthOfEachWordWithNumbers() {
        String testedText = "134 63 1379";
        String expectedResult = "134(3) 63(2) 1379(4)";
        String actualResult = findingLengthOfEachWord.writeLengthOfEachWord(testedText);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testFindingLengthOfEachWordWithEnglishText() {
        String testedText = "На автобусе";
        String expectedResult = "На(2) автобусе(8)";
        String actualResult = findingLengthOfEachWord.writeLengthOfEachWord(testedText);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testFindingLengthOfEachWordWithOneNumber() {
        String testedText = "124958364";
        String expectedResult = "124958364(9)";
        String actualResult = findingLengthOfEachWord.writeLengthOfEachWord(testedText);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testFindingLengthOfEachWordWithSomeSimpleWords() {
        String testedText = "Факультет Компьютерных Наук";
        String expectedResult = "Факультет(9) Компьютерных(12) Наук(4)";
        String actualResult = findingLengthOfEachWord.writeLengthOfEachWord(testedText);

        Assert.assertEquals(expectedResult, actualResult);
    }
}
