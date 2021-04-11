package ticket_genrator;
import java.util.Scanner;

public class Menu {
	static Scanner sc=new Scanner(System.in);
	
	public static Integer menu() {
		System.out.println("-------Menu-------");
		System.out.println("1.Ticket Genrator");
		System.out.println("2.Deallocate Slot");
		System.out.println("3.Searching");
		System.out.println("------------------");
		System.out.print("Enter your choice :");
		Integer ch=sc.nextInt();
		return ch;
	}
	
}
