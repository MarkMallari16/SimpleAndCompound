package SimpleAndCompund;
import java.text.DecimalFormat;
import java.util.Scanner;


public class Calculator {
	
	public static void main(String[] args) {
		
		
		
		displaySimpleInterestCalculator();
		
		
		
	}
		public static void displaySimpleInterestCalculator() {
			DecimalFormat twoDecimal = new DecimalFormat("0.00");
			
			SimpleInterest si = new SimpleInterest();
			Scanner input = new Scanner(System.in);
			SimpleInterest.displayChart();
			int futureOption;
			int choice = input.nextInt();
			while (choice < 1 || choice > 5) {
				System.out.print("Invalid Input. \nMust Be range 1 - 5 Try Again : ");
				choice = input.nextInt();
				divideDash();
			}
			switch (choice) {
			//find simple interest
			case 1:
				int interestOption;
				divideDash();
				SimpleInterest.displayInterestFormula();
				divideDash();
				System.out.print("Enter Principal Value : ");
				si.principal = input.nextFloat();
				System.out.print("Enter Rate : ");
				si.rate = input.nextFloat();
				System.out.print("Enter Time : ");
				si.time = input.nextInt();
				
				divideDash();
				si.displayInterestChoice();
				interestOption = input.nextInt();
				si.getInterestOption(interestOption);
				divideDash();
				si.displayInterestSolution();
				divideDash();
				//result
				System.out.println("Interest : " + twoDecimal.format(si.getInterestOption(interestOption)));
				divideDash();
				break;
				
			//find principal
			case 2:
				divideDash();
				SimpleInterest.displayPrincipalFormula();
				divideDash();
				System.out.print("Enter Simple Interest Value : ");
				si.interest = input.nextFloat();
				System.out.print("Enter Rate Value : ");
				si.rate = input.nextFloat();
				System.out.print("Enter Time : ");
				si.time = input.nextFloat();
				divideDash();
				si.displayPrincipalSolution();
				divideDash();
				
				//principal result
				System.out.println("Principal is : " + si.getPrincipal());
				break;
			//find rate
			case 3:
				divideDash();
				SimpleInterest.displayRateFormula();
				divideDash();
				System.out.print("Enter Interest Value : ");
				si.interest = input.nextFloat();
				System.out.print("Enter Principal Value : ");
				si.principal = input.nextFloat();
				System.out.print("Enter Time : ");
				si.time = input.nextFloat();
				divideDash();
				si.displayRateSolution();
				divideDash();
				
				//rate result
				System.out.println("Rate : " + (int)si.getRate()+"%");
				break;
			//find time
			case 4:
				divideDash();
				SimpleInterest.displayTimeFormula();
				divideDash();
				System.out.print("Enter Interest Value : ");
				si.interest = input.nextFloat();
				System.out.print("Enter Principal Value : ");
				si.principal = input.nextFloat();
				System.out.print("Enter Rate : ");
				si.rate = input.nextFloat();
				divideDash();
				si.displayTimeSolution();
				divideDash();
				//time result
				System.out.println("Time : "+(int)si.getTime());
				divideDash();
				break;
			//find future value
			case 5:
				divideDash();
				SimpleInterest.displayFutureFormula();
				futureOption = input.nextInt();
				divideDash();
				si.checkFutureOption(futureOption);
				divideDash();
				si.displayFutureSolution(futureOption);
				divideDash();
				//future value result
				System.out.println("Future Value : " + si.getFutureValue(futureOption));
				divideDash();
				break;
			}
		}
		public static void divideDash() {
			System.out.println("-----------------------------------------------");
		}
}
