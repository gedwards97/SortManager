package com.sparta.sort.model;

public interface Timeable {
    void start();
    void stop();
    long getElapsedNanoseconds();
}
