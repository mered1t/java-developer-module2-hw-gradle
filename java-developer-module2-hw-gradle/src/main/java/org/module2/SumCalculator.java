package org.module2;

public class SumCalculator {

    public int sum(int number){

        if(number <= 0){throw new IllegalArgumentException("check the sum value");}

        int numberSum = 0;

        for (int i = 1; i <= number; i++){
            numberSum += i;
        }

        return numberSum;
    }
}
