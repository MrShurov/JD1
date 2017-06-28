package Lesson4;

import java.math.BigDecimal;
import java.util.Scanner;

public class Calculator {
    public BigDecimal numberBigFirst;
    public BigDecimal numberBigSecond;
    public Double numberFirst;
    public Double numberSecond;


    public static void main(String[] args) {
        BigDecimal a = new BigDecimal(0);
        BigDecimal b = new BigDecimal(0);
        Double c = new Double(0);
        Double d = new Double(0);
        int counter;
        Scanner in = new Scanner(System.in);
        System.out.println("1 - double/double; 2 - BigDecimal/double; 3 - double/BigDecimal; 4 - BigDecimal/BidDecimal");
        counter = in.nextInt();
        if (counter == 1) {
            System.out.println("Введите первое число:");
            c = in.nextDouble();
            System.out.println("Введите первое число:");
            d = in.nextDouble();
            Calculator task = new Calculator(c, d);
            task.getSummaNumbers(c, d);
            task.getQuotientNumber(c, d);
            task.getSubtractionNumber(c, d);
            task.getCompositionNumber(c, d);
        } else if (counter == 2) {
            System.out.println("Введите первое число:");
            a = in.nextBigDecimal();
            System.out.println("Введите первое число:");
            d = in.nextDouble();
            Calculator task = new Calculator(a, d);
            task.getSummaNumbers(a, d);
            task.getQuotientNumber();
            task.getSubtractionNumber();
            task.getCompositionNumber();
        } else if (counter == 3){
            System.out.println("Введите первое число:");
            d = in.nextDouble();
            System.out.println("Введите первое число:");
            a = in.nextBigDecimal();
            Calculator task = new Calculator(d, a);
            task.getSummaNumbers(d, a);
            task.getQuotientNumber();
            task.getSubtractionNumber();
            task.getCompositionNumber();
        } else if(counter == 4){
            System.out.println("Введите первое число:");
            a = in.nextBigDecimal();
            System.out.println("Введите первое число:");
            b = in.nextBigDecimal();
            Calculator task = new Calculator(a, b);
            task.getSummaNumbers(a, b);
            task.getQuotientNumber();
            task.getSubtractionNumber();
            task.getCompositionNumber();
        }
    }

    Calculator(BigDecimal numberBigFirst, BigDecimal numberBigSecond) {
        this.numberBigFirst = numberBigFirst;
        this.numberBigSecond = numberBigSecond;
    }

    Calculator(Double numberFirst, Double numberSecond){
        this.numberFirst = numberFirst;
        this.numberSecond = numberSecond;
    }

    Calculator(BigDecimal numberBigFirst, Double numberSecond){
        this.numberBigFirst = numberBigFirst;
        this.numberSecond = numberSecond;
    }

    Calculator(Double numberFirst, BigDecimal numberBigSecond){
        this.numberFirst = numberFirst;
        this.numberBigSecond = numberBigSecond;
    }

    public void getSummaNumbers(BigDecimal numberBigFirst, Double numberSecond) {
        BigDecimal summa;
        numberBigSecond = new BigDecimal(numberSecond);
        summa = numberBigFirst.add(numberBigSecond);
        System.out.println("Сумма: " + summa);
    }

    public void getSummaNumbers(BigDecimal numberBigFirst, BigDecimal numberBigSecond) {
        BigDecimal summa;
        summa = numberBigFirst.add(numberBigSecond);
        System.out.println("Сумма: " + summa);
    }

    public void getSummaNumbers(Double numberFirst, BigDecimal numberBigSecond) {
        BigDecimal summa;
        numberBigFirst = new BigDecimal(numberFirst);
        summa = numberBigFirst.add(numberBigSecond);
        System.out.println("Сумма: " + summa);
    }

    public void getSummaNumbers(Double numberFirst, Double numberSecond) {
        Double summa;
        summa = numberFirst + numberSecond;
        System.out.println("Сумма: " + summa);
    }

    public void getQuotientNumber(Double numberFirst, Double numberSecond) {
        Double quotient;
        quotient = numberFirst / numberSecond;
        System.out.println("Частное: " + quotient);
    }

    public void getQuotientNumber() {
        BigDecimal quotient;
        quotient = numberBigFirst.divide(numberBigSecond, BigDecimal.ROUND_UP);
        System.out.println("Частное: " + quotient);
    }

    public void getSubtractionNumber() {
        BigDecimal subtraction;
        subtraction = numberBigFirst.subtract(numberBigSecond);
        System.out.println("Разность: " + subtraction);
    }

    public void getSubtractionNumber(Double numberFirst, Double numberSecond) {
        Double subtraction;
        subtraction = numberFirst - numberSecond;
        System.out.println("Разность: " + subtraction);
    }

    public void getCompositionNumber() {
        BigDecimal composition;
        composition = numberBigFirst.multiply(numberBigSecond);
        System.out.println("Произведение: " + composition);
    }

    public void getCompositionNumber(Double numberFirst, Double numberSecond) {
        Double composition;
        composition = numberFirst * numberSecond;
        System.out.println("Произведение: " + composition);
    }
}
