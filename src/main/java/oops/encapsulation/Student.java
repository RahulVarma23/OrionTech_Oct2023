package oops.encapsulation;

//Binding of data members and functions within single entity is called as encapsulation
//java provides default encapsulation
//It is used for data hiding
//I can be achieved by making data member (variables) as private and getter , setters as public
public class Student {
    private int age =10;
    private String name ="ornkjnf";

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
       this.age=age;
    }

    public void print() {
        System.out.println(name+" ->" + age);
    }

    public static void main(String[] args) {
        Student s = new Student();
        s.print();
    }
}
