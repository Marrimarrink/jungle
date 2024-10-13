package ru.timosh.junglesimulator.util;

import ru.timosh.junglesimulator.model.Jaguar;

public class GetEvent {

    public void activateEvent(Jaguar jaguar) {

        while (checkStatus(jaguar)) {
            int eventNumber = (int) (Math.random() * 100);
            if (eventNumber >= 0 && eventNumber < 30) {
                sleepEvent(jaguar);
            } else if (eventNumber >= 30 && eventNumber < 35) {
                playEvent(jaguar);
            } else if (eventNumber >= 35 && eventNumber < 45) {
                waitEvent(jaguar);
            } else if (eventNumber >= 45 && eventNumber < 50) {
                swimEvent(jaguar);
            } else if (eventNumber >= 50 && eventNumber < 60) {
                drinkEvent(jaguar);
            } else if (eventNumber >= 60 && eventNumber < 65) {
                eatLargeEvent(jaguar);
            } else if (eventNumber >= 65 && eventNumber < 75) {
                eatSmallEvent(jaguar);
            } else if (eventNumber >= 75 && eventNumber < 80) {
                snoozeEvent(jaguar);
            } else if (eventNumber >= 80 && eventNumber < 90) {
                runEvent(jaguar);
            } else if (eventNumber >= 90 && eventNumber < 95) {
                attackedSnakeEvent(jaguar);
            } else if (eventNumber >= 95 && eventNumber < 100) {
                attackedHunterEvent(jaguar);
            }
        }
        System.out.println("Ой, ягуар умер :( Симуляция завершена");
    }

    private void sleepEvent(Jaguar jaguar) {
        int energy = jaguar.getEnergy();
        int health = jaguar.getHealth();

        energy = energy + 30;
        if (energy > 100) {
            energy = 100;
        }
        health = health + 20;
        if (health > 100) {
            health = 100;
        }
        jaguar.setEnergy(energy);
        jaguar.setHealth(health);
        checkEnergy(jaguar);

        System.out.println("Ягуар хорошенько выспался! Текущая энергия: " + jaguar.getEnergy() + "Текущее здоровье: " + jaguar.getHealth());
    }

    private void playEvent(Jaguar jaguar) {
        int energy = jaguar.getEnergy();

        energy = energy - 4;
        if (energy < 0) {
            energy = 0;
        }
        jaguar.setEnergy(energy);
        checkEnergy(jaguar);

        System.out.println("Ягуар поиграл и отлично повеселился! Текущая энергия: " + jaguar.getEnergy());
    }

    private void waitEvent(Jaguar jaguar) {
        int energy = jaguar.getEnergy();

        energy = energy - 1;
        if (energy < 0) {
            energy = 0;
        }
        jaguar.setEnergy(energy);
        checkEnergy(jaguar);

        System.out.println("Ягуар притаился в засаде! Текущая энергия: " + jaguar.getEnergy());
    }

    private void swimEvent(Jaguar jaguar) {
        int energy = jaguar.getEnergy();

        energy = energy - 3;
        if (energy < 0) {
            energy = 0;
        }
        jaguar.setEnergy(energy);
        checkEnergy(jaguar);

        System.out.println("Ягуар переплывал реку! Текущая энергия: " + jaguar.getEnergy());
    }

    private void drinkEvent(Jaguar jaguar) {
        int health = jaguar.getHealth();

        health = health + 2;
        if (health > 100) {
            health = 100;
        }
        jaguar.setHealth(health);
        checkEnergy(jaguar);

        System.out.println("Ягуар попил водичку! Текущее здоровье: " + jaguar.getHealth());
    }

    private void eatLargeEvent(Jaguar jaguar) {
        int energy = jaguar.getEnergy();
        int health = jaguar.getHealth();

        energy = energy - 15;
        if (energy < 0) {
            energy = 0;
        }
        health = health + (int) (jaguar.getFANGS() * 4);
        if (health > 100) {
            health = 100;
        }
        jaguar.setEnergy(energy);
        jaguar.setHealth(health);
        checkEnergy(jaguar);

        System.out.println("Ягуар знатно обожрался тушкой оленя! Текущая энергия: " + jaguar.getEnergy() + " Текущее здоровье: " + jaguar.getHealth());
    }

    private void eatSmallEvent(Jaguar jaguar) {
        int energy = jaguar.getEnergy();
        int health = jaguar.getHealth();

        energy = energy - 2;
        if (energy < 0) {
            energy = 0;
        }
        health = health + (int) (jaguar.getFANGS() * 1);
        if (health > 100) {
            health = 100;
        }
        jaguar.setEnergy(energy);
        jaguar.setHealth(health);
        checkEnergy(jaguar);

        System.out.println("Ягуар перекусил рыбкой! Текущая энергия: " + jaguar.getEnergy() + " Текущее здоровье: " + jaguar.getHealth());
    }

    private void snoozeEvent(Jaguar jaguar) {
        int energy = jaguar.getEnergy();
        int health = jaguar.getHealth();

        energy = energy + 10;
        if (energy > 100) {
            energy = 100;
        }
        health = health + 5;
        if (health > 100) {
            health = 100;
        }
        jaguar.setEnergy(energy);
        jaguar.setHealth(health);
        checkEnergy(jaguar);

        System.out.println("Ягуар отдохнул на дереве! Текущая энергия: " + jaguar.getEnergy() + " Текущее здоровье: " + jaguar.getHealth());
    }

    private void runEvent(Jaguar jaguar) {
        int energy = jaguar.getEnergy();
        energy = energy - 7;
        if (energy < 0) {
            energy = 0;
        }
        jaguar.setEnergy(energy);
        checkEnergy(jaguar);

        System.out.println("Ягуар бегал! Текущая энергия: " + jaguar.getEnergy());
    }

    private void attackedSnakeEvent(Jaguar jaguar) {
        int energy = jaguar.getEnergy();
        int health = jaguar.getHealth();
        energy = energy - 10;

        if (energy < 0) {
            energy = 0;
        }
        health = health - 5;
        if (health < 0) {
            health = 0;
        }

        jaguar.setEnergy(energy);
        jaguar.setHealth(health);
        checkEnergy(jaguar);

        System.out.println("Ягуар вступил в схватку с анакондой! Текущая энергия: " + jaguar.getEnergy() + " Текущее здоровье: " + jaguar.getHealth());
    }


    private void attackedHunterEvent(Jaguar jaguar) {
        int energy = jaguar.getEnergy();
        int health = jaguar.getHealth();
        energy = energy - 7;

        if (energy < 0) {
            energy = 0;
        }
        health = health - 20;
        if (health < 0) {
            health = 0;
        }
        jaguar.setEnergy(energy);
        jaguar.setHealth(health);
        checkEnergy(jaguar);

        System.out.println("Ягуар вступил в схватку с анакондой! Текущая энергия: " + jaguar.getEnergy() + " Текущее здоровье: " + jaguar.getHealth());
    }

    private boolean checkStatus(Jaguar jaguar) {
        System.out.println("Энергия: " + jaguar.getEnergy() + ", Здоровье: " + jaguar.getHealth());
        if (jaguar.getHealth() <= 0) {
            return false;
        } else {
            return true;
        }
    }

    private void checkEnergy(Jaguar jaguar) {
        if (jaguar.getEnergy() <= 0) {
            int health = jaguar.getHealth();
            health = health - 5;
            if (health < 0) {
                health = 0;
            }
            jaguar.setHealth(health);
        }

    }
}
