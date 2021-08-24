public class AddPartTimeEmp {

    public static void main(String[] args) {

        // constants
        int IS_PART_TIME = 1;
        int IS_FULL_TIME = 2;
        int RATE_PER_HR = 20;

        //variables
        int empHr = 0;
        int empWage =0;

        //computation
        double empCheck = Math.floor(Math.random()*10)%3;
        if (empCheck == IS_PART_TIME)
            empHr = 4;
        else if (empCheck == IS_FULL_TIME)
            empHr = 8;
        else
            empHr = 0;

        empWage = (empHr * RATE_PER_HR);
        System.out.println("Emp Wage: " + empWage);
    }
}
