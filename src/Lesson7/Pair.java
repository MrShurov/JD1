package Lesson7;

class Pair<K, V>{
    private K parametr1;
    private V parametr2;

    Pair(K parametr1, V parametr2){
        this.parametr1 = parametr1;
        this.parametr2 = parametr2;
    }

    public K getParametr1(){
        return parametr1;
    }

    public V getParametr2(){
        return parametr2;
    }

    public void setParametr1(K parametr1){
        this.parametr1 = parametr1;
    }

    public void setParametr2(V parametr2){
        this.parametr2 = parametr2;
    }

    public static void main(String args[])
    {
        PairUtil util = new PairUtil();
        Pair<Integer, Double> pair = new Pair<>(23, 23.2);
        System.out.println(pair.getParametr1() + " " + pair.getParametr2());
        util.swaper(pair);
        System.out.println(pair.getParametr1() + " " + pair.getParametr2());
    }
}

