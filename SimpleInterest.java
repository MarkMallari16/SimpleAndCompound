package SimpleAndCompund;
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
		System.out.println("\n\t\tYou Chose Simple Interest");
		System.out.println("\t\tFormula : I = P*r*t\n");
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
			return storeAnswer = getExactInterest();
		}
		else if (option == 4) {
			return storeAnswer = getOrdinaryInterest();
		}else if (option == 5) {
			return storeAnswer = getWeeklyInterest();
		}
		return storeAnswer;
	}
	public static void displayPrincipalFormula() {
		System.out.println("\n\t\tYou Chose Principal");
		System.out.println("\t\tFormula : P = I / (r*t)\n");
	}
	public static void displayRateFormula() {
		System.out.println("\n\t\tYou Chose Rate");
		System.out.println("\t\tFormula : r = I / (P * t)\n");
	}
	public static void displayTimeFormula() {
		System.out.println("\n\t\tYou Chose Time");
		System.out.println("\t\tFormula : t = I / (P * r)\n");
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
	public float getPrincipalAnswer(int option) {
		this.option = option;
		float storeAnswer = 0;
		if (option == 1) {
			storeAnswer = interest / (1 + (convertRate(rate) * time));
		}else if (option == 2) {
			storeAnswer = interest / (1 + (convertRate(rate) * getMonth()));
		}else if (option == 3) {
			storeAnswer = interest / (1 + (convertRate(rate) * getExact()));
		}else if (option == 4) {
			storeAnswer = interest / (1 + (convertRate(rate) * getOrdinary()));
		}else if (option == 5) {
			storeAnswer = interest / (1 + (convertRate(rate) * getWeekly()));
		}
		return storeAnswer;
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
		}
	}
	public float getFutureValue(int option) {
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
		//years
		if (option == 1) {
			System.out.println("Principal : " + principal);
			System.out.println("Rate      : " + rate + " converted into decimal " + SimpleInterest.convertRate(rate));
			System.out.println("Time      : " + time);
		//months
		}else if (option == 2) {
			System.out.println("Principal : " + principal);
			System.out.println("Rate      : " + rate + " converted into decimal " + SimpleInterest.convertRate(rate));
			System.out.println("Convert time into years : " + time + " / " + " 12 months = " + sixDecimal.format(getMonth()));
			System.out.println("Time      : " + sixDecimal.format(getMonth()));
		//exact interest
		}else if (option == 3) {
			System.out.println("Principal : " + principal);
			System.out.println("Rate      : " + rate + " converted into decimal " + SimpleInterest.convertRate(rate));
			System.out.println("Convert time into years : " + time + " / " + " 365 days = " + sixDecimal.format(getExact()));
			System.out.println("Time      : " + sixDecimal.format(getExact()));
		//ordinary interest
		}else if (option == 4) {
			System.out.println("Principal : " + principal);
			System.out.println("Rate      : " + rate + " converted into decimal " + SimpleInterest.convertRate(rate));
			System.out.println("Convert time into years : " + time + " / " + " 360 days = " + sixDecimal.format(getOrdinary()));
			System.out.println("Time      : " + sixDecimal.format(getOrdinary()));
		//weeks interest
		}else if (option == 5){
			System.out.println("Principal : " + principal);
			System.out.println("Rate      : " + rate + " converted into decimal " + SimpleInterest.convertRate(rate));
			System.out.println("Convert time into years : " + time + " / " + " 52 weeks = " + sixDecimal.format(getWeekly()));
			System.out.println("Time      : " + sixDecimal.format(getWeekly()));
		}
	}
	public void displayPrincipalSolution(int option) {
		this.option = option;
		//years
		if (option == 1) {
			System.out.println("Interest  : " + interest);
			System.out.println("Rate      : " + rate + " converted into decimal " + SimpleInterest.convertRate(rate));
			System.out.println("Time      : " + time);
		//months
		}else if (option == 2) {
			System.out.println("Interest  : " + interest);
			System.out.println("Rate      : " + rate + " converted into decimal " + SimpleInterest.convertRate(rate));
			System.out.println("Convert time into years : " + time + " / " + " 12 months = " + sixDecimal.format(getMonth()));
			System.out.println("Time      : " + sixDecimal.format(getMonth()));
		//exact interest
		}else if (option == 3) {
			System.out.println("Interest  : " + interest);
			System.out.println("Rate      : " + rate + " converted into decimal " + SimpleInterest.convertRate(rate));
			System.out.println("Convert time into years : " + time + " / " + " 365 days = " + sixDecimal.format(getExact()));
			System.out.println("Time      : " + sixDecimal.format(getExact()));
		//ordinary interest
		}else if (option == 4) {
			System.out.println("Interest  : " + interest);
			System.out.println("Rate      : " + rate + " converted into decimal " + SimpleInterest.convertRate(rate));
			System.out.println("Convert time into years : " + time + " / " + " 360 days = " + sixDecimal.format(getOrdinary()));
			System.out.println("Time      : " + sixDecimal.format(getOrdinary()));
		//weeks interest
		}else if (option == 5) {
			System.out.println("Interest  : " + interest);
			System.out.println("Rate      : " + rate + " converted into decimal " + SimpleInterest.convertRate(rate));
			System.out.println("Convert time into years : " + time + " / " + " 52 weeks = " + sixDecimal.format(getWeekly()));
			System.out.println("Time      : " + sixDecimal.format(getWeekly()));
		}
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
