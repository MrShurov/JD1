package Lesson7.Annotations;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.text.Annotation;

public class ClassAnalyzer {

    public void analyze(Object obj) {
        getFields(obj);
        getConstructor(obj);
        getMethods(obj);

    }

    public void analyze(Class clazz){
        getFields(clazz);
        getMethods(clazz);
        getConstructor(clazz);
    }

    private void getFields(Class clazz) {
        try {
            Field[] Fields = clazz.getDeclaredFields();
            for (Field field : Fields) {
                Class fieldType = field.getType();
                System.out.println("Имя: " + field.getName());
                System.out.println("Тип: " + fieldType.getName());
            }

        } catch (Exception e) {
            System.out.println("Error");
        }
    }

    private void getFields(Object obj) {
        try {
            Class c = obj.getClass();
            Field[] Fields = c.getDeclaredFields();
            for (Field field : Fields) {
                Class fieldType = field.getType();
                System.out.println("Имя: " + field.getName());
                System.out.println("Тип: " + fieldType.getName());
            }

        } catch (Exception e) {
            System.out.println("Error");
        }
    }

    private void getConstructor(Class clazz) {
        try {
            Constructor[] constructors = clazz.getDeclaredConstructors();
            for (Constructor constructor : constructors) {
                Class[] paramTypes = constructor.getParameterTypes();
                System.out.print("Поля конструктора: ");
                for (Class paramType : paramTypes) {
                    System.out.print(paramType.getName() + " ");
                }

                System.out.println();
            }
        } catch (Exception e) {
            System.out.println("Error");
        }
    }

    private void getConstructor(Object obj) {
        try {
            Class c = obj.getClass();
            Constructor[] constructors = c.getDeclaredConstructors();
            for (Constructor constructor : constructors) {
                Class[] paramTypes = constructor.getParameterTypes();
                System.out.print("Поля конструктора: ");
                for (Class paramType : paramTypes) {
                    System.out.print(paramType.getName() + " ");
                }

                System.out.println();
            }
        } catch (Exception e) {
            System.out.println("Error");
        }
    }

    private void getMethods(Class clazz) {
        try {
            Class c = clazz.getClass();
            Method[] methods = c.getDeclaredMethods();
            for (Method method : methods) {
                System.out.println("Метод: " + method.getName());
            }
        } catch (Exception e) {
            System.out.println("Error");
        }
    }

    private void getMethods(Object obj) {
        try {
            Class c = obj.getClass();
            Method[] methods = c.getDeclaredMethods();
            for (Method method : methods) {
                //Annotation[] annotation = method.getAnnotation();
                System.out.println("Метод: " + method.getName());
            }
        } catch (Exception e) {
            System.out.println("Error");
        }
    }
}
