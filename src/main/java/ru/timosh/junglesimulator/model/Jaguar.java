package ru.timosh.junglesimulator.model;

public class Jaguar {
//Здоровье = 100 хр
    //Энергия = 100 эн
    // Кэффициент зубов - сколько энергии ягуар получает когда кого-то есть = 3.5


    private int health = 100;
    private int energy = 100;
    private   final float FANGS = 3.5;

    public static void energyCheker(Jaguar jaguar) {
        return this.health;
    }

    public static void setHealth(int health) {
        this.health = health;

    }

    public static int getHealth() {
        return this.health;
    }

    public static void setEnergy(int energy) {
        this.energy = energy;
    }

    public static int getEnergy() {
        return this.energy;
    }

    public float getFANGS() {
        return this.FANGS;
    }
}
}
