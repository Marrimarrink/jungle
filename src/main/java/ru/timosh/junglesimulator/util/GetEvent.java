package ru.timosh.junglesimulator.util;

import ru.timosh.junglesimulator.model.Jaguar;

public class GetEvent {
    //0 -30 30 % Ягуар поспал + 30 энергии, +20 здоровья (сделано)
    //30 -35 5%ягуар поиграл - 4 энергии (сделано)
    //35 -45 10%сидел в засаде -1 энергия (сделано)
    //45 - 50 5%плавал - 3 энергии (сделано)
    //50 -60 10%пил воду +2  здоровье (сделано)
    //60 - 65 5%ягуар  съел оленя -15 энергия, + 4 здоровья (сделано)
    //65 - 75 10%ягуар  съел рыбу -2 энергия +1здоровье (сделано)
    //75 - 80 5%ягуар отдыхал на дереве +10 энергии + 5 здоровья (сделано)
    //80 - 90 10%ягуар пробежал - 7 энергии (сделано)
    //90- 95 5% на ягуара напала змея - 5 здоровья -10 энергии (сделано)
    //95 - 100 5%на ягуара напал охотник -20 здоровья - 7 энергии (сделано)
    //энергия =  0 - 5 здоровья (сделано)

    public  void  activateEvent(Jaguar jaguar) {

        while (checkStatus(jaguar)) {
            int eventNumber = (int) (Math.random() * 100);
            if (eventNumber >= 0 && eventNumber < 30){
                sleepEvent(jaguar);
            } else if (eventNumber >= 30 && eventNumber < 35){
                playEvent(jaguar);
            } else  if (eventNumber >= 35 && eventNumber < 45){
                waitEvent(jaguar);
            } else  if (eventNumber >= 45 && eventNumber < 50){
                swimEvent(jaguar);
            } else  if (eventNumber >= 50 && eventNumber < 60){
                drinkEvent(jaguar);
            } else if (eventNumber >= 60 && eventNumber < 65){
                eatLargeEvent(jaguar);
            } else  if (eventNumber >= 65 && eventNumber < 75){
                eatSmallEvent(jaguar);
            } else if (eventNumber >= 75 && eventNumber < 80){
                snoozeEvent(jaguar);
            } else if (eventNumber >= 80 && eventNumber < 90){
                runEvent(jaguar);
            } else if (eventNumber >= 90 && eventNumber < 95){
                attackedSnakeEvent(jaguar);
            } else if (eventNumber >= 95 && eventNumber < 100){
                attackedHunterEvent(jaguar);
            }
        }
        System.out.println("Ой, ягуар умер :( Симуляция завершена");
    }

    private void sleepEvent(Jaguar jaguar){
        int energy = Jaguar.getEnergy();
        int health = Jaguar.getHealth();

        energy = energy + 30;
        if(energy > 100){
            energy = 100;
        }
        health = health + 20;
        if(health > 100){
            health = 100;
        }
        Jaguar.setEnergy(energy);
        Jaguar.setHealth(health);
        Jaguar.energyCheker(jaguar);

        System.out.println("Ягуар хорошенько выспался! Текущая энергия: " + Jaguar.getEnergy() + "Текущее здоровье: " + Jaguar.getHealth());
    }

    private void playEvent(Jaguar jaguar){
        int energy = Jaguar.getEnergy();

        energy = energy - 4;
        if(energy < 0){
            energy = 0;
        }
        Jaguar.setEnergy(energy);
        Jaguar.energyCheker(jaguar);

        System.out.println("Ягуар поиграл и отлично повеселился! Текущая энергия: " + Jaguar.getEnergy());
    }
    private void waitEvent(Jaguar jaguar){
        int energy = Jaguar.getEnergy();

        energy = energy - 1;
        if(energy < 0){
            energy = 0;
        }
        Jaguar.setEnergy(energy);
        Jaguar.energyCheker(jaguar);

        System.out.println("Ягуар притаился в засаде! Текущая энергия: " + Jaguar.getEnergy());
    }

    private void swimEvent(Jaguar jaguar){
        int energy = Jaguar.getEnergy();

        energy = energy - 3;
        if(energy < 0){
            energy = 0;
        }
        Jaguar.setEnergy(energy);
        Jaguar.energyCheker(jaguar);

        System.out.println("Ягуар переплывал реку! Текущая энергия: " + Jaguar.getEnergy());
    }

