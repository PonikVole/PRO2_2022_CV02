package models;

public final class MyMathClass {
    public static final double pi = 3.14;           //static dovoluje použít proměnné či metody v ostatních třídách bez vyvolání této třídy

    private MyMathClass(){

    }
    public static int sum(int a, int b){
        return a + b;
    }

}
