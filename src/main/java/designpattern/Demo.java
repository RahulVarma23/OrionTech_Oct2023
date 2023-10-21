package designpattern;

public class Demo {

    private static Demo demo=null;

    private Demo() {

    }

    void m1() {
        System.out.println("m1");
    }

    void m2() {
        System.out.println("m2");
    }

    public static Demo getInstance() {
        if (demo == null) {
           demo = new Demo();
        }
        return demo;
    }


}
