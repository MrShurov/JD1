package Lesson5;

public class Archer extends Hero {
    Archer() {
        super("Archer", 80);
    }

    public int randomDamage() {
        int damage = 0;
        damage = 15 + (int) (Math.random() * 45);
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
        System.out.println(getName() + " стреляет в противника!");
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
