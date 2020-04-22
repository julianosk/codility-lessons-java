package net.jkrieger.timecomplexity;

class FrogJmp {

    public int solution(int X, int Y, int D) {
        double diff = Y - X;
        return (int) Math.ceil(diff / D);
    }

}