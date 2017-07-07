package Lesson7;

import lombok.Data;

@Data
public class Calculator<T, V> {
    private T firstNumber;
    private V secondNumber;
    int number1;
    double number2;
    int number3;
    double number4;

    Calculator(T firstNumber, V secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    public void convert(Calculator calculator) {
        if (firstNumber instanceof Double) {
            number2 = ((Double) firstNumber).doubleValue();
        } else {
            number1 = ((Integer) firstNumber).intValue();
        }
        if (secondNumber instanceof Double) {
            number4 = ((Double) secondNumber).doubleValue();
        } else {
            number3 = ((Integer) secondNumber).intValue();
        }
    }

    public void getSummaNumbers() {
        if(number1 != 0 && number4 !=0){
            System.out.println(number1 + number4);
        } else if(number1 != 0 && number3 != 0){
            System.out.println(number1 + number3);
        } else if(number2 != 0 && number4 != 0){
            System.out.println(number2 + number4);
        } else if (number2 != 0 && number3 !=0){
            System.out.println(number2 + number3);
        }
    }

    public void getQuotientNumber() {
        if(number1 != 0 && number4 !=0){
            System.out.println(number1 / number4);
        } else if(number1 != 0 && number3 != 0){
            System.out.println(number1 / number3);
        } else if(number2 != 0 && number4 != 0){
            System.out.println(number2 / number4);
        } else if (number2 != 0 && number3 !=0){
            System.out.println(number2 / number3);
        }
    }

    public void getSubtractionNumber() {
        if(number1 != 0 && number4 !=0){
            System.out.println(number1 * number4);
        } else if(number1 != 0 && number3 != 0){
            System.out.println(number1 * number3);
        } else if(number2 != 0 && number4 != 0){
            System.out.println(number2 * number4);
        } else if (number2 != 0 && number3 !=0){
            System.out.println(number2 * number3);
        }
    }

    public void getCompositionNumber() {
        if(number1 != 0 && number4 !=0){
            System.out.println(number1 - number4);
        } else if(number1 != 0 && number3 != 0){
            System.out.println(number1 - number3);
        } else if(number2 != 0 && number4 != 0){
            System.out.println(number2 - number4);
        } else if (number2 != 0 && number3 !=0){
            System.out.println(number2 - number3);
        }
    }

    public static void main(String[] args) {
        Calculator<Double, Integer> calculator = new Calculator<>(555.5, 55);
        calculator.convert(calculator);
        calculator.getSummaNumbers();
        calculator.getQuotientNumber();
        calculator.getSubtractionNumber();
        calculator.getCompositionNumber();
    }
}
