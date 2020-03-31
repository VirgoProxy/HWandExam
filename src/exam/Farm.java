package exam;

public class Farm{
    protected boolean[] isOnFarm = new boolean[10];
    protected boolean[] isInForest = new boolean[3];
    protected boolean[] ableToEat = new boolean[10];
    protected int marker = 0;
    Farmer farmer = new Farmer();
    Pets[] pets = new Pets[10];
    Wild[] wild = new Wild[3];
    int p, w, f, r;
    int day = 1;

    public void addPets(Cat cat, Chicken chicken, Cow cow, Rabbit rabbit) {
        for (int i = 0; i < pets.length; i++) {
            r = (int)(Math.random() * 4 - 0.01);
            if(r == 0 && pets[i] == null){
                pets[i] = cat;
            }
            if(r == 1 && pets[i] == null){
                pets[i] = chicken;
            }
            if(r == 2 && pets[i] == null){
                pets[i] = cow;
            }
            if(r == 3 && pets[i] == null){
                pets[i] = rabbit;
            }
        }
    }

    public void addWild(Wolf wolf, Fox fox, Bear bear) {
        for (int i = 0; i < wild.length; i++) {
            if(i == 0){
                wild[i] = wolf;
            }
            if(i == 1){
                wild[i] = fox;
            }
            if(i == 2){
                wild[i] = bear;
            }
        }
    }


    public boolean[] getIsInForest() {
        return isInForest;
    }

    public void setIsInForest(boolean[] isInForest) {
        for (int i = 0; i < wild.length; i++) {
            if(wild[i].kickedAway < 4) {
                isInForest[i] = true;
            }
            else {
                isInForest[i] = false;
            }
        }
    }

    public boolean[] getIsOnFarm() {
        return isOnFarm;
    }

    public void setIsOnFarm(boolean[] isOnFarm) {
        for (int i = 0; i < pets.length; i++) {
            if (pets[i].hp > 0 || pets[i].hp == pets[i].maxHP) {
                isOnFarm[i] = true;
            }
            else {
                isOnFarm[i] = false;
            }
        }
    }

    public boolean[] getAbleToEat() {
        return ableToEat;
    }

    public void setAbleToEat(boolean[] ableToEat) {
        for (int i = 0; i < pets.length; i++) {
            if(pets[i].name.equals("Cow") || pets[i].name.equals("Chicken")){
                ableToEat[i] = true;
            }
        }
    }

    public void passDay() {
        while (marker == 0) {
            System.out.println("День " + day + " начался.");
            for (int i = 0; i < pets.length; i++) {
                if (isOnFarm[i] && pets[i] instanceof GiveRes) {
                    farmer.resources += pets[i].resources;
                }
            }
            w = (int)(Math.random() * 10);
            if(w <= 2) {
                f = (int)(Math.random() * 100);
                p = (int)(Math.random() * 10);
                if(isOnFarm[p] = false){
                    System.out.println("Хищник не нашел добычи");
                }
                else if (f >= 50) {
                    wild[w].kickedAway += 1;
                }
                else if(pets[p].speed > wild[w].speed) {
                    pets[p].run();
                }
                else {
                    for(int i = pets[p].hp; i >= 0; i -= wild[w].strength) {
                        f = (int)(Math.random() * 100);
                        if(i == 0) {
                            pets[p].eaten();
                        }
                        else if (f >= 80) {
                            wild[w].kickedAway += 1;
                            pets[p].hp = i;
                            pets[p].run();
                        }
                        pets[p].hp = i;
                    }
                }
                if(wild[w].kickedAway == 3) {
                    isInForest[w] = false;
                }
            }
            for (int i = 0; i < pets.length; i++) {
                if (pets[i].hp != pets[i].maxHP && isOnFarm[i]) {
                    pets[i].hp++;
                }
            }
            if (farmer.resources <= 1) {
                for (int i = 0; i < pets.length; i++) {
                    if (isOnFarm[i] == true && ableToEat[i]) {
                        pets[i].weight += farmer.resources;
                        pets[i].hp = 0;
                        isOnFarm[i] = false;
                    }
                }
            }
            if (farmer.resources <= 1) {
                marker += 1;
                System.out.println("Game over!");
            }
            if(isInForest == new boolean[] {false, false, false}){
                System.out.println("You win!");
            }
            farmer.resources -= 2;
            System.out.println(farmer.resources);
            day++;
        }
    }

    public Farmer getFarmer() {
        return farmer;
    }

    public void setFarmer(Farmer farmer) {
        this.farmer = farmer;
    }

    public Pets[] getPets() {
        return pets;
    }

    public void setPets(Pets[] pets) {
        this.pets = pets;
    }

}
