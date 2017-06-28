package Lesson5;

public class Warrior extends Hero{
    Warrior(){
       super("Warrior", 150);
    }

    public int randomDamage() {
        int damage = 0;
        damage = 10 + (int) (Math.random() * 30);
        return damage;
    }

    public boolean isAlive(){
        boolean alive = true;
        if (health <= 0){
            alive = false;
        }
        return alive;
    }

    public void attackEnemy(Enemy enemy){
        System.out.println(getName() + " бьёт противника топором!");
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
