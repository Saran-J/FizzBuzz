package com.fizzbuzz.extend.fizzbuzz;
import org.junit.Test;
import static org.junit.Assert.*;

public class FizzBuzzTest {

    @Test
    public void inputIs1_ShouldReturn1() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("1",fizzBuzz.count(1));
    }

    @Test
    public void inputIs2_ShouldReturn2() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("2",fizzBuzz.count(2));
    }
    @Test
    public void inputIs3_ShouldReturnFizz(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("fizz",fizzBuzz.count(3));
    }

    @Test
    public void inputIs5_ShouldReturnBuzz(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("buzz",fizzBuzz.count(5));
    }
    @Test
    public void inputThatMultipleOf3And5_ShouldReturnFizzBuzz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("fizzbuzz",fizzBuzz.count(15));
    }

    @Test
    public void numberThatMultipleOf3And5_ShouldMultipleOf15(){
        int[] data = {15,30,45,60,90};
        int result = 0;
        for(int i = 0;i< data.length;i++){
            result += data[i]%15;
        }
        assertEquals(0,result);
    }

}
