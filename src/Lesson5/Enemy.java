package Lesson5;

public abstract class Enemy implements Mortal{
    private String name;
    public int health;

    Enemy(String name, int health){
        this.name = name;
        this.health = health;
    }

    public abstract boolean isAlive();

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public abstract int randomDamage();

    public abstract void takeDamage(int damage);

    public abstract void attackHero(Hero hero);
}
