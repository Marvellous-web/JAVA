import java.util.*;

public class Forex_Xchange
{
    public double changeToRupees(double amt, int currency){
        double ind_amt;
        if(currency == 1)
            ind_amt = amt*0.67;
        else if(currency == 2)
            ind_amt = amt*74.43;
        else if(currency == 3)
            ind_amt = amt*94.5;
        else if(currency == 4)
            ind_amt = amt*85.3;
        else
            ind_amt = amt*20.25;
        return ind_amt;
            
    }
    public double finalChange(double amt, int currency){
        double ans;
        if(currency == 1)
            ans = amt/0.67;
        else if(currency == 2)
            ans = amt/74.43;
        else if(currency == 3)
            ans = amt/94.5;
        else if(currency == 4)
            ans = amt/85.3;
        else
            ans = amt/20.25;
        return ans;
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Forex_Xchange fx = new Forex_Xchange();
		int curr_currency, mod_currency;
		double amount; 
		System.out.println("1.JPY 2.EUR 3.GBP 4.USD 5.AED"); 
		System.out.println("Enter the Current Currency");
		curr_currency = sc.nextInt();
		System.out.println("Enter the Currency want to change");
		mod_currency = sc.nextInt();
		System.out.println("Enter the amount");
		amount = sc.nextDouble();
		double ind_amount = fx.changeToRupees(amount, curr_currency);
		double ans = fx.finalChange(ind_amount,mod_currency );
		System.out.println("The converted exchange rate is "+ans);
	}
}