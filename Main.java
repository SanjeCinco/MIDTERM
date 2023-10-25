import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Router to Moalboal\n");

        System.out.println("Displaying default route:");
        System.out.println("Mingla (route 1)");
        System.out.println("San Fernando (route 2)");
        System.out.println("Carcar (route 3)");
        System.out.println("Barili (route 4)");
        System.out.println("Dumanjug (route 4.1.1)");
        System.out.println("Alcantara (route 4.1.2)");
        System.out.println("Moalboal");

        System.out.print("\nIs Barili (route 4) obstructed? (Yes = 1 or No = 0): ");
        int isBariliObstructed = sc.nextInt();

        if (isBariliObstructed == 0) {
            System.out.println("\nProceeding with default route:");
            System.out.println("Mingla (route 1)");
            System.out.println("San Fernando (route 2)");
            System.out.println("Carcar (route 3)");
            System.out.println("Barili (route 4)");
            System.out.println("Dumanjug (route 4.1.1)");
            System.out.println("Alcantara (route 4.1.2)");
            System.out.println("Moalboal");
        } else {
            System.out.print("\nIs Dumanjug (route 4.1.1) obstructed? (Yes = 1 or No = 0): ");
            int isDumanjugObstructed = sc.nextInt();

            if (isDumanjugObstructed == 0) {
                System.out.println("\nOptimum route:");
                System.out.println("Mingla (route 1)");
                System.out.println("San Fernando (route 2)");
                System.out.println("Carcar (route 3)");
                System.out.println("Sibonga (route 4.2)");
                System.out.println("Argao (route 5)");
                System.out.println("Ronda (route 5.1)");
                System.out.println("Moalboal");
            } else {
                // Handle other cases here
            }
        }
    }
}