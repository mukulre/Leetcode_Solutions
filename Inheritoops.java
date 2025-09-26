
class Student
{
    String name;
    int age;
    static String dept = "AIDA";
    
    Student(String a,int b){
        name = a;
        age = b;
    }
    void display(){
        System.out.println("Name is"+name+" and age is "+age+"studying"+dept);
    }
}
public class Main{
    public static void main(String[] args){
        Student s1=new Student("VIRAT",36);
        Student s2=new Student("Vijay",27);
        Student s3=new Student("RIZWAN",33);
        s3.name="JOSHIKA";
        Student.dept="AIML";
        s1.display();
        s2.display();
        s3.display();
    }
}