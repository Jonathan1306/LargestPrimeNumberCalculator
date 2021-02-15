
package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println("largest prime of 21 is: " + getLargestPrime(21));
    }

    public static int getLargestPrime(int number){
        int largestPrime = 0;



        if(number == 0 || number == 1 || number < 0){
            return -1;
        }
        for(int i=1; i < number; i++){
            if(number % i == 0){

                if(i /2 != 0 || i / 3 != 0) {
                    largestPrime = i;
                }
            }
        }
        return largestPrime;
    }
}
