package Adapter;

public class Ligtbulb {

    boolean poweredOn = false;
    int voltage = 0;

    public  void turnOn (int voltage){
        poweredOn = true;
        this.voltage = voltage;

        System.out.println("Lightbulb poweredOn with " + voltage + " of current");
    }

    public void turnOff(){
        poweredOn = false;
        voltage = 0;

        System.out.println(" Lightbulb powereOff with ");
    }
    public  boolean isPoweredOn(){
        return poweredOn;
    }
}
