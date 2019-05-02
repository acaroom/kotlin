package chap03.section1;

public class VarargsTest {

    public static void main(String[] args) {
        varargsParam(1, 2, 3, 4);
    }

    public static void varargsParam(int... ts){
        for(int t: ts){
            System.out.println(t);
        }
    }
}