    private void drinkEvent(Jaguar jaguar){
        int health = Jaguar.getHealth();

        health = health + 2;
        if(health > 100){
            health = 100;
        }
        Jaguar.setHealth(health);
        Jaguar.energyCheker(jaguar);

        System.out.println("Ягуар попил водичку! Текущее здоровье: " + Jaguar.getHealth());
    }

    private void eatLargeEvent(Jaguar jaguar){
        int energy = Jaguar.getEnergy();
        int health = Jaguar.getHealth();

        energy = energy - 15;
        if(energy < 0){
            energy = 0;
        }
        health = health + 4;
        if(health > 100){
            health = 100;
        }
        Jaguar.setEnergy(energy);
        Jaguar.setHealth(health);
        Jaguar.energyCheker(jaguar);

        System.out.println("Ягуар знатно обожрался тушкой оленя! Текущая энергия: " + Jaguar.getEnergy() + "Текущее здоровье: " + Jaguar.getHealth());
    }

    private void eatSmallEvent(Jaguar jaguar){
        int energy = Jaguar.getEnergy();
        int health = Jaguar.getHealth();

        energy = energy - 2;
        if(energy < 0){
            energy = 0;
        }
        health = health + 1;
        if(health > 100){
            health = 100;
        }
        Jaguar.setEnergy(energy);
        Jaguar.setHealth(health);
        Jaguar.energyCheker(jaguar);

        System.out.println("Ягуар перекусил рыбкой! Текущая энергия: " + Jaguar.getEnergy() + "Текущее здоровье: " + Jaguar.getHealth());
    }

    private void snoozeEvent(Jaguar jaguar){
        int energy = Jaguar.getEnergy();
        int health = Jaguar.getHealth();

        energy = energy + 10;
        if(energy > 100){
            energy = 100;
        }
        health = health + 5;
        if(health > 100){
            health = 100;
        }
        Jaguar.setEnergy(energy);
        Jaguar.setHealth(health);
        Jaguar.energyCheker(jaguar);

        System.out.println("Ягуар отдохнул на дереве! Текущая энергия: " + Jaguar.getEnergy() + "Текущее здоровье: " + Jaguar.getHealth());
    }

    private void runEvent(Jaguar jaguar){
        int energy = Jaguar.getEnergy();
        energy = energy - 7;
        if(energy < 0){
            energy = 0;
        }
        Jaguar.setEnergy(energy);
        Jaguar.energyCheker(jaguar);

        System.out.println("Ягуар бегал! Текущая энергия: " + Jaguar.getEnergy());
    }

//attacked by a snake and a hunter

    private void attackedSnakeEvent(Jaguar jaguar){
        int energy = Jaguar.getEnergy();
        int health = Jaguar.getHealth();
        energy = energy - 10;

        if(energy < 0){
            energy = 0;
        }
        health = health - 5;
        if(health < 0){
            health = 0;
        }
        Jaguar.setEnergy(energy);
        Jaguar.setHealth(health);
        Jaguar.energyCheker(jaguar);

        System.out.println("Ягуар вступил в схватку с анакондой! Текущая энергия: " + Jaguar.getEnergy() + "Текущее здоровье: " + Jaguar.getHealth());
    }

    //энергия =  0 - 5 здоровья (сделано)

    private void attackedHunterEvent(Jaguar jaguar){
        int energy = Jaguar.getEnergy();
        int health = Jaguar.getHealth();
        energy = energy - 7;

        if(energy < 0){
            energy = 0;
        }
        health = health - 20;
        if(health < 0){
            health = 0;
        }
        Jaguar.setEnergy(energy);
        Jaguar.setHealth(health);
        Jaguar.energyCheker(jaguar);

        System.out.println("Ягуар вступил в схватку с анакондой! Текущая энергия: " + Jaguar.getEnergy() + "Текущее здоровье: " + Jaguar.getHealth());
    }

    private boolean checkStatus(Jaguar jaguar){
        if (jaguar.getEnergy() <= 0) {
            return false;
        } else {
            return true;
        }
    }


    private static void checkEnergy(Jaguar jaguar){
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
