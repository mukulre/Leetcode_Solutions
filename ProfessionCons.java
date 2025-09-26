class Person{
    String name;
    int age;
    static final String Profession = "Acting";
    
    Person(String a,int b){
        name = a;
        age = b;
    }
    void display(){
        System.out.println("Name is"+name+"age is"+age+"profession is"+Profession);
    }
}
public class Main{
    public static void main(String[] args){
        String[] names={"Vijay","Anu","Biru"};
        int[] age = {40,34,56};
        Person[] p = new Person[3];
        for(int i=0;i<names.length;i++){
        p[i]=new Person(names[i],age[i]);
        p[i].display();
    }
    }
}