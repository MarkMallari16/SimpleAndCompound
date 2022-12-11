package SimpleAndCompund;
import java.util.Scanner;
import java.text.DecimalFormat;
public class SimpleInterest {
	
	Scanner input = new Scanner(System.in);
	public float interest;
	float principal;
	protected float rate;
	protected float time;
	protected float futureValue;
	int option;
	int timeOption;
	
	public static float convertToDecimal(float rate) {
		return rate / 100;
	}
	
	public float getInterestAnswer(int option){
		this.option = option;
		float storeAnswer = 0;
		if (option == 1) return storeAnswer = getInterest();
		else if (option == 2) return storeAnswer = getMonths();
		else if (option == 3) return storeAnswer = getOrdinaryInterest();
		else if (option == 4) return storeAnswer = getExactInterest();
		return storeAnswer;
	}
	public float getInterest() {
		return principal * convertToDecimal(rate) * time;
	}
	public float getMonths() {
		return principal * convertToDecimal(rate) * time/12;
	}
	public float getExactInterest() {
		return principal * convertToDecimal(rate) * time/365;
	}
	public float getOrdinaryInterest() {
		return principal * convertToDecimal(rate) * time/360;
	}
	public float getPrincipal() {
		return interest / (convertToDecimal(rate) * time);
	}
	public float getRate() {
		return interest / (principal * time) * 100;
	}
	public float getTime() {
		return interest / (principal * convertToDecimal(rate));
	}
	
	public void checkFutureOption(int option) {
		this.option = option;
		if (option == 1) {
			System.out.print("Enter Principal : ");
			principal = input.nextFloat();
			
			System.out.print("Enter Interest  : ");
			interest = input.nextFloat();
			
		}else if (option == 2) {
			System.out.print("Enter Principal : ");
			principal = input.nextFloat();
			System.out.print("Enter Rate      : ");
			rate = input.nextFloat();
			System.out.print("Enter Time      : ");
			time = input.nextFloat();
		}else if (option == 3) {
			System.out.print("Enter Principal : ");
			principal = input.nextFloat();
			System.out.print("Enter Rate      : ");
			rate = input.nextFloat();
			System.out.print("Enter Time      : ");
			time = input.nextFloat();
		}else System.out.println("Invalid Input.");
	}
	public float getFutureValue(int option) {
		this.option = option;
		float amount = 0;
		if (option == 1 ) {
			amount = principal + interest;
		}else if (option == 2) {
			amount =  principal + (principal * convertToDecimal(rate) * time);
		}else if (option == 3) {
			amount =  principal * (1 * (convertToDecimal(rate) * time));
		}
			return amount;
	}
	public void displayInterestChoice() {
		System.out.println("Press 1 Normal Interest");
		System.out.println("Press 2 Months Interest");
		System.out.println("Press 3 Exact Interest");
		System.out.println("Press 4 Ordinary Interest");
		System.out.print("Option : ");
	}
	public void displayInterestSolution() {
		System.out.println("Principal : " + principal);
		System.out.println("Rate      : " + rate + " or " + SimpleInterest.convertToDecimal(rate));
		System.out.println("Time      : " + time);
	}
	public void displayPrincipalSolution() {
		System.out.println("Interest  : " + interest);
		System.out.println("Rate      : " + rate + " or " + SimpleInterest.convertToDecimal(rate));
		System.out.println("Time      : " + time);
	}
	public void displayRateSolution() {
		System.out.println("Interest  : " + interest);
		System.out.println("Principal : " + principal);
		System.out.println("Time      : " + time);
	}
	public void displayTimeSolution() {
		System.out.println("Interest  : " + interest);
		System.out.println("Principal : " + principal);
		System.out.println("Rate      : " + "Rate      : " + rate +" or " + SimpleInterest.convertToDecimal(rate));
	}
	public void displayFutureSolution(int option) {
		this.option = option;
		if (option == 1) {
			System.out.println("Principal : " + principal);
			System.out.println("Interest  : " + interest);
		}else if (option == 2) {
			System.out.println("Principal : " + principal);
			System.out.println("Rate      : " + rate +" or " + SimpleInterest.convertToDecimal(rate));
			System.out.println("Time      : " + time);
		}else if (option == 3) {
			System.out.println("Principal : " + principal);
			System.out.println("Rate      : " + rate +" or " + SimpleInterest.convertToDecimal(rate));
			System.out.println("Time      : " + time);
		}
	}
	public static void displayChart() {
		System.out.println("\n\tSimple Interest Calculator");
		System.out.println("[1] Find Simple Interest");
		System.out.println("[2] Find Principal");
		System.out.println("[3] Find Rate");
		System.out.println("[4] Find Time");
		System.out.println("[5] Find Future Value");
		System.out.print("\nEnter Your Choice : ");
	}
	public static void displayInterestFormula() {
		System.out.println("\nYou Chose Simple Interest");
		System.out.println("Formula : I = P*r*t\n");
	}
	public static void displayPrincipalFormula() {
		System.out.println("\nYou Chose Principal");
		System.out.println("Formula : P = I / (r*t)\n");
	}
	public static void displayRateFormula() {
		System.out.println("\nYou Chose Rate");
		System.out.println("Formula : r = I / (P * t)\n");
	}
	public static void displayTimeFormula() {
		System.out.println("\nYou Chose Time");
		System.out.println("Formula : t = I / (P * r)\n");
	}
	public static void displayFutureFormula() {
		System.out.println("Future Value Formula");
		System.out.println("[1] F = P + I ");
		System.out.println("[2] F = P + (prt)");
		System.out.println("[3] F = P (1 + rt)");
		System.out.print("Enter Choice : ");
	}
	
}
