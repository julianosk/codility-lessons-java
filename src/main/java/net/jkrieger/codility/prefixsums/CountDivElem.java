package net.jkrieger.codility.prefixsums;

public class CountDivElem {

    public int solution(int A, int B, int K) {
        if (A % K == 0)
            return (B / K) - (A / K) + 1;

        return (B / K) - (A / K);
    }

    public int solutionA(int A, int B, int K) {
        int numberOfDivisibles = 0;
        int currentNumber = A;
        while (currentNumber <= B) {
            if (currentNumber % K == 0) {
                numberOfDivisibles++;
            }
            currentNumber++;
        }
        return numberOfDivisibles;
    }

}
