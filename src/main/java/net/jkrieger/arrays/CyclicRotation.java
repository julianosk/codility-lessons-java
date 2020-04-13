package net.jkrieger.arrays;

class CyclicRotation {
    public int[] solution(int[] A, int K) {
        if (A.length > 1) {
            for (int j = 0; j < K; j++) {
                int next = A[A.length - 1];
                int temp;
                for (int i = 0; i < A.length; i++) {
                    temp = A[i];
                    A[i] = next;
                    next = temp;
                }
            }
        }
        return A;
    }
}