package test_junit;

public class CoverageTest {

    public CoverageTest() {}


    public static int  add(int x, int y){
        int c = 0;
        if(x == 10){
            c = x + y;
        }else{
            c = (x + y)*2;
        }
        return c;
    }

    public static int  minus(int x, int y){
        return x-y;
    }
}