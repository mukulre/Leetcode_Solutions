abstract class EDevice
{
	abstract void powerOn();
		void displayInfo(){
		    System.out.println("this is an electronic Device");
		}
}
class Smartphone extends EDevice{
    void powerOn(){
        System.out.println("Smartphone is powering on");
    }
}
public class Main{
    public static void main(String[] args){
        EDevice device = new Smartphone();
        device.powerOn();
        device.displayInfo();
    }
}