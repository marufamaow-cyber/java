package BasicTest.LabtestPractice.LabtestPractice;

// BasicTest.LabtestPractice.LabtestPractice.Main.java
public class Main {
    public static void main(String[] args) {

        // Task 4.1: Create two objects using the constructor
        FitnessCenter c1 = new FitnessCenter("ActiveFit", "2021-04-10", true, 100, 90);
        FitnessCenter c2 = new FitnessCenter("Flex Zone", "2019-08-15", false, 150, 60);

        // Task 4.2: Initialize branches (newest -> oldest)
        c1.numberOfBranches = 8;
        c1.recentlyOpenedBranches = new String[]{"Uttara", "Banani", "Dhanmondi", "Mirpur", "Gulshan"};

        c2.numberOfBranches = 5;
        c2.recentlyOpenedBranches = new String[]{"Savar", "Tongi", "Motijheel", "Mohakhali", "Badda"};

        // Task 4.3 & 4.4: Different month for each object
        c1.calculateMonthlyRevenue("September");
        c2.calculateMonthlyRevenue("February");

        // Valid fee: updates the value
        System.out.println("\n== Valid fee update ==");
        c1.setDailyCharge(100);
        c1.calculateMonthlyRevenue("September");

        // Invalid fee: changes nothing
        System.out.println("\n== Invalid fee update ==");
        c1.setDailyCharge(-50);
        c1.calculateMonthlyRevenue("September");
    }
}