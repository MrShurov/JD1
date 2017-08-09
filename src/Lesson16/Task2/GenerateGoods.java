package Lesson16.Task2;

public class GenerateGoods {
    static Goods randomGood() {
        Goods good = null;
        int randomNumber;
        randomNumber = (int) (Math.random() * 11);
        switch (randomNumber) {
            case 0:
                good = Goods.BEER;
                break;
            case 1:
                good = Goods.BREAD;
                break;
            case 2:
                good = Goods.BUCKWHEAT;
                break;
            case 3:
                good = Goods.CHIPS;
                break;
            case 4:
                good = Goods.HERRING;
                break;
            case 5:
                good = Goods.KEFIR;
                break;
            case 6:
                good = Goods.LOAF;
                break;
            case 7:
                good = Goods.MILK;
                break;
            case 8:
                good = Goods.SAUSAGES;
                break;
            case 9:
                good = Goods.VODKA;
                break;
            case 10:
                good = Goods.YOGURT;
                break;
            default:
                System.out.println("Ошибка выбора продукта");
        }
        return good;
    }

    static int randomAmount() {
        return (int) (Math.random() * 20);
    }
}
