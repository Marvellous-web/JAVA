import java.util.*;

class cricket

{
public static void main(String args[ ])

{

int aus,eng,newz;
String winner;

Scanner sc = new Scanner(System.in);
System.out.println("Enter the scores for Australia");

aus=sc.nextInt();
System.out.println("Enter the scores for England");
eng=sc.nextInt();
System.out.println("Enter the scores for New Zealand");
newz=sc.nextInt();

if(aus==eng==newz)
{
	System.out.println("Nobody won");
}


winner=(aus>eng) ? (aus>newz ? "Austrailia won "+aus : "New Zealand won "+newz ) : (eng>newz ? "England won "+eng:"New Zealand won "+newz); ; 
System.out.println("Team "+winner);


}

}





