import java.util.*;
public class Main
{
    public int quantity(int q){
        if(q<10)
            return q;
        else{
            return(quantity(q-10)+10+1);
        }
    }
	public static void main(String[] args) {
		int amount, each_price, alr_pur;
		Scanner sc = new Scanner(System.in);
		Main obj = new Main();
		System.out.println("Enter amount");
		amount = sc.nextInt();
		System.out.println("Enter Each Price");
	    each_price = sc.nextInt();
		System.out.println("Enter Already Purchased");
		alr_pur = sc.nextInt();
		
		int ans = obj.quantity(amount/each_price);
		System.out.println(ans);
		
		
	}
}