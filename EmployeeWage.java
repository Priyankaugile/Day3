public class Calculate_employee_wage {
    public static void main(String[] args) {

        // constants
        int IS_FULL_TIME =1;
        int WAGE_PER_HR = 20;

        // variables
        int empHrs = 0;
        int empWage = 0;

        double empCheck = Math.floor(Math.random()*10)%2;
        if (empCheck == IS_FULL_TIME)
            empHrs = 8;
        else
            empHrs = 0;
        empWage = empHrs * WAGE_PER_HR;
        System.out.println("Emp Wage: " + empWage);

    }
}

