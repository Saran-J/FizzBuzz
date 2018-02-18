package com.fizzbuzz.extend.fizzbuzz;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

public class FizzBuzzPlusTest {



    @Test
    public void inputIs3_ShouldReturnFizz(){
        FizzBuzzPlus plus = new FizzBuzzPlus();
        Assert.assertTrue(plus.count(3).contains("fizz"));
    }

    @Test
    public void inputIs5_ShouldReturnBuzz(){
        FizzBuzzPlus plus = new FizzBuzzPlus();
        Assert.assertTrue(plus.count(5).contains("buzz"));
    }

    @Test
    public void inputIs13_ShouldReturnFizz(){
        FizzBuzzPlus plus = new FizzBuzzPlus();
        Assert.assertTrue(plus.count(13).contains("fizz"));
    }

    @Test
    public void inputIs23_ShouldReturnFizz(){
        FizzBuzzPlus plus = new FizzBuzzPlus();
        Assert.assertTrue(plus.count(13).contains("fizz"));
    }

    @Test
    public void inputIs25_ShouldReturnFizzAndBuzzTogether(){
        FizzBuzzPlus plus = new FizzBuzzPlus();
        Assert.assertTrue(plus.count(15).contains("buzz"));
    }

    @Test
    public void inputIs15_ShouldReturnFizzAndBuzzTogether(){
        FizzBuzzPlus plus = new FizzBuzzPlus();
        Assert.assertTrue(plus.count(15).contains("fizz"));
        Assert.assertTrue(plus.count(15).contains("buzz"));
    }

    @Test
    public void inputIs35_ShouldReturnFizzAndBuzzTogether(){
        FizzBuzzPlus plus = new FizzBuzzPlus();
        Assert.assertTrue(plus.count(35).contains("fizz"));
        Assert.assertTrue(plus.count(35).contains("buzz"));
    }


}
