package Lesson16.Task2;

import java.util.concurrent.Semaphore;

import static Lesson16.Task2.GenerateGoods.randomAmount;
import static Lesson16.Task2.GenerateGoods.randomGood;

public class Shop {
    private static Integer counterCustomer = 1;
    private static final int MAX_AVAILABLE = 3;
    private final static Semaphore semaphore = new Semaphore(MAX_AVAILABLE, true);

    public static void main(String[] args) {
        Customer customer = new Customer();
        Customer customer1 = new Customer();
        Customer customer2 = new Customer();
        Customer customer3 = new Customer();
        Customer customer4 = new Customer();
        Thread t1 = new Thread() {
            public void run() {
                int numberCustomer = enterShop();
                productSelection(customer, numberCustomer);
                endingShopping(customer, numberCustomer);
            }
        };
        Thread t2 = new Thread() {
            public void run() {
                int numberCustomer = enterShop();
                productSelection(customer1, numberCustomer);
                endingShopping(customer, numberCustomer);
            }
        };
        Thread t3 = new Thread() {
            public void run() {
                int numberCustomer = enterShop();
                productSelection(customer2, numberCustomer);
                endingShopping(customer, numberCustomer);
            }
        };
        Thread t4 = new Thread() {
            public void run() {
                int numberCustomer = enterShop();
                productSelection(customer3, numberCustomer);
                endingShopping(customer, numberCustomer);
            }
        };
        Thread t5 = new Thread() {
            public void run() {
                int numberCustomer = enterShop();
                productSelection(customer4, numberCustomer);
                endingShopping(customer, numberCustomer);
            }
        };
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }

    synchronized private static int enterShop() {
        int numberCustomer = counterCustomer;
        counterCustomer++;
        System.out.println("Покупатеть № " + numberCustomer + " вошел в магазин");
        return numberCustomer;
    }

    private static void productSelection(Customer customer, int numberCustomer) {
        int counter = 0;
        int amount = randomAmount();
        Goods good;
        if (amount == 0) {
            System.out.println("Покупатеть № " + numberCustomer + " вышел из магазина без покупок");
            Thread.interrupted();
        } else {
            while (counter <= amount) {
                good = randomGood();
                customer.shoppingBasket.add(good);
                System.out.println("Покупатеть № " + numberCustomer + " положил в корзину " + good.name());
                try {
                    Thread.sleep(0);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                counter++;
            }
            System.out.println("Покупатеть № " + numberCustomer + " встал в очередь");
        }
    }

    private static void payment(Customer customer, int numberCustomer) {
        long time = customer.shoppingBasket.size() * 500;
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Покупатеть № " + numberCustomer + " купил " + customer.shoppingBasket.size() + " продуктов");
        System.out.println("Покупатеть № " + numberCustomer + " вышел из магазина");
    }

    private static void endingShopping(Customer customer, int numberCustomer) {
        try {
            semaphore.acquire();
            System.out.println("Покупатеть № " + numberCustomer + " был принят кассиром");

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        payment(customer, numberCustomer);
        semaphore.release();
    }
}
