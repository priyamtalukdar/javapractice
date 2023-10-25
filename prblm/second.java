package prblm;
import java.util.*;
public class second {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the number of guests: ");
        int numberOfGuests = scanner.nextInt();

        int totalEntrancePrice = 0;

        for (int i = 1; i <= numberOfGuests; i++) {
            System.out.print("Enter age and name of the person " + i + ": ");
            int age = scanner.nextInt();
             String name = scanner.nextLine();
            int entrancePrice = calculateEntrancePrice(age);
            totalEntrancePrice += entrancePrice;
            map.put(name,age);
        }
        System.out.println("Total entrance price for " + numberOfGuests + " guests: INR " + totalEntrancePrice);
        for (Map.Entry<String, Integer> detail : map.entrySet()) {
            System.out.println(detail.getKey() + "( Age: " + detail.getValue()+")");
        }

        scanner.close();
    }

    public static int calculateEntrancePrice(int age) {
        if (age <= 2) {
            return 0;
        } else if (age < 18) {
            return 100;
        } else if (age < 60) {
            return 500;
        } else {
            return 300;
        }
    }
}


