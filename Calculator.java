package SimpleAndCompund;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Calculator {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		char again = 0;
		do {
		int choice = 0;
	
		//display the calculator
		displayCalculatorChoice();
		System.out.print("\t\tEnter Your Choice : ");
		choice = input.nextInt();
		divideDash();
		while (choice < 1 || choice > 2) {
			System.out.print("Must be range 1 - 2 Try Again : ");
			choice = input.nextInt();
		}
			checkCalculatorChoice(choice);
			
			//ask user to try again
			System.out.print("\nDo you want to Calculate any Program? \nPress [Y] to continue \nPress [N] or any key to Exit\nOption : ");
			again = input.next().charAt(0);
			System.out.print("\n");
			
		}while(again == 'y' || again == 'Y');
			divideDash();
			System.out.println("\t\tThank You For Using  My Calculator :)");
			divideDash();
			input.close();
	}
	
	
		public static void displaySimpleInterestCalculator() {
			DecimalFormat twoDecimal = new DecimalFormat("0.00");
			DecimalFormat sixDecimal = new DecimalFormat("0.000000");
			SimpleInterest si = new SimpleInterest();
			Scanner simpleInput = new Scanner(System.in);
			
			int futureOption;
			int interestOption = 0;
			int choice;
			
			SimpleInterest.displayChart();
			choice = simpleInput.nextInt();
			while (choice < 1 || choice > 5) {
				System.out.print("Invalid Input. \nMust Be range 1 - 5 Try Again : ");
				choice = simpleInput.nextInt();
			}
			switch (choice) {
			//find simple interest
			case 1:
				divideDash();
				SimpleInterest.displayInterestFormula();
				divideDash();
				System.out.print("Enter Principal Value : ");
				si.principal = simpleInput.nextFloat();
				System.out.print("Enter Rate            : ");
				si.rate = simpleInput.nextFloat();
				System.out.print("Enter Time            : ");
				si.time = simpleInput.nextInt();
				divideDash();
				si.displayInterestChoice(interestOption);
				interestOption = simpleInput.nextInt();
				divideDash();
				si.displayInterestSolution(interestOption);
				divideDash();
				//result
				System.out.println("Interest : " + sixDecimal.format(si.getInterestAnswer(interestOption)));
				System.out.println("Interest : " + twoDecimal.format(si.getInterestAnswer(interestOption)));
				divideDash();
				break;
				
			//find principal
			case 2:
				divideDash();
				SimpleInterest.displayPrincipalFormula();
				divideDash();
				System.out.print("Enter Interest Value  : ");
				si.interest = simpleInput.nextFloat();
				System.out.print("Enter Rate Value      : ");
				si.rate = simpleInput.nextFloat();
				System.out.print("Enter Time            : ");
				si.time = simpleInput.nextFloat();
				divideDash();
				si.displayPrincipalSolution();
				divideDash();
				
				//principal result
				System.out.println("Principal : " + sixDecimal.format(si.getPrincipal()));
				System.out.println("Principal : " + twoDecimal.format(si.getPrincipal()));
                                divideDash();
				break;
			//find rate
			case 3:
				divideDash();
				SimpleInterest.displayRateFormula();
				divideDash();
				System.out.print("Enter Interest Value  : ");
				si.interest = simpleInput.nextFloat();
				System.out.print("Enter Principal Value : ");
				si.principal = simpleInput.nextFloat();
				System.out.print("Enter Time            : ");
				si.time = simpleInput.nextFloat();
				divideDash();
				si.displayRateSolution();
				divideDash();
				
				//rate result
				System.out.println("Rate : " +  sixDecimal.format(si.getRate()));
				System.out.println("Rate : " + twoDecimal.format( si.convertToPercent()) + "%");
				divideDash();
				break;
			//find time
			case 4:
				divideDash();
				SimpleInterest.displayTimeFormula();
				divideDash();
				System.out.print("Enter Interest Value  : ");
				si.interest = simpleInput.nextFloat();
				System.out.print("Enter Principal Value : ");
				si.principal = simpleInput.nextFloat();
				System.out.print("Enter Rate            : ");
				si.rate = simpleInput.nextFloat();
				divideDash();
				si.displayTimeSolution();
				divideDash();
				//time result
				System.out.println("Time : " + sixDecimal.format(si.getTime()));
				System.out.println("Time : "+ twoDecimal.format(si.getTime()) + " year/s");
				divideDash();
				break;
			//find future value
			case 5:
				divideDash();
				SimpleInterest.displayFutureFormula();
				futureOption = simpleInput.nextInt();
				divideDash();
				si.checkFutureOption(futureOption);
				divideDash();
				si.displayFutureSolution(futureOption);
				divideDash();
				//future value result
				System.out.println("Future Value : " + sixDecimal.format(si.getFutureValue(futureOption)));
				System.out.println("Future Value : " + twoDecimal.format(si.getFutureValue(futureOption)));
				divideDash();
			}
		}
	public static void displayCompoundCalculator() {
			DecimalFormat twoDecimal = new DecimalFormat("0.00");
			DecimalFormat sixDecimal = new DecimalFormat("0.000000");
			Scanner compoundInput = new Scanner(System.in);
			CompoundInterest ci = new CompoundInterest();
			int choice = 0;
			int periodOption = 0;
			
			CompoundInterest.displayCompoundChart();
			choice = compoundInput.nextInt();
			while (choice < 1 || choice > 5) {
				System.out.print("Invalid Input. \nMust Be range 1 - 5 Try Again : ");
				choice = compoundInput.nextInt();
			}
			switch(choice) {
				//find compound amount / future value
				case 1:
					divideDash();
					CompoundInterest.displayCompoundAmountFormula();
					divideDash();
					System.out.print("Enter Principal : ");
					ci.principal = compoundInput.nextFloat();
					System.out.print("Enter Rate      : ");
					ci.rate = compoundInput.nextFloat();
					System.out.print("Enter Time      : ");
					ci.time = compoundInput.nextFloat();
					divideDash();
					CompoundInterest.displayCompoundingPeriods();
					periodOption = compoundInput.nextInt();
					CompoundInterest.checkPeriod(periodOption);
					CompoundInterest.getPeriodPerYear(periodOption);
					divideDash();
					ci.displayCompoundAmountSolution();
					divideDash();
					//compound amount answer
					System.out.println("Compound Amount : " + sixDecimal.format(ci.getCompoundAmount()));
					System.out.println("Compound Amount : " + twoDecimal.format(ci.getCompoundAmount()));
					divideDash();
					break;
				//find compound interest
				case 2:
					divideDash();
					CompoundInterest.displayInterestFormula();
					divideDash();
					System.out.print("Enter Compound Amount / Future Value : ");
					ci.futureValue = compoundInput.nextFloat();
					System.out.print("Enter Principal                      : ");
					ci.principal = compoundInput.nextFloat();
					divideDash();
					ci.displayPrincipalSolution();
					divideDash();
					//compound interest answer
					System.out.println("Compound Interest : " + sixDecimal.format(ci.getInterest()));
					System.out.println("Compound Interest : " + twoDecimal.format(ci.getInterest()));
					divideDash();
					break;
				//find principal
				case 3:
					divideDash();
					CompoundInterest.displayPrincipalFormula();
					divideDash();
					System.out.print("Enter Compound Amount / Future Value : ");
					ci.futureValue = compoundInput.nextFloat();
					System.out.print("Enter Rate                           : ");
					ci.rate = compoundInput.nextFloat();
					System.out.print("Enter Time                           : ");
					ci.time = compoundInput.nextFloat();
					divideDash();
					CompoundInterest.displayCompoundingPeriods();
					periodOption = compoundInput.nextInt();
					CompoundInterest.checkPeriod(periodOption);
					CompoundInterest.getPeriodPerYear(periodOption);
					divideDash();
					ci.displayPrincipalSolution();
					divideDash();
					//principal answer
					System.out.println("Principal : " + sixDecimal.format(ci.getPrincipal()));
					System.out.println("Principal : " + twoDecimal.format(ci.getPrincipal()));
					divideDash();
					break;
				//find rate
				case 4: 
					divideDash();
					CompoundInterest.displayRateFormula();
					divideDash();
					System.out.print("Enter Compound Amount / Future Value : ");
					ci.futureValue = compoundInput.nextFloat();
					System.out.print("Enter Principal                      : ");
					ci.principal = compoundInput.nextFloat();
					//check if future value is less than principal
					ci.checkFutureAndPrincipal();
					System.out.print("Enter Time                           : ");
					ci.time = compoundInput.nextFloat();
					divideDash();
					CompoundInterest.displayCompoundingPeriods();
					periodOption = compoundInput.nextInt();
                                        CompoundInterest.checkPeriod(periodOption);
					CompoundInterest.getPeriodPerYear(periodOption);
					divideDash();
					ci.displayRateSolution();
					divideDash();
					//rate answer
					System.out.println("Rate : " + sixDecimal.format(ci.getRate()));
					System.out.println("Rate : " + twoDecimal.format(ci.convertToPercent()) + "%");
					divideDash();
					break;
				//find time
				case 5:
					divideDash();
					CompoundInterest.displayTimeFormula();
					divideDash();
					System.out.print("Enter Compound Amount / Future Value : ");
					ci.futureValue = compoundInput.nextFloat();
					
					System.out.print("Enter Principal                      : ");
					ci.principal = compoundInput.nextFloat();
					
					//check if future value is less than principal
					ci.checkFutureAndPrincipal();
					
					System.out.print("Enter Rate                           : ");
					ci.rate = compoundInput.nextFloat();
					divideDash();
					CompoundInterest.displayCompoundingPeriods();
					periodOption = compoundInput.nextInt();
					CompoundInterest.checkPeriod(periodOption);
					CompoundInterest.getPeriodPerYear(periodOption);
					divideDash();
					ci.displayTimeSolution();
					divideDash();
					//time answer
					System.out.println("Time : " + sixDecimal.format(ci.getTime()));
					System.out.println("Time : " + twoDecimal.format(ci.getTime()) + " year/s");
					divideDash();
			}
		}
		
		public static void displayCalculatorChoice() {
				divideDash();
				System.out.println("\t\t[1] Simple Interest Calculator");
				System.out.println("\t\t[2] Compound Interest Calculator");
				divideDash();
			}
		public static void checkCalculatorChoice(int choice) {
				if (choice == 1) displaySimpleInterestCalculator();
				else if (choice == 2) displayCompoundCalculator();
			}
		public static void divideDash() {
				System.out.println("------------------------------------------------------------------------");
			}
}