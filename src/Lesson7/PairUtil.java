package Lesson7;

public final class PairUtil {

    public static <T1, T2> Pair swaper(Pair pair) {
        T1 swap1;
        T2 swap2;
        swap1 = (T1)pair.getParametr1();
        swap2 = (T2)pair.getParametr2();
        pair.setParametr1(swap2);
        pair.setParametr2(swap1);
        return pair;
    }
}
