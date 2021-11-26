package com.sparta.sort;

public class PerformanceView {
    private String algoName;
    private long elapsedNanoseconds;

    public PerformanceView(String algoName, long elapsedNanoseconds){
        this.algoName = algoName;
        this.elapsedNanoseconds = elapsedNanoseconds;
    }

    public String getAlgoName() {
        return algoName;
    }

    public void setAlgoName(String algoName) {
        this.algoName = algoName;
    }

    public long getElapsedNanoseconds() {
        return elapsedNanoseconds;
    }

    public void setElapsedNanoseconds(long elapsedNanoseconds) {
        this.elapsedNanoseconds = elapsedNanoseconds;
    }

    public void printPerformance() {
        System.out.println(this.algoName + " sorted the array in " + this.elapsedNanoseconds + " nanoseconds.");
    }

}
