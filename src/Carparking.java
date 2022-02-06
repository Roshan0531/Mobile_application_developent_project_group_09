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
                { System.out.println("Input Vehicle Type");
                    System.out.println("Press 1 to Motorbike");
                    System.out.println("Press 2 to Car");
                    System.out.println("Press 3 to Van");
                    int type = uinput.nextInt();
                    if(type == 1){
                        System.out.println("Parking For Bike");
                    }
                    else if(type == 2){
                        System.out.println("Parking For Car");

                    }
                    else{
                        System.out.println("Parking For Van");
                    }
                }
            }
        }
    }
}

//test one