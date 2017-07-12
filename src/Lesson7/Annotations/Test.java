package Lesson7.Annotations;

import org.apache.log4j.Logger;

import java.lang.reflect.Method;

public class Test {
    private static final Logger log = Logger.getLogger(Test.class);

    public static void main(String[] args) {
        Test test = new Test();
        test.testAnnotation();
    }

    @Transaction
    public void testAnnotation() {
        try {
            Class c = this.getClass();
            Method m = c.getMethod("testAnnotation");
            Transaction demo = m.getAnnotation(Transaction.class);
            System.out.println(demo.start());
            System.out.println(demo.finish());
        } catch(NoSuchMethodException e){
            System.out.println("Метод не найден");
            log.info(e, e);
        }
    }
}
