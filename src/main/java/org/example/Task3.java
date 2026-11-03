package org.example;

public class Task3 {
    public static void main(String[] args) {

        int[] testResults = {1, 0, 1, 1, 0};
        int countPassed = 0;
        int countFailed=0;

        for (int i = 0; i < testResults.length; i++) {
            if (testResults[i]==1) {
                countPassed++;
            }
            else {
                countFailed++;}
            }
        System.out.println("Passed:" + countPassed);
        System.out.println("Failed:" + countFailed);


        }

    }

