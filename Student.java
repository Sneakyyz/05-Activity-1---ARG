public class Student {
    private String name;
    private int age;
    
    public Student() {
        name = "No name yet.";
        age = 0;
    }
    
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public static void main(String[] args) {
        Student student1 = new Student();
        System.out.println(student1.name + ", " + student1.age);
        student1.name = "John Mark Salac";
        student1.age = 19;
        System.out.println(student1.name + ", " + student1.age);
        Student student2 = new Student("JM Salac", 20);
        System.out.println(student2.name + ", " + student2.age);
    }
}