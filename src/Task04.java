public class Task04 {
    public static void main(String[] args) {
        Student student1 = new Student(n:"Alex", a:20, m:10, al:true);


        Student student2 = new Student(student1);
        student2.name = student1.name;
        student2.age = student1.age;
        student2.mark = student1.mark;
        student2.alive = student1.alive;


        Student student3 = new Student(n:"Alex", a:20, m:10, al:true);
        student3.name = student1.name;
        student3.age = student1.age;
        student3.mark = student1.mark;
        student3.alive = student1.alive;


        Student student4 = new Student(n:"Alex", a:20, m:10, al:true);
        student4.name = student1.name;
        student4.age = student1.age;
        student4.mark = student1.mark;
        student4.alive = student1.alive;

    }
}
