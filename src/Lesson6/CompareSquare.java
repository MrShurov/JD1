package Lesson6;

public class CompareSquare {

    CompareSquare(){

    }

    public static void CompareSquare(Figure figure, Figure figure1){
        if ( figure.getSquare() == figure1.getSquare()){
            System.out.println("Площади " + figure.getName() + " и " + figure1.getName() + " равны " + figure.getSquare() + " и равны между собой");
        } else{
            System.out.println("Площади не равны");
        }
    }
}
