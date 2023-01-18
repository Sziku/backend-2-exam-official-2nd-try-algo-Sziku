package hu.nive.ujratervezes.prime;

import java.util.Arrays;

public class PrimeCalculator {
    public int min(int[] inputArr){

        if(inputArr == null) throw new IllegalArgumentException();
        if(inputArr.length == 0) throw new IllegalArgumentException();

        int min = inputArr[0];
        for(int number : inputArr){
            if(number < min){
                min = number;
            }
        }

        return min;
    }


    public boolean isPrime(int num){
        int division = 0;

        for(int i = 1; i <= num; i++){
            if(num%i == 0){
                division++;
            }
        }

        return division == 2;
    }

    public int[] multiplyPrimesWithMinimum(int[] inputArr){
        if(inputArr == null) throw new IllegalArgumentException();
        if(inputArr.length == 0) return new int[0];

        int min = min(inputArr);
        for(int i = 0; i< inputArr.length; i++){
            if(isPrime(inputArr[i])){
                inputArr[i] = min * inputArr[i];
            }
        }
        return inputArr;
    }
}
