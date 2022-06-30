public class Student {
    public String name;       // 8 Bt
    public int age;           // 4 Bt
    public double mark = 4;        // 6 Bt
    public boolean alive;       // 4Bt

    public Student(){
        name = "no name";
        age = 16;
        mark = 4;
        alive = true;

    }
    public Student(String n, int a, double m, double al) {
        name = n;
        age = a;
        mark = m;
        alive = al;
    }

    public Student(Student student) {
        name = student.name;
        age = student.age;
        mark = student.mark;
        alive = student.alive;


            }
    public String getInfo(){
        return  name + ": = " + age
                + ", mark = " + mark
                + ", is alive = " + (alive ? "yes" : "no");
    }

}
