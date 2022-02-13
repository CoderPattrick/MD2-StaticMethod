public class Student {
    private int id;
    private String name;
    private static String college = "CG";
    public Student(){
    }
    public Student(int id,String name){
        this.id=id;
        this.name=name;
    }
    public static void changeMethod(){
        college = "CodeGym";
    }
    public void display(){
        System.out.println(id + " " + name + " " + college);
    }
}
