package day11.task2;

public class Hero {

    private int health;

    private final double physDef;
    private final double magicDef;
    private final int physAtt;
    private final int magicAtt;
    private final String name;

    public Hero() {
        this.health = 0;
        this.physDef = 0;
        this.magicDef = 0;
        this.physAtt = 0;
        this.magicAtt = 0;
        this.name = "";
    }

    public double getPhysDef() {
        return physDef;
    }

    public double getMagicDef() {
        return magicDef;
    }

    public int getPhysAtt() {
        return physAtt;
    }

    public int getMagicAtt() {
        return magicAtt;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    @Override
    public String toString() {
        return getName() + "{health=" + getHealth() + "}";
    }

}
