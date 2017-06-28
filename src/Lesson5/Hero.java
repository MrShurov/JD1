package Lesson5;

public abstract class Hero implements Mortal {
    private String name;
    public int health;

    Hero(String name, int health){
        this.name = name;
        this.health = health;
    }

    public String getName() {
        return name;
    }


    public abstract void attackEnemy(Enemy enemy);

    public abstract void takeDamage(int damage);
}
