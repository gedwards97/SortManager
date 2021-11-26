package com.sparta.sort;

public interface Timer {
    void start();
    void stop();
    void reset();
    long getElapsedNanoseconds();
}
