package com.sparta.sort.model;

public class Stopwatch implements Timeable {
    private long startTime = 0;
    private long endTime = 0;
    private boolean timing = false;

    public void start() {
        this.startTime = System.nanoTime();
        this.timing = true;
    }

    public void stop() {
        this.endTime = System.nanoTime();
        this.timing = false;
    }

    public long getElapsedNanoseconds() {
        long elapsedTime;

        if (timing)
            elapsedTime = (System.nanoTime() - startTime);
        else
            elapsedTime = (endTime - startTime);

        return elapsedTime;
    }
}
