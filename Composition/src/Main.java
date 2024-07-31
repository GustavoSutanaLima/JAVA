public class Main {
    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(20,20,5);
        Case theCase = new Case("WindFlow2000", "Esperanto", "Corsair CX 650", dimensions);

        //Another way instance a class which has a parameter which is also a class without instantiating the latter is:
        //Resolution myResolution = new Resolution(2560,1800); <- creating an object (or instance a the class Resolution called myResolution;

        Monitor theMonitor = new Monitor("LG0025UWS","Life's Good", 25, new Resolution(2560,1080));
        //above we are creating a instance of a class without creating an object of this class, the problem with it is,
        //if you have to use that same Resolution for another monitor (which requires it) you're gonna have to create it again;

        Motherboard theMotherboard = new Motherboard("Steel Legend B450M", "AsRock", 4, 2, "B450M Gaming BIOS");

        PC thePC = new PC(theCase,theMonitor,theMotherboard);

        /*
        Allusion of composition: a computer HAS a Motherboard, it HAS a Monitor, it HAS a Case;
        (a Computer is a COMPOSITION of a motherboard, a monitor and a case);

        Allusion of inheritance: Toyota IS a car and a car IS a vehicle
        (car INHERITS from Vehicle and Toyota INHERITS from Car);
         */

        //It is also possible to call methods from the classes that compose a major class. This is done by using the getters;

        // The PC has a Case, Case has a method class pressButton:

       // thePC.getTheCase().pressPowerButton();

//        Window myWindow = new Window(120,120,"Red");
//        Door myDoor = new Door ("Kernel", "White");
//        PC myPersonalComputer = new PC(theCase,theMonitor,theMotherboard);
//        Room myBedRoom = new Room (myWindow,myDoor,myPersonalComputer,350,350,350,"Pale yellow");
//
//        myBedRoom.getThisRoomsWindow().closeWindow();
//
//        System.out.println(myBedRoom.getThisRoomsWindow().getWindow());
//        myBedRoom.getThisRoomsWindow().openWindow();
//
//        System.out.println(myBedRoom.getThisRoomsWindow().getWindow());
//
//        myBedRoom.openWindow();

        //TESTING THE EXERCISE:

        Wall wall1 = new Wall("West");
        Wall wall2 = new Wall("East");
        Wall wall3 = new Wall("South");
        Wall wall4 = new Wall("North");

        Ceiling ceiling = new Ceiling(12, 55);

        Bed bed = new Bed("Modern", 4, 3, 2, 1);

        Lamp lamp = new Lamp("Classic", false, 75);

        Bedroom bedRoom = new Bedroom("Gustavo", wall1, wall2, wall3, wall4, ceiling, bed, lamp);

        bedRoom.makeBed();

        bedRoom.getLamp().turnOn();




    }
}
