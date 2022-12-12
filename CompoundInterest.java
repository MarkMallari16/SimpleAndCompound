package SimpleAndCompund;
import java.text.DecimalFormat;
import java.util.Scanner;

public class CompoundInterest extends SimpleInterest{
	Scanner input = new Scanner(System.in);
	DecimalFormat two = new DecimalFormat("0.00");
	static int period;
	
	public static void displayCompoundChart() {
		System.out.println("\n\tCompound Interest Calculator");
		System.out.println("[1] Find Compound Amount");
		System.out.println("[2] Find Compound Interest");
		System.out.println("[3] Find Principal");
		System.out.println("[4] Find Rate");
		System.out.println("[5] Find Time");
		System.out.print("Option : ");
	}
	
	public static void displayCompoundAmountFormula() {
		System.out.println("\nYou chose Compound Amount");
		System.out.println("Formula : A = P (1 + r/n)^nt\n");
	}
	public static void displayInterestFormula() {
		System.out.println("\nYou chose Compound Interest");
		System.out.println("Formula : A - P\n");
	}
	public static void displayPrincipalFormula() {
		System.out.println("\nYou chose Principal");
		System.out.println("Formula : A * (1 + r/n)^(-n * t)\n");
	}
	public static void displayRateFormula() {
		System.out.println("\nYou chose Rate");
		System.out.println("Formula : n [ (A / P)^1/nt -1 ]\n");
	}
	public static void displayTimeFormula() {
		System.out.println("\nYou chose Time");
		System.out.println("Formula : ln(A/P) / n[ln(1 + r / n)]\n");
	}
	public static void displayCompoundingPeriods() {
		System.out.println("\tCompounding Periods Per Year");
		System.out.println("[1] Annually        =          1");
		System.out.println("[2] Semi Annually   =          2");
		System.out.println("[3] Quarterly       =          4");
		System.out.println("[4] Monthly         =          12");
		System.out.print("Enter Your Choice : ");
	}
	public static int getPeriodPerYear(int option) {
		if (option == 1) {
			period = 1;
		}else if (option == 2) {
			period = 2;
		}else if (option == 3) {
			period = 4;
		}else if (option == 4) {
			period = 12;
		}
		return period;
	}
	public static int checkPeriod(int option) {
		Scanner checkOption = new Scanner(System.in); 
		while (option < 1 || option > 4) {
			System.out.print("You must enter range 1 - 4 \nTry Again : ");
			option = checkOption.nextInt();
		}
		return getPeriodPerYear(option);
	}
	public void displayCompoundAmountSolution() {
		System.out.println("Principal : " + principal);
		System.out.println("Rate      : " + two.format(rate) + " or" + two.format(convertRate(rate)));
		System.out.println("Time      : " + time);
		System.out.println("Period    : " + period);
	}
	public void displayCompoundInterestSolution() {
		System.out.println("Compound Amount / Future Value : " + futureValue);
		System.out.println("Principal                      : " + principal);
	}
	public void displayPrincipalSolution() {
		System.out.println("Compound Amount / Future Value : " + futureValue);
		System.out.println("Rate                           : " + two.format(rate) + " or" + two.format(convertRate(rate)));
		System.out.println("Time                           : " + time);
		System.out.println("Period                         : " + period);
	}
	public void displayRateSolution() {
		System.out.println("Compound Amount / Future Value : " + futureValue);
		System.out.println("Principal                      : " + principal);
		System.out.println("Time                           : " + time);
		System.out.println("Period                         : " + period);
	}
	public void displayTimeSolution() {
		System.out.println("Compound Amount / Future Value : " + futureValue);
		System.out.println("Principal                      : " + principal);
		System.out.println("Rate                           : " + two.format(rate) + " or" + two.format(convertRate(rate)));
		System.out.println("Period                         : " + period);
	}
	
	public float getCompoundAmount() {
		float amount = principal * (float)Math.pow(1 + convertRate(rate)/period, period*time);
		return amount;
	}
	public float getInterest() {
		return futureValue - principal;
	}
	public float getPrincipal() {
		return futureValue * (float)Math.pow( 1 + convertRate(rate) / period, -period * time);
	}
	public float getRate() {
		return period * (float)(Math.pow(futureValue / principal, 1/(period * time)) -1);
	}
	public float convertToPercent() {
		return getRate() * 100;
	}
	public float getTime() {
		return (float)(Math.log(futureValue / principal) / (period * Math.log(1 + (convertRate(rate) / period))) );
	}
}
