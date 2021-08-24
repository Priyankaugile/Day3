public class Cal_Wage_for_month {

    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;
    public static final int RATE_PER_HR = 20;
    public static final int NO_OF_WORKING_DAY = 2;

    public static void main(String[] args) {

        //variables
        int empHrs = 0;
        int empWage = 0;
        int totalEmoWage = 0;

        //computation
        for (int day = 0; day < NO_OF_WORKING_DAY; day++) {

            int empCheck = (int) Math.floor(Math.random() * 10) % 3;

            switch (empCheck) {
                case IS_PART_TIME:
                    empHrs = 4;
                    break;
                case IS_FULL_TIME:
                    empHrs = 8;
                    break;
                default:
                    empHrs = 0;
            }

            empWage = empHrs * RATE_PER_HR;
            totalEmoWage += empWage;
            System.out.println("Emp Wage: " + empWage);
        }

        System.out.println("Total Emp Wgae: " + totalEmoWage);
    }
}
