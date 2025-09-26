class Animal{
    public void sound(){
    System.out.println("All animals make noise");   
    }
}
class Main{
    public static void main(String[] args){
        Animal vag = new Animal();
        Animal cat = new Animal();
        cat.sound();
        vag.sound();
    }
}3