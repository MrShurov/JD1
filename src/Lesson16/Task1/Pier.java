package Lesson16.Task1;

public class Pier {
    private static Integer amountContainersStorehouse = 0;


    public static void main(String[] args) {
        Ship ship1 = new Ship(10, 10, "Victory");
        Ship ship2 = new Ship(0, 10, "Defeat");
        Ship ship3 = new Ship(10, 17, "Java");
        Ship ship4 = new Ship(0, 5, "JavaScript");
        new Thread(() -> {
            synchronized (amountContainersStorehouse) {
                functionalPier(ship1);
            }
        }).start();
        new Thread(() -> {
            synchronized (amountContainersStorehouse) {
                functionalPier(ship2);
            }
        }).start();
        new Thread(() -> {
            synchronized (amountContainersStorehouse) {
                functionalPier(ship3);
            }
        }).start();
        new Thread(() -> {
            synchronized (amountContainersStorehouse) {
                functionalPier(ship4);
            }
        }).start();
    }

    static void unload(Ship ship) {
        amountContainersStorehouse += ship.container;
        ship.container = 0;
    }

    private static void submerge(Ship ship) {
        if (amountContainersStorehouse > ship.capacity) {
            ship.container = ship.capacity;
            amountContainersStorehouse -= ship.container;
        } else {
            ship.container = amountContainersStorehouse;
            amountContainersStorehouse -= ship.container;
        }
    }

    private static void functionalPier(Ship ship) {
        System.out.println(ship.name + " прибыл к причалу");
        System.out.println("Количество контейнеров на корабле " + ship.name + " " + ship.container);
        if (ship.container == 0) {
            submerge(ship);
        } else {
            unload(ship);
        }
        System.out.println(ship.name + " покинул причал");
        System.out.println("В порту осталось " + amountContainersStorehouse + " контейнеров");
        System.out.println("Количество контейнеров на корабле " + ship.name + " " + ship.container);
    }
}
