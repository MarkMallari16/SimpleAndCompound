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
		System.out.print("Enter Your Choice : ");
		choice = input.nextInt();
		while (choice < 1 || choice > 2) {
			System.out.print("Must be range 1 - 2 Try Again : ");
			choice = input.nextInt();
		}
		checkCalculatorChoice(choice);
			
			//ask user to try again
			System.out.print("\nDo you want to Calculate any Program? [Y][N] : ");
			again = input.next().charAt(0);
			System.out.println();
			divideDash();
		}while(again == 'y' || again == 'Y');
			divideDash();
			System.out.println("Thank You For Using  My Calculator :)");
			input.close();
			divideDash();
	}
	
	
		public static void displaySimpleInterestCalculator() {
			DecimalFormat twoDecimal = new DecimalFormat("0.00");
			
			
			SimpleInterest si = new SimpleInterest();
			Scanner simpleInput = new Scanner(System.in);
			SimpleInterest.displayChart();
			int futureOption;
			int choice = simpleInput.nextInt();
			while (choice < 1 || choice > 5) {
				System.out.print("Invalid Input. \nMust Be range 1 - 5 Try Again : ");
				choice = simpleInput.nextInt();
			}
			switch (choice) {
			//find simple interest
			case 1:
				int interestOption;
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
				si.displayInterestChoice();
				interestOption = simpleInput.nextInt();
				divideDash();
				si.displayInterestSolution();
				divideDash();
				//result
				System.out.println("Interest : " + twoDecimal.format(si.getInterestAnswer(interestOption)));
				divideDash();
				break;
				
			//find principal
			case 2:
				divideDash();
				SimpleInterest.displayPrincipalFormula();
				divideDash();
				System.out.print("Enter Simple Interest Value : ");
				si.interest = simpleInput.nextFloat();
				System.out.print("Enter Rate Value            : ");
				si.rate = simpleInput.nextFloat();
				System.out.print("Enter Time                  : ");
				si.time = simpleInput.nextFloat();
				divideDash();
				si.displayPrincipalSolution();
				divideDash();
				
				//principal result
				System.out.println("Principal : " + si.getPrincipal());
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
				System.out.println("Rate : " +  si.rate + " convert to "+ si.getRate() + "%");
				break;
			//find time
			case 4:
				divideDash();
				SimpleInterest.displayTimeFormula();
				divideDash();
				System.out.print("Enter Interest Value : ");
				si.interest = simpleInput.nextFloat();
				System.out.print("Enter Principal Value : ");
				si.principal = simpleInput.nextFloat();
				System.out.print("Enter Rate : ");
				si.rate = simpleInput.nextFloat();
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
				futureOption = simpleInput.nextInt();
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
	public static void displayCompoundCalculator() {
			DecimalFormat twoDecimal = new DecimalFormat("0.00");
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
					System.out.println("Compound Amount : " + twoDecimal.format(ci.getCompoundAmount()));
					divideDash();
					break;
				case 2:
					divideDash();
					CompoundInterest.displayInterestFormula();
					divideDash();
					System.out.print("Enter Compound Amount / Future Value : ");
					ci.futureValue = compoundInput.nextFloat();
					System.out.print("Enter Principal                      : ");
					ci.principal = compoundInput.nextFloat();
					divideDash();
					//compound interest answer
					System.out.println("Compound Interest : " + twoDecimal.format(ci.getInterest()));
					divideDash();
					break;
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
					System.out.println("Principal : " + twoDecimal.format(ci.getPrincipal()));
					divideDash();
					break;
				case 4: 
					divideDash();
					CompoundInterest.displayRateFormula();
					divideDash();
					System.out.print("Enter Compound Amount / Future Value : ");
					ci.futureValue = compoundInput.nextFloat();
					System.out.print("Enter Principal                      : ");
					ci.principal = compoundInput.nextFloat();
					System.out.print("Enter Time                           : ");
					ci.time = compoundInput.nextFloat();
					divideDash();
					CompoundInterest.displayCompoundingPeriods();
					periodOption = compoundInput.nextInt();
					CompoundInterest.getPeriodPerYear(periodOption);
					divideDash();
					ci.displayRateSolution();
					divideDash();
					//rate answer
					System.out.println("Rate : " + twoDecimal.format(ci.getRate()));
					System.out.println("Rate : " + twoDecimal.format(ci.convertRate()) + "%");
					break;
				case 5:
					divideDash();
					CompoundInterest.displayTimeFormula();
					divideDash();
					System.out.print("Enter Compound Amount / Future Value : ");
					ci.futureValue = compoundInput.nextFloat();
					System.out.print("Enter Principal                      : ");
					ci.principal = compoundInput.nextFloat();
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
					System.out.println("Time : " + twoDecimal.format(ci.getTime()));
					System.out.println("Time : " + twoDecimal.format(ci.getTime()) + " years");
					divideDash();
			}
		}
		
		public static void displayCalculatorChoice() {
				divideDash();
				System.out.println("[1] Simple Interest Calculator");
				System.out.println("[2] Compound Interest Calculator");
				divideDash();
			}
		public static void checkCalculatorChoice(int choice) {
				if (choice == 1) displaySimpleInterestCalculator();
				else if (choice == 2) displayCompoundCalculator();
			}
		public static void divideDash() {
				System.out.println("-----------------------------------------------");
			}
}
