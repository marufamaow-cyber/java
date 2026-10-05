package BasicTest.LabtestPractice.LabtestPractice;

// BasicTest.LabtestPractice.LabtestPractice.FitnessCenter.java
public class FitnessCenter {

    // Task 1: Attributes (instance variables)
    String centerName;
    String establishmentDate;
    boolean hasCertifiedTrainers;
    int totalMembers;
    double dailyCharge;
    int numberOfBranches;
    String[] recentlyOpenedBranches = new String[5]; // index 0 = newest, index 4 = oldest

    // Task 3: Constructor
    public FitnessCenter(String centerName, String establishmentDate,
                         boolean hasCertifiedTrainers, int totalMembers, double dailyCharge) {
        this.centerName = centerName;
        this.establishmentDate = establishmentDate;
        this.hasCertifiedTrainers = hasCertifiedTrainers;
        this.totalMembers = totalMembers;
        this.dailyCharge = dailyCharge;
    }

    // Task 2: Calculate and display monthly revenue
    public void calculateMonthlyRevenue(String month) {
        int days;
        switch (month.toLowerCase()) {
            case "january": case "march": case "may": case "july":
            case "august": case "october": case "december":
                days = 31;
                break;
            case "april": case "june": case "september": case "november":
                days = 30;
                break;
            case "february":
                days = 28;
                break;
            default:
                System.out.println("Invalid month: " + month);
                return;
        }

        double revenue = totalMembers * dailyCharge * days;

        System.out.println("Center: " + centerName);
        System.out.println("Month: " + month);
        System.out.printf("Monthly Revenue: %,.0f BDT%n", revenue);
        System.out.println("--------------------------------");
    }

    // Extra: update fee only if it is valid (greater than 0)
    public void setDailyCharge(double newCharge) {
        if (newCharge > 0) {
            dailyCharge = newCharge;
            System.out.println("Fee updated to " + newCharge + " BDT");
        } else {
            System.out.println("Invalid fee (" + newCharge + "). Nothing changed.");
        }
    }
}