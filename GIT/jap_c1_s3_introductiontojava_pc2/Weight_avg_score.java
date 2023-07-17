import java.util.*;
class Weight_avg_score
{
public static void main(String args[])
{
float assign,proj,quiz,midt,fin,total;
Scanner sc=new Scanner(System.in);
assign=sc.nextFloat();
proj=sc.nextFloat();
quiz=sc.nextFloat();
midt=sc.nextFloat();
fin=sc.nextFloat();
assign=0.1f*assign;
proj=0.35f*proj;
quiz=0.1f*quiz;
midt=0.15f*midt;
fin=0.3f*fin;
total=fin+midt+quiz+proj+assign;
System.out.println("Weights      % Value of score");
System.out.println("Assignment  "+assign);
System.out.println("proj  "+proj);
System.out.println("Quiz  "+quiz);
System.out.println("Mid term  "+midt);
System.out.println("Final exam  "+fin);
System.out.println("Assignment  "+assign);


System.out.println("Overall Percentage "+total+"%");
}
}
