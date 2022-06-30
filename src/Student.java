public class Student {
    public String name;       // 8 Bt
    public int age;           // 4 Bt
    public double mark;        // 6 Bt
    public boolean alive;       // 4Bt

    public Student(){
        name = "no name";
        age = 16;
        mark = 4;
        alive = true;

    }

    public String getInfo(){
        return  name + ": = " + age
                + ", mark = " + mark
                + ", is alive = " + (alive ? "yes" : "no");
    }

}
