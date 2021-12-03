package com.sparta.sort.model.tools;

public interface Timeable {
    void start();
    void stop();
    long getElapsedNanoseconds();
}
