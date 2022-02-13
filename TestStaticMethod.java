public class TestStaticMethod {
    public static void main(String[] args) {
        Student.changeMethod();
        Student stu1=new Student(1,"Loan");
        Student stu2=new Student(2,"Lac");
        Student stu3=new Student(3,"Long");
        Student stu4=new Student(4,"Quan");
        stu2.display();
        stu3.display();
        stu4.display();
    }
}
