package Lesson7;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Calculator<T, V> {
    private T firstNumber;
    private V secondNumber;

    public <R, T1, T2> void getSummaNumbers(T firstNumber, V secondNumber){
        Double result;
        T1 number1;
        T2 number2;
        number1 = (T1.valueOf(firstNumber);
        number2 = (T2)(getSecondNumber());
        result = firstNumber + secondNumber;
    }

    public static void main(String[] args){
        Calculator calculator = new Calculator(12, 43);
        
    }
}
