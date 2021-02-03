package day11.task2;

public class Warrior extends Hero implements interfacePhysAttack {

    private int health;
    private final double physDef;
    private final double magicDef;
    private final int physAtt;
    private final String name;

    public Warrior() {
        this.name = "Warrior";
        this.health = 100;
        this.physDef = 0.8;
        this.magicDef = 0.0;
        this.physAtt = 30;
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
}
