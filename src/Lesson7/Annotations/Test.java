package Lesson7.Annotations;

public class Test {
    public static void main(String[] args){
        testAnnotation();
    }

    @Transaction
    public static void testAnnotation(){
        System.out.println("It's work");
    }
}
