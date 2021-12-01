package com.sparta.sort.view;

import com.sparta.sort.model.SortingAlgo;

import java.util.ArrayList;

public class InputManager {
    private String structureInput;
    private int structureLength;
    private String timingInput;
    private String compareInput;
    private ArrayList<SortingAlgo> algorithms;


    public void launch(String structureInput, int structureLength,
                       String timingInput, String compareInput,
                       ArrayList<SortingAlgo> algorithms) {

        setStructureInput(structureInput);
        setStructureLength(structureLength);
        setTimingInput(timingInput);
        setCompareInput(compareInput);
        setAlgorithms(algorithms);

    }

    public String getStructureInput() {
        return structureInput;
    }

    public void setStructureInput(String structureInput) {
        this.structureInput = structureInput;
    }

    public int getStructureLength() {
        return structureLength;
    }

    public void setStructureLength(int structureLength) {
        this.structureLength = structureLength;
    }

    public String getTimingInput() {
        return timingInput;
    }

    public void setTimingInput(String timingInput) {
        this.timingInput = timingInput;
    }

    public String getCompareInput() {
        return compareInput;
    }

    public void setCompareInput(String compareInput) {
        this.compareInput = compareInput;
    }

    public ArrayList<SortingAlgo> getAlgorithms() {
        return algorithms;
    }

    public void setAlgorithms(ArrayList<SortingAlgo> algorithms) {
        this.algorithms = algorithms;
    }
}
