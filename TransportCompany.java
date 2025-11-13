import java.util.*;
interface Vehicle{
    void drive(double Distance);
    void displayStatus(String m, int ID);
}

class ElectricVehicle implements Vehicle{
    int batterylevel=100;
    public void drive(double Distance){
        if (batterylevel - (int)(Distance*0.25)<=0){
            System.out.println("Battery too low to drive");
            return;
        }
        batterylevel = batterylevel - (int)(Distance*0.25);
        System.out.println("You drove: "+ Distance +" kms, Battery:"+batterylevel+"% is left");
    }
    public void displayStatus(String m, int ID){
        System.out.println("You are driving "+m+" with ID "+ ID + " and battery level "+batterylevel);
    }
    public void recharge(){
        batterylevel=100;
    }
}

class FuelVehicle implements Vehicle{
    int fuellevel=100;
    public void drive(double Distance){
        if (fuellevel - (int)(Distance*0.10)<=0){
            System.out.println("Fuel too low to drive");
            return;
        }
        fuellevel = fuellevel - (int)(Distance*0.10);
        System.out.println("You drove: "+ Distance +" kms, Fuel: "+fuellevel+" % is left");
    }
    public void displayStatus(String m, int ID){
        System.out.println("You are driving "+m+" with ID "+ ID + " and fuel level "+fuellevel);
    }
    public void refuel(){
        fuellevel=100;
    }
}


public class TransportCompany{
    public static void main(String[] args) {
        int i=-1;
        int ID=-1;
        String model="\0";
        String type="\0";
        double dist;
        Vehicle v=null;
        Scanner sc=new Scanner(System.in);
        while(i!=5){
            if ((i < 1 || i > 5) && i!=-1) {
                System.out.println("Invalid option. Please choose a number between 1 and 5.");
                continue;
            }
            System.out.println("Choose option: 1.Enter details 2.drive 3.display 4.refuel/recharge 5.exit");
            i=sc.nextInt();
            sc.nextLine();
            if(i==1){
                System.out.println("Enter type of vehicle(Electric/Fuel): ");
                type=sc.nextLine();
                if (type.equals("Electric")){
                    v = new ElectricVehicle();
                }
                else if (type.equals("Fuel")){
                    v = new FuelVehicle();
                }
                else{
                    System.out.println("Wrong vehicle type.");
                }
                System.out.println("ID followed by model in the next line: ");
                ID=sc.nextInt();
                sc.nextLine();
                model=sc.nextLine();
            }
            if (v!=null){
                if (i==2){          
                    System.out.println("Enter distance you want to travel: ");
                    dist=sc.nextDouble();
                    v.drive(dist);
                }
                else if(i==3){
                    v.displayStatus(model,ID);
                }
                else if(i==4){
                    if (type.equals("Fuel")){
                        ((FuelVehicle) v).refuel();
                    }
                    else{
                        ((ElectricVehicle) v).recharge();
                    }
                }
            }
            else{
                System.out.println("Enter details of the car first");
            }
        }
    }
}
