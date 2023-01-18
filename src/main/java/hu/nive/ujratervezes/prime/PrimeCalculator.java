package hu.nive.ujratervezes.prime;

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
        return false;
    }

    public int[] multiplyPrimesWithMinimum(int[] inputArr){
        return null;
    }
}
