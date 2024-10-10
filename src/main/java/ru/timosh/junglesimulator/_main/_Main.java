package ru.timosh.junglesimulator._main;

import ru.timosh.junglesimulator.model.Jaguar;
import ru.timosh.junglesimulator.util.GetEvent;

public class _Main {
    public static void  main (String[] args){
        Jaguar jaguar = new Jaguar();
        GetEvent getEvent = new GetEvent();
        getEvent.activateEvent(jaguar);
    }
}
