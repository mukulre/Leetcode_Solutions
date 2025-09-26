import java.util.ArrayList;
public class MyArrayList {
    public static void main(String[] args){
        ArrayList<Integer> arrList = new ArrayList<>();
        arrList.add(10);
        arrList.add(20);
        arrList.add(30);
        arrList.add(40);
        arrList.add(110);
        arrList.add(13);

        System.out.print(arrList+ " ");

        System.out.println();

        arrList.set(2,55);
        System.out.print(arrList + " ");
        System.out.println();

        arrList.remove(2);
        System.out.print(arrList+" ");
        System.out.println();

        arrList.remove(Integer.valueOf(50));
        System.out.print(arrList+" ");

        System.out.println(arrList.contains(20));
        System.out.println(arrList.contains(50));
        System.out.println(arrList.indexOf(40));
    }    
}