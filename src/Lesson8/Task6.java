package Lesson8;

import com.sun.xml.internal.ws.binding.FeatureListUtil;

import javax.swing.plaf.ListUI;
import java.util.ArrayList;

public class Task6 {
    public static void main(String[] args){
        int i = 0;
        ArrayList<Integer> A = new ArrayList<>();
        while(i < 10){
            A.add(i);
            i++;
        }
        ArrayList<Integer> B = new ArrayList<>();
        B.add(0);
        B.add(3);
        B.add(3);
        B.add(2);
        B.add(5);
        B.add(6);
        B.add(7);
        B.add(9);
        B.add(8);
        B.add(9);
        compare(A, B);
        merger(A, B);
    }

    static void compare(ArrayList a, ArrayList b){
        for(int i = 0; i < a.size(); i++){
            if(a.get(i) == b.get(i)){
                System.out.println("элементы под номером " + i + " равны " + a.get(i));
            }
        }
    }

    static ArrayList<Integer> merger(ArrayList a, ArrayList b){
        ArrayList<Integer> listAB = new ArrayList<>(a);
        listAB.addAll(b);
        System.out.println("listA : "  + a);
        System.out.println("listB : "  + b);
        System.out.println("listAB : " + listAB);
        return listAB;
    }
}
