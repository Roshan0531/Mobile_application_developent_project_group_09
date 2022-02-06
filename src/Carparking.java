import java.util.Scanner;
public class Carparking {

    public static void main(String argu[]){

        Scanner uinput = new Scanner(System.in);
        int menu;
        int car=0,bike=0,van=0; // vehicle values
        while (true)
        {
            System.out.println("WELCOME TO CAR PARKING MANAGEMENT SYSTEM"); // welcome members
            System.out.println("Press 1 to New Parking");  // select number 1 to enter a vehicle
            System.out.println("Press 2 to Exit Parking ");  //  select number 2 to exit a vehicle
            System.out.println("Press 3 to view Parking Details");  // information of parking
            System.out.println("Press 5 to Exit ");  //select number 5 to exit the system
            menu = uinput.nextInt();

            switch (menu) {
                case 1: // enter vehicle details
                { System.out.println("Input Vehicle Type");    //input types of vehicles
                    System.out.println("Press 1 to Motorbike");
                    System.out.println("Press 2 to Car");
                    System.out.println("Press 3 to Van");
                    int type = uinput.nextInt();
                    if(type == 1){
                        System.out.println("Parking For Bike");   //bike parking
                    }
                    else if(type == 2){
                        System.out.println("Exit For Car");  //parking for a car
                        System.out.println(" Successfully");
                        System.out.println("Thank You!");
                        car=car-1;
                        System.out.println(" ");

                    }
                    else{
                        System.out.println("Exit For Van");  //parking for a van
                        System.out.println("Successfully");
                        System.out.println("Thank You!");
                        van=van-1;
                        System.out.println("");
                    }
                    System.out.println("");
                    break;
                }
                case 3:
                {
                    System.out.println("Parking Details");  //parking details
                    System.out.println("Motorbike   :  "+bike);
                    System.out.println("Car   :  "+car);
                    System.out.println("Van  :  "+van);
                    System.out.println("Totle  :  " +totle);
                    System.out.println("");
                    break;
                }
                case 4:
                {
                    System.exit(0);
                    break;
                }
                default:
                {
                    System.out.println("Please Enter Valid Input");
                    System.out.println("");
                    break;
                }
            }
        }
    }
}

