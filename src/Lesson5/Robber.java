package Lesson5;

public class Robber extends Enemy{
    Robber(){
        super("Robber", 100);
    }

    public boolean isAlive() {
        boolean alive = true;
        if (health <= 0) {
            alive = false;
        }
        return alive;
    }

    public int randomDamage() {
        int damage = 0;
        damage = 10 + (int) (Math.random() * 30);
        return damage;
    }

    public void takeDamage(int damage) {
        health -= damage;
        if (health > 0) {
            System.out.println(getName() + " получил " + damage + " урона!");
            System.out.println("Осталось " + health + " здоровья!");
        } else {
            System.out.println(getName() + " получил " + damage + " урона!");
            System.out.println("Враг мертв!");
        }
    }

    public void attackHero(Hero hero) {
        System.out.println(getName() + " бьёт противника!");
        hero.takeDamage(randomDamage());
    }

}
