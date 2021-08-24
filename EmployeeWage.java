public class Cal_hr_day_for_month {

    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;
    public static final int RATE_PER_HR = 20;
    public static final int NO_OF_WORKING_DAY = 2;
    public static final int MAX_HRS_IN_MONTH = 10;

    public static void main(String[] args) {

        //variables
        int empHrs = 0;
        int totalemphrs = 0;
        int totalworkingday = 0;

        //computation
        while (totalemphrs <= MAX_HRS_IN_MONTH && totalworkingday < NO_OF_WORKING_DAY) {
            totalworkingday++;

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

            totalemphrs += empHrs;
            System.out.println("Day: " + totalworkingday + "Emp hr: " + empHrs);
        }

        int totalEmpWage = totalemphrs * RATE_PER_HR;
        System.out.println("Total Emp Wage: " + totalEmpWage);

    }
}
