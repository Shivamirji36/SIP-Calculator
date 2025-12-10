import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the amount you want to Invest Monthly: ");
        double principalAmt = input.nextDouble();
        //amount entering

        System.out.print("How many Years you want to invest: ");
        double years = input.nextDouble();

        System.out.print("Rate of return: ");
        double rateOfReturn = input.nextDouble();

        double yearToMonths = years * 12;
        double convertedROI = (rateOfReturn / 100);
        double convertedROI1 = convertedROI / 12;

        double stepValue = (1 + convertedROI1);
        double stepValue1 = Math.pow(stepValue, yearToMonths);
        double stepValue2 = stepValue1 - 1;
        double stepValue3 = stepValue2 / convertedROI1;

        double stepValue4 = principalAmt * (1 + convertedROI1);

        double finalValue = stepValue3 * stepValue4;

        double investedAmt = principalAmt * yearToMonths;

        double estimatedReturns = finalValue - investedAmt;

        System.out.println("The total amount invested: ₹"+(int)investedAmt);
        System.out.println("The Estimated returns: ₹"+(int)estimatedReturns);
        System.out.println("The amount of return after "+(int)years+" years is ₹"+(int)finalValue);

    }
}