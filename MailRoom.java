/*
Class: CSE 1322L
Section WJ2
Term: Fall 2023
Instructor: Justin McClung
Name: Aaron Luis Arroyo
Lab#: Assignment3
*/
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MailRoom {
    public static boolean handleLetter (Letter letter, List<Mail> deliver) {
        if (isValidLetter(letter)) {
            deliver.add(letter);
            return true;
        }
        return false;
    }
    public static boolean handleFlat (Flat flat, List<Mail> deliver) {
        if (isValidFlat(flat)) {
            deliver.add(flat);
            return true;
        }
        return false;
    }
    public static boolean handleRegularBox (RegularBox regularBox, List<Mail> deliver) {
        if (isValidRegularBox(regularBox)) {
            deliver.add(regularBox);
            return true;
        }
        return false;
    }
    public static boolean handleLiveBox (LiveBox liveBox, List<Mail> deliver) {
        if (isValidLiveBox(liveBox)) {
            deliver.add(liveBox);
            return true;
        }
        return false;
    }
    public static boolean isValidLetter (Letter letter) {
        return !letter.getDeliveryAddress().isEmpty() &&
                !letter.getReturnAddress().isEmpty() &&
                letter.getLength() >= 5 && letter.getLength() <= 11.5 &&
                letter.getWidth() >= 3.5 && letter.getWidth() <= 6.125 &&
                letter.getThickness() >= 0.007 && letter.getThickness() <= 0.25 &&
                letter.getLength() - letter.getWidth() >= 1.5;
    }
    public static boolean isValidFlat ( Flat flat) {
        return !flat.getDeliveryAddress().isEmpty() &&
                !flat.getReturnAddress().isEmpty() &&
                flat.getLength() >= 11.5 && flat.getLength() <= 15 &&
                flat.getWidth() >= 6.125 && flat.getWidth() <= 12 &&
                flat.getThickness() >= 0.25 && flat.getThickness() <= 0.75 &&
                "DOCUMENTS".equalsIgnoreCase(flat.getContents());
    }
    public static boolean isValidRegularBox (RegularBox regularBox) {
        return !regularBox.getDeliveryAddress().isEmpty() &&
                !regularBox.getReturnAddress().isEmpty() &&
                regularBox.getLength() >= 6 && regularBox.getLength() <= 27 &&
                regularBox.getWidth() >= 0.25 && regularBox.getWidth() <= 17 &&
                regularBox.getHeight() >= 3 && regularBox.getHeight() <= 17 &&
                regularBox.getWeight() >= 0 && regularBox.getWeight() <= 70 &&
                regularBox.getCount() >= 0 && regularBox.getCount() <= 50;
    }
    public static boolean isValidLiveBox (LiveBox liveBox) {
        if (!liveBox.getDeliveryAddress().isEmpty() &&
                !liveBox.getReturnAddress().isEmpty() &&
                liveBox.getLength() >= 6 && liveBox.getLength() <= 27 &&
                liveBox.getWidth() >= 0.25 && liveBox.getWidth() <= 17 &&
                liveBox.getHeight() >= 3 && liveBox.getHeight() <= 17 &&
                ("HONEYBEE".equalsIgnoreCase(liveBox.getAnimal()) ||
                "CHICKEN".equalsIgnoreCase(liveBox.getAnimal())) &&
                liveBox.getAge() >= 0 && liveBox.getAge() <= 1) {

            if ("HONEYBEES".equalsIgnoreCase(liveBox.getAnimal())) {
                return liveBox.getCount() >= 0 && liveBox.getCount() <= 20;
            } else if ("CHICKEN".equalsIgnoreCase(liveBox.getAnimal())) {
                return liveBox.getCount() >= 0 && liveBox.getCount() <= 10;
            }
        }
        return false;
    }


    public static void main (String [] args) {
        Scanner input = new Scanner (System.in);
        List<Mail> deliver = new ArrayList<>();

        while (true) {
            System.out.println("1- Send letter");
            System.out.println("2- Send flat");
            System.out.println("3- Send regular box");
            System.out.println("4- Send live box");
            System.out.println("5- Dispatch items");
            System.out.println("6- Quit");
            System.out.print("Enter option: ");

            int choice = input.nextInt();
            input.nextLine();

            if (choice != 0) {
                if (choice == 1) {
                    System.out.print("Enter the delivery address: ");
                    String deliveryAddress = input.nextLine();
                    System.out.print("Enter the return address: ");
                    String returnAddress = input.nextLine();
                    System.out.print("Enter the width of your mail: ");
                    double width = input.nextDouble();
                    input.nextLine();
                    System.out.print("Enter the length of your mail: ");
                    double length = input.nextDouble();
                    input.nextLine();
                    System.out.print("Enter the thickness of your mail: ");
                    double thickness = input.nextDouble();
                    input.nextLine();
                    System.out.print("Enter the contents of your letter: ");
                    String contents = input.nextLine();

                    Letter letter = new Letter(deliveryAddress, returnAddress, width, length, thickness, contents);
                    boolean isValidLetter = handleLetter(letter, deliver);

                    if (isValidLetter) {
                        System.out.println("Letter accepted for delivery.");
                    }
                    else {
                        System.out.println("Letter cannot be mailed.");
                    }
                }
                else if (choice == 2) {
                    System.out.print("Enter the delivery address: ");
                    String deliveryAddress = input.nextLine();
                    System.out.print("Enter the return address: ");
                    String returnAddress = input.nextLine();
                    System.out.print("Enter the width of your mail: ");
                    double width = input.nextDouble();
                    System.out.print("Enter the length of your mail: ");
                    double length = input.nextDouble();
                    System.out.print("Enter the thickness of your mail: ");
                    double thickness = input.nextDouble();
                    input.nextLine();
                    System.out.print("Enter the contents of your Flat: ");
                    String contents = input.nextLine();

                    Flat flat = new Flat(deliveryAddress, returnAddress, width, length, thickness, contents );
                    boolean isValidFlat = handleFlat(flat, deliver);

                    if (isValidFlat) {
                        System.out.println("Flat accepted for delivery.");
                    }
                    else {
                        System.out.println("Flat cannot be mailed.");
                    }
                }
                else if (choice == 3) {
                    System.out.print("Enter the delivery address: ");
                    String deliveryAddress = input.nextLine();
                    System.out.print("Enter the return address: ");
                    String returnAddress = input.nextLine();
                    System.out.print("Enter the width of your mail: ");
                    double width = input.nextDouble();
                    System.out.print("Enter the length of your mail: ");
                    double length = input.nextDouble();
                    System.out.print("Enter the height of your mail: ");
                    double height = input.nextDouble();
                    input.nextLine();
                    System.out.print("Enter how many items your box has: ");
                    int count = input.nextInt();
                    input.nextLine();
                    System.out.print("Enter the weight of your box: ");
                    double weight = input.nextDouble();
                    input.nextLine();
                    System.out.print("Enter the contents of your box: ");
                    String items = input.nextLine();

                    RegularBox regularBox = new RegularBox(deliveryAddress, returnAddress, width, length, height, count, items, weight);
                    boolean isValidRegularBox = handleRegularBox(regularBox, deliver);

                    if (isValidRegularBox) {
                        System.out.println("Regular box accepted for delivery. ");
                    }
                    else {
                        System.out.println("Regular box cannot be mailed.");
                    }
                }
                else if (choice == 4) {
                    System.out.print("Enter the delivery address: ");
                    String deliveryAddress = input.nextLine();
                    System.out.print("Enter the return address: ");
                    String returnAddress = input.nextLine();
                    System.out.print("Enter the width of your mail: ");
                    double width = input.nextDouble();
                    System.out.print("Enter the length of your mail: ");
                    double length = input.nextDouble();
                    System.out.print("Enter the height of your mail: ");
                    double height = input.nextDouble();
                    input.nextLine();
                    System.out.print("Enter how many items your box has: ");
                    int count = input.nextInt();
                    input.nextLine();
                    System.out.print("Enter what animal is being shipped: ");
                    String animal = input.nextLine();
                    System.out.print("Enter age of the oldest animal, in days: ");
                    int age = input.nextInt();

                    LiveBox liveBox = new LiveBox(deliveryAddress, returnAddress, width, length, height, count, animal, age);
                    boolean isValidLiveBox = handleLiveBox(liveBox, deliver);

                    if (isValidLiveBox) {
                        System.out.println("Live box accepted for delivery. ");
                    }
                    else {
                        System.out.println("Live box cannot be mailed.");
                    }
                }
                else if (choice == 5) {
                    System.out.println("DISPATCHING THE FOLLOWING ITEMS FOR DELIVERY: ");
                    System.out.println("==========");
                        for (Mail item : deliver) {
                            System.out.println(item);
                            System.out.println("==========");
                        }
                        System.out.println("Delivery queue is empty.");
                        deliver.clear();
                }
                else {
                    System.out.println("Quitting... ");
                    input.close();
                    System.exit(0);
                }
            }
        }
    }
}