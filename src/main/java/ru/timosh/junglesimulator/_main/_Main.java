package ru.timosh.junglesimulator._main;

import ru.timosh.junglesimulator.model.Jaguar;
import ru.timosh.junglesimulator.util.Simulator;

public class _Main {
    public static void main(String[] args) {
        Jaguar jaguar = new Jaguar();
        Simulator simulator = new Simulator();
        simulator.startSimulation(jaguar);
    }
}
