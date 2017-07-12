package Lesson7.Annotations;

import Lesson4.ATM;

public class Demo {

    public static void main(String[] args){
        Date date = new Date(40, 34, 54);
        ClassAnalyzer an = new ClassAnalyzer();
        an.analyze(date);
    }
}
