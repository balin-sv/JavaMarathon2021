package day11.task2;

public class Shaman extends Hero implements interfaceHealer, interfaceMagicAttack, interfacePhysAttack {

    private int health;
    private final double physDef;
    private final double magicDef;
    private final int physAtt;
    private final int magicAtt;
    private final String name;

    public Shaman() {
        this.name = "Shaman";
        this.health = 100;
        this.physDef = 0.2;
        this.magicDef = 0.2;
        this.physAtt = 10;
        this.magicAtt = 15;
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
    public void healHimself() {
        int aux = getHealth() + 50;
        if (aux <= 100) {
            setHealth(aux);
        } else {
            setHealth(100);
        }

    }

    @Override
    public Hero healTeammate(Hero hero) {
        int aux = hero.getHealth() + 30;

        if (aux <= 100) {
            hero.setHealth(aux);
        } else {
            hero.setHealth(100);
        }
        return hero;

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
