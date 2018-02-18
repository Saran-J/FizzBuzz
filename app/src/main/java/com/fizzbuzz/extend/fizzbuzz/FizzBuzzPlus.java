package com.fizzbuzz.extend.fizzbuzz;

/**
 * Created by extend on 19/2/2018 AD.
 */

public class FizzBuzzPlus {

    public String count(int i) {
        String result = "...";
        if (checkMultipleAndContain(i,3)){
            result += "fizz";
        }
        if (checkMultipleAndContain(i,5)){
            result += "buzz";
        }

        return result;
    }

    public Boolean checkMultipleAndContain(int i,int check){
        return i%check == 0 || String.valueOf(i).contains(String.valueOf(check));
    }
}
