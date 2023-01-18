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
        int isPrime = 0;

        for(int i = 1; i <= num; i++){
            if(num%i == 0){
                isPrime++;
            }
        }

        return isPrime == 2;
    }

    public int[] multiplyPrimesWithMinimum(int[] inputArr){
        return null;
    }
}
