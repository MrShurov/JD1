package Lesson5;

import java.util.Scanner;

public class BattleGround {

    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("1 - Воин; 2 - Лучник; 3 - Маг;");
        a = in.nextInt();
        if (a == 1) {
            Warrior hero = new Warrior();
            System.out.println("1 - Зомби; 2 - Разбойник;");
            b = in.nextInt();
            if (b == 1) {
                Zombie enemy = new Zombie();
                battle(hero, enemy);
            } else if (b == 2) {
                Robber enemy = new Robber();
                battle(hero, enemy);
            }
        } else if (a == 2) {
            Archer hero = new Archer();
            System.out.println("1 - Зомби; 2 - Разбойник;");
            b = in.nextInt();
            if (b == 1) {
                Zombie enemy = new Zombie();
                battle(hero, enemy);
            } else if (b == 2) {
                Robber enemy = new Robber();
                battle(hero, enemy);
            }
        } else if (a == 3) {
            Mage hero = new Mage();
            System.out.println("1 - Зомби; 2 - Разбойник;");
            b = in.nextInt();
            if (b == 1) {
                Zombie enemy = new Zombie();
                battle(hero, enemy);
            } else if (b == 2) {
                Robber enemy = new Robber();
                battle(hero, enemy);
            }
        }
    }

    public static void battle(Hero hero, Enemy enemy) {
        boolean loop = false;
        int counter = 0;
        do {
            counter++;
            System.out.println(counter + " Раунд:");
            if (hero.isAlive() == true) {
                hero.attackEnemy(enemy);
            }
            if (enemy.isAlive() == true) {
                enemy.attackHero(hero);
            }
            if (enemy.isAlive() == false || hero.isAlive() == false) {
                loop = true;
            }
        } while (loop == false);
    }
}



