package ru.timosh.junglesimulator.model;

public class Jaguar {
//Здоровье = 100 хр
    //Энергия = 100 эн
    // Кэффициент зубов - сколько энергии ягуар получает когда кого-то есть = 3.5


    private int health = 100;
    private int energy = 100;
    private final double FANGS = 3.5;

    public void energyCheker(Jaguar jaguar) {
        return this.health;
    }

    public void setHealth(int health) {
        this.health = health;

    }

    public int getHealth() {
        return this.health;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    public int getEnergy() {
        return this.energy;
    }

    public double getFANGS() {
        return this.FANGS;
    }
}
