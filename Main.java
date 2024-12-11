package org.example;

public class Main {
    public static void main(String[] args) {
        Car vwGolf = new Car(50.0, "PETROL", 4.7, 15.7, 16, "WVW9876");
        Car vwPassat = new Car(60.0, "DIESEL", 5.2, 21.1, 17, "WVW5432");

        Car mercedesCKlasse = new Car(55.0, "PETROL", 6.1, 28.3, 16, "MB1234");
        Car mercedesSKlasse = new Car(70.0, "DIESEL", 6.7, 40.9, 19, "MB5678");

        System.out.println("VW Golf chassis Number: " + vwGolf.getChassisNumber());
        System.out.println(vwGolf.start());
        System.out.println(vwGolf.drive(70));
        System.out.println(vwGolf.stop());
        System.out.println("---------------------------------------");
        System.out.println("VW Passat chassis Number: " + vwPassat.getChassisNumber());
        System.out.println(vwPassat.start());
        System.out.println(vwPassat.drive(85));
        System.out.println(vwPassat.stop());
        System.out.println("---------------------------------------");
        System.out.println("Mercedes CKlasse chassis Number: " + mercedesCKlasse.getChassisNumber());
        System.out.println(mercedesCKlasse.start());
        System.out.println(mercedesCKlasse.drive(110));  // Drive 100 km
        System.out.println(mercedesCKlasse.stop());
        System.out.println("----------------------------------------");
        System.out.println("Mercedes SKlasse chassis Number: " + mercedesSKlasse.getChassisNumber());
        System.out.println(mercedesSKlasse.start());
        System.out.println(mercedesSKlasse.drive(135));  // Drive 100 km
        System.out.println(mercedesSKlasse.stop());
    }
}
