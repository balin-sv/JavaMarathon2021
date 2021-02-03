package day11.task2;

public class Paladin extends Hero implements interfacePhysAttack, interfaceHealer {

    private int health;
    private final double physDef;
    private final double magicDef;
    private final int physAtt;
    private final String name;

    public Paladin() {
        this.name = "Paladin";
        this.health = 100;
        this.physDef = 0.5;
        this.magicDef = 0.2;
        this.physAtt = 15;
    }

    @Override
    public int getHealth() {
        return health;
    }

    @Override
    public void setHealth(int health) {
        this.health = health;
    }

    @Override
    public double getPhysDef() {
        return physDef;
    }

    @Override
    public double getMagicDef() {
        return magicDef;
    }

    @Override
    public int getPhysAtt() {
        return physAtt;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return getName() + "{health=" + getHealth() + "}";
    }

    @Override
    public Hero physicalAttack(Hero hero) {

        int aux = (int) (physAtt - physAtt * hero.getPhysDef());

        if (hero.getHealth() >= aux) {
            hero.setHealth(hero.getHealth() - aux);
        } else {
            hero.setHealth(0);
        }
        return hero;

    }

    @Override
    public void healHimself() {
        int aux = getHealth() + 25;
        if (aux <= 100) {
            setHealth(aux);
        } else {
            setHealth(100);
        }

    }

    @Override
    public Hero healTeammate(Hero hero) {
        int aux = hero.getHealth() + 10;

        if (aux <= 100) {
            hero.setHealth(aux);
        } else {
            hero.setHealth(100);
        }
        return hero;

    }

}
