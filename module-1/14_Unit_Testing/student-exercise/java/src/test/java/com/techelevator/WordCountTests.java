package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

import java.util.Dictionary;
import java.util.Map;

public class WordCountTests {


    @Test
    public void returnWord_Count_More_Than_One_Same_Word(){
        WordCount sut = new WordCount();
        String[] array = {"ba", "ba", "ba", "Black"};
        Map<String, Integer> result = sut.getCount(array);
        Assert.assertEquals(result, result);
    }


    @Test
    public void returnWord_Count_Only_One_Each_Word(){
        WordCount sut = new WordCount();
        String[] array = {"ba", "Black"};
        Map<String, Integer> result = sut.getCount(array);
        Assert.assertEquals(result, result);
    }



}
