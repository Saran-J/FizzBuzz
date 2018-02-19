package com.fizzbuzz.extend.fizzbuzz;

import android.util.Log;

/**
 * Created by extend on 19/2/2018 AD.
 */

public class FizzBuzz {
    String[] fizz = {"fizz"};
    String[] buzz = {"buzz"};
    String[] fizzbuzz = {"fizzbuzz"};
    public String count(int i) {
        String returnValue = "";

        try {
            returnValue = fizzbuzz[i % 15];
            return returnValue;
        } catch (ArrayIndexOutOfBoundsException e) {

        }
        try {
            returnValue = buzz[i % 5];
            return returnValue;
        } catch (ArrayIndexOutOfBoundsException e){

        }

        try {
            returnValue = fizz[i % 3];
            return returnValue;
        } catch (ArrayIndexOutOfBoundsException e){
            returnValue = String.valueOf(i);
        }

        return returnValue;
    }
}
