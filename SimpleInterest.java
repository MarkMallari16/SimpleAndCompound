package simpleandcompound;
import java.util.Scanner;
import java.text.DecimalFormat;
public class SimpleInterest {
	
	Scanner input = new Scanner(System.in);
	DecimalFormat sixDecimal = new DecimalFormat("0.000000");
	public float interest;
	protected float principal;
	protected float rate;
	protected float time;
	protected float futureValue;
	int option;
	int timeOption;
	
	public static void displayChart() {
		System.out.println("\n\t\tSimple Interest Calculator");
		System.out.println("[1] Find Simple Interest");
		System.out.println("[2] Find Principal");
		System.out.println("[3] Find Rate");
		System.out.println("[4] Find Time");
		System.out.println("[5] Find Future Value");
		System.out.print("Option : ");
	}
	public static void displayInterestFormula() {
		System.out.println("\nYou Chose Simple Interest");
		System.out.println("Formula : I = P*r*t\n");
	}
	public void displayInterestChoice(int option) {
		System.out.println("\tPress [1] Years Interest");
		System.out.println("\tPress [2] Months Interest");
		System.out.println("\tPress [3] Exact Interest");
		System.out.println("\tPress [4] Ordinary Interest");
		System.out.println("\tPress [5] Weekly Interest");
		System.out.print("\tOption : ");
	}
	public float getInterestAnswer(int option){
		this.option = option;
		float storeAnswer = 0;
		if (option == 1) {
			return storeAnswer = getInterest();
		}
		else if (option == 2) {
			return storeAnswer = getMonthsInterest();
		}
		else if (option == 3) {
			return storeAnswer = getOrdinaryInterest();
		}
		else if (option == 4) {
			return storeAnswer = getExactInterest();
		}else if (option == 5) {
			return storeAnswer = getWeeklyInterest();
		}
		return storeAnswer;
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
		System.out.print("Option  : ");
	}
	public void displayFutureSolution(int option) {
		this.option = option;
		if (option == 1) {
			System.out.println("Principal : " + principal);
			System.out.println("Interest  : " + interest);
		}else if (option == 2) {
			System.out.println("Principal : " + principal);
			System.out.println("Rate      : " + rate +" or " + SimpleInterest.convertRate(rate));
			System.out.println("Time      : " + time);
		}else if (option == 3) {
			System.out.println("Principal : " + principal);
			System.out.println("Rate      : " + rate +" or " + SimpleInterest.convertRate(rate));
			System.out.println("Time      : " + time);
		}
	}
	
	public float getInterest() {
		return principal * convertRate(rate) * time;
	}
	public float getMonthsInterest() {
		return principal * convertRate(rate) * getMonth();
	}
	public float getExactInterest() {
		return principal * convertRate(rate) * getExact();
	}
	public float getOrdinaryInterest() {
		return principal * convertRate(rate) * getOrdinary();
	}
	public float getWeeklyInterest() {
		return principal * convertRate(rate) * getWeekly();
	}
	public float getMonth() {
		return time / 12;
	}
	public float getExact() {
		return time / 365;
	}
	public float getOrdinary() {
		return time / 360;
	}
	
	public float getWeekly() {
		return time / 52;
	}
	public float getPrincipal() {
		return interest / (convertRate(rate) * time);
	}
	public float getRate() {
		return interest / (principal * time);
	}
	public static float convertRate(float rate) {
		return rate / 100;
	}
	public float convertToPercent() {
		return getRate() * 100;
	}
	public float getTime() {
		return interest / (principal * convertRate(rate));
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
			amount =  principal + (principal * convertRate(rate) * time);
		}else if (option == 3) {
			amount =  principal * (1 * (convertRate(rate) * time));
		}
			return amount;
	}
	
	public void displayInterestSolution(int option) {
		this.option = option;
		if (option == 1) {
			System.out.println("Principal : " + principal);
			System.out.println("Rate      : " + rate + " or " + SimpleInterest.convertRate(rate));
			System.out.println("Time      : " + time);
		}else if (option == 2) {
			System.out.println("Principal : " + principal);
			System.out.println("Rate      : " + rate + " or " + SimpleInterest.convertRate(rate));
			System.out.println("Time      : " + getMonth());
		}else if (option == 3) {
			System.out.println("Principal : " + principal);
			System.out.println("Rate      : " + rate + " or " + SimpleInterest.convertRate(rate));
			System.out.println("Time      : " + sixDecimal.format(getExact()));
		}else if (option == 4) {
			System.out.println("Principal : " + principal);
			System.out.println("Rate      : " + rate + " or " + SimpleInterest.convertRate(rate));
			System.out.println("Time      : " + sixDecimal.format(getOrdinary()));
			
		}else if (option == 5){
			System.out.println("Principal : " + principal);
			System.out.println("Rate      : " + rate + " or " + SimpleInterest.convertRate(rate));
			System.out.println("Time      : " + sixDecimal.format(getWeekly()));
		}else System.out.println("Invalid Input.");
		
	}
	public void displayPrincipalSolution() {
		System.out.println("Interest  : " + interest);
		System.out.println("Rate      : " + rate + " or " + SimpleInterest.convertRate(rate));
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
		System.out.println("Rate      : " + rate +" or " + SimpleInterest.convertRate(rate));
	}
	
	
	
}
