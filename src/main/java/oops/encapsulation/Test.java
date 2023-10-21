package oops.encapsulation;

public class Test {

    public static void main(String[] args) {
        Student s= new Student();
        System.out.println(s.getAge());
        s.setAge(20);
        System.out.println(s.getAge());

    }
}
