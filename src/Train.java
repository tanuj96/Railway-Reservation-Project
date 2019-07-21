import java.util.Scanner;

class Reservation{
	public void display()
	{
	System.out.println("Welcome to India Railway");
}
	
public void functionality()
{
	String a = "Book";
	String b = "Cancel";
	String c = "Print Booked Tickets";
	System.out.println("1: " + a);
	System.out.println("2: " + b);
	System.out.println("3: " + c);
}
public void select()
{  
	int i=0;
	Scanner sc = new Scanner(System.in);
	i = sc.nextInt();
	switch(i)
	{
		case 1: 
			System.out.println("Book ur tickets");
			System.out.println("9 :"+ "Back");
			break;
		case 2:
			System.out.println("Cancel ur tickets");
			System.out.println("9 :"+ "Back");
			break;
		case 3:
			System.out.println("Print ur tickets");
			System.out.println("9 :"+ "Back");
			break;
		default:
			System.out.println("9 :"+ "No Match");
	}
}
}
public class Train {

	public static void main(String[] args) {
		Reservation obj = new Reservation();
		obj.display();
		obj.functionality();
		obj.select();
		int j=0;
	Scanner jn = new Scanner(System.in);
	j = jn.nextInt();
	if(j==9)
	{
		obj.display();
		obj.functionality();
		obj.select();
	}
	
	}

}
