
import java.util.Scanner;
public class Carparking {

    public static void main(String argu[]){


        Scanner uinput = new Scanner(System.in);



        int menu;
        int car=0,bike=0,van=0; // vehicle values
        int total ;
        int bikes_slots = 0;  // total numbers of bikes slots in parking area
        int cars_slots = 0;  //total numbers of cars  slots in parking area
        int vans_slots = 0 ;   //total numbers of vans slots in parking area
        int total_slot=0;
        System.out.println("WELCOME TO THE CAR PARK MANAGEMENT SYSTEM.WE ARE 2019T00351,2019T00358,2019T00365");
        System.out.println("");
        System.out.println("");
        while (true)
        {
            total=car+bike+van;
            total_slot=bikes_slots+cars_slots+vans_slots;
            System.out.println("WELCOME TO CAR PARKING MANAGEMENT SYSTEM");// welcome members
            System.out.println("Press 1 to New Parking"); // select number 1 to enter a vehicle
            System.out.println("Press 2 to Exit Parking ");//  select number 2 to exit a vehicle
            System.out.println("Press 3 to View Parking Details");  // information of parking
            System.out.println("Press 4 to Upgrade Parking Slots "); // upgrade for parking slots
            System.out.println("Press 5 to Exit ");//select number 5 to exit the system
            menu = uinput.nextInt();

            switch (menu) {
                case 1:// enter vehicle details
                { System.out.println("Input Vehicle Type");//input types of vehicles
                    System.out.println("Press 1 to Motorbike");
                    System.out.println("Press 2 to Car");
                    System.out.println("Press 3 to Van");
                    int type = uinput.nextInt();

                    if(type == 1){ //bike parking
                        if(bike == bikes_slots)
                        {
                            if(bikes_slots == 0){
                                System.out.println("Please Upgrade Motorbike Slots ");
                                System.out.println("");
                            }
                            else {
                                System.out.println("Sorry Do not have Space for New Parking");
                                System.out.println("");}
                        }
                        else{
                            System.out.println("Parking For Bike");
                            System.out.println("Bike Add Successfully");
                            System.out.println("Thank You!");
                            bike=bike+1;
                            System.out.println("");}
                        break;}
                    else if(type == 2){  //parking for a car
                        if(car == cars_slots)
                        {
                            if(cars_slots == 0){
                                System.out.println("Please Upgrade Car Slots ");
                                System.out.println(" ");
                            }
                            else {
                                System.out.println("Sorry Do not have Space for New Parking");
                                System.out.println(" "); }
                        }
                        else {
                            System.out.println("Parking For Car");
                            System.out.println("Car Add Successfully");
                            System.out.println("Thank You!");
                            car=car+1;
                            System.out.println(" ");}
                        break;}




                    else if(type ==3){  //parking for a van

                        if(van == vans_slots)
                        {
                            if(vans_slots == 0){
                                System.out.println("Please Upgrade Van Slots ");
                                System.out.println(" ");
                            }
                            else {
                                System.out.println("Sorry Do not have Space for New Parking");
                                System.out.println(" "); }
                        }
                        else{
                            System.out.println("Parking For Van");
                            System.out.println("Van Add Successfully");
                            System.out.println("Thank You!");
                            van=van+1;
                            System.out.println("");}
                        break;}

                    else {
                        System.out.println("Please Enter Valid Input");
                        System.out.println("");
                        break;
                    }
                }


                case 2:
                {
                    System.out.println("For Exit Parking "); //Exit for parking
                    System.out.println("");
                    System.out.println("Input Vehicle Type");
                    System.out.println("Press 1 to Motorbike");
                    System.out.println("Press 2 to Car");
                    System.out.println("Press 3 to Van");
                    int type = uinput.nextInt();
                    if(type == 1){
                        if(bike == 0){
                            System.out.println("Do not have Motorbikes in the park");
                        }
                        else{
                            System.out.println("Exit For Bike");
                            System.out.println(" Successfully");
                            System.out.println("Thank You!");
                            bike=bike-1;
                            System.out.println("");}
                    }
                    else if(type == 2){
                        if(car == 0){
                            System.out.println("Do not have Cars in the park");}
                        else{
                            System.out.println("Exit For Car");
                            System.out.println(" Successfully");
                            System.out.println("Thank You!");
                            car=car-1;
                            System.out.println(" ");}

                    }
                    else if (type == 3) {
                        if(van == 0 ){
                            System.out.println("Do not have Vans in the park");
                        }
                        else{
                            System.out.println("Exit For Van");
                            System.out.println("Successfully");
                            System.out.println("Thank You!");
                            van=van-1;
                            System.out.println("");
                        }
                    }
                    else {System.out.println("Please Enter Valid Input!");}
                    System.out.println("");
                    break;

                }
                case 3: // Parking details
                {
                    System.out.println("Parking Details");  //parking details
                    System.out.println("");
                    System.out.println("Booked Slots"); //bookes slots in parking
                    System.out.println("Motorbike    :  "+bike);
                    System.out.println("Car          :  "+car);
                    System.out.println("Van          :  "+van);
                    System.out.println("Totle        :  "+total);
                    System.out.println("");

                    System.out.println("Free slots");
                    System.out.println("Motorbike    :  "+(bikes_slots-bike)); //free slots in parking
                    System.out.println("Car          :  "+(cars_slots-car));
                    System.out.println("Van          :  "+(vans_slots-van));
                    System.out.println("Totle        :  "+(total_slot-total));
                    System.out.println("");

                    System.out.println("Total Of Parking Areas Slots"); //total of parking areas slots
                    System.out.println("Motorbike    :  "+bikes_slots);
                    System.out.println("Car          :  "+cars_slots);
                    System.out.println("Van          :  "+vans_slots);
                    System.out.println("Totle        :  "+total_slot);
                    System.out.println("");

                    break;
                }
                case 4: // for upgrade vehicle slots
                {
                    System.out.println("Upgrade Parking Slots");

                    System.out.println("Press 1 To change Motorbike Slots ");
                    System.out.println("Press 2 To change Car Slots");
                    System.out.println("Press 3 To change Van Slots");
                    System.out.println("");
                    int slots = uinput.nextInt();
                    System.out.println("");
                    if (slots == 1) { //upgrade for bike
                        System.out.println("Upgrade for MotorBikes");
                        System.out.println("Please Enter Slots for MotorBikes");
                        int bslots = uinput.nextInt();
                        bikes_slots = bslots;
                        System.out.println(" Successfully");
                        System.out.println("");
                        System.out.println("All motorbike Slotes are =" + bikes_slots);
                        System.out.println("");
                        break;

                    } else if (slots == 2) { //upgrade for car
                        System.out.println("Upgrade  For Cars");
                        System.out.println("Please Enter Slots for Cars");
                        int cslots = uinput.nextInt();
                        cars_slots = cslots;
                        System.out.println(" Successfully");
                        System.out.println("");
                        System.out.println("All Car Slots are =" + cars_slots);
                        System.out.println("");
                        break;
                    } else if(slots == 3) { //upgrade for vans
                        System.out.println("Upgrade For Vans");
                        System.out.println("Please Enter Slots for Vans");
                        int vslots = uinput.nextInt();
                        vans_slots = vslots;
                        System.out.println(" Successfully");
                        System.out.println("");
                        System.out.println("All car Slots are =" + vans_slots);
                        System.out.println("");
                        break;
                    }
                    else {System.out.println("Please Input Valid Command !");
                        System.out.println("");
                        break;}

                }

                case 5: {
                    System.exit(0);  //exit from program
                    break;
                }
                default: {
                    System.out.println("Please Enter Valid Input");  //inform invalid input
                    System.out.println("");
                    break;
                }


            }
        }
    }
}