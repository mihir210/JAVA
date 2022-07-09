

public class tut38_class_oop {
    static  class Employee{
        private int id;
        private String name;
        public void display(){
            id = 1;
            name = "mihir";
            System.out.println("my name is "+ name + " my id is " + id);
        }
    }
    public static void main(String[] args) {
        Employee obj1 = new Employee();

        obj1.display();
    }
}
