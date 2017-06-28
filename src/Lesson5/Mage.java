package Lesson5;

public class Mage extends Hero {
    Mage() {
        super("Mage", 70);
    }

    public int randomDamage() {
        int damage = 0;
        damage = 20 + (int) (Math.random() * 50);
        return damage;
    }

    public boolean isAlive(){
        boolean alive = true;
        if (health <= 0){
            alive = false;
        }
        return alive;
    }

    public void attackEnemy(Enemy enemy) {
        System.out.println(getName() + " посылает огненный шар в противника!");
        enemy.takeDamage(randomDamage());
    }

    public void takeDamage(int damage){
        health -= damage;
        if(health > 0) {
            System.out.println(getName() + " получил " + damage + " урона!");
            System.out.println("Осталось " + health + " здоровья!");
        } else{
            System.out.println(getName() + " получил " + damage + " урона!");
            System.out.println("Вы мертвы!");
        }
    }
}
