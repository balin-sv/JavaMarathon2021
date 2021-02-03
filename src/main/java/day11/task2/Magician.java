package day11.task2;

public class Magician extends Hero implements interfaceMagicAttack, interfacePhysAttack {

    private int health;
    private final double physDef;
    private final double magicDef;
    private final int physAtt;
    private final String name;
    private final int magicAtt;

    public Magician() {
        this.name = "Magician";
        this.health = 100;
        this.physDef = 0.0;
        this.magicDef = 0.8;
        this.physAtt = 5;
        this.magicAtt = 20;

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
    public int getMagicAtt() {
        return magicAtt;
    }

    @Override
    public String toString() {
        return name + "{health=" + health + "}";
    }

    @Override
    public Hero magicalAttack(Hero hero) {
        int aux = (int) (magicAtt - magicAtt * hero.getMagicDef());

        if (hero.getHealth() >= aux) {
            hero.setHealth(hero.getHealth() - aux);
        } else {
            hero.setHealth(0);
        }
        return hero;
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

}
