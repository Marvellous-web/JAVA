import java.util.*;
public class Calendar1
{
    public boolean yearIsLeap(int year){
        if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0))
            return true;
        else
            return false;
    }
    
    public int monthHasDays(int month, boolean year_is_leap){
        if(month == 1)
            return 31;
        else if(month == 2){
            if(year_is_leap==false)
                return 28;
            else
                return 29;
        }
        else if(month == 3)
            return 31;
        else if(month == 4)
            return 30;
        else if(month == 5)
            return 31;
        else if(month == 6)
            return 30;
        else if(month == 7)
            return 31;
        else if(month == 8)
            return 31;
        else if(month == 9)
            return 30;
        else if(month == 10)
            return 31;
        else if(month == 11)
            return 30;
        else if(month == 12)
            return 31;
        return 0;    
    } 
	public static void main(String[] args) {
	    Calendar1 m =new Calendar1();
		int month, year, day;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Year");
        year = sc.nextInt();
        boolean year_is_leap = m.yearIsLeap(year);
        System.out.println("Enter the Month");
        month = sc.nextInt();
        int days = m.monthHasDays(month, year_is_leap);
        System.out.println("Enter day of week");
        day = sc.nextInt();
		int date =1,i;
		System.out.println("Sun     " + "Mon     "+"Tue     "+"Wed     "+"Thu     "+"Fri     "+"Sat    ");
		for(i=1 ; i<=7 ; i++){
		    if(day == i){
		        System.out.print(date+"\t");
		        ++date;
		    }
		    else if(i < day)
		        System.out.print("\t");
		    else
		        break;

		}
		while(days>=date){
    		for(; i<=7 ; i++){
    		    if(date <= days)
    		        System.out.print(date+"\t");
    		    else
    		        break;
    		    ++date;
    		}
    		System.out.println();
    		i=1;
		}
	}
}