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
	
	
	public static int searchMenu() {
		System.out.println("---Search Menu---");
		System.out.println("1.Search by Colour");
		System.out.println("2.Search by Registration No");
		System.out.println();
		System.out.print("Enter Your choice:");
		int ch1=sc.nextInt();
		sc.nextLine();
		return ch1;
	
	}
	
	
	public static int colourMenu() {
		System.out.println();
		System.out.println("---Search By Colour---");
		System.out.println();
		System.out.println("1.Registration numbers of all cars of a particular color");
		System.out.println("2.Slot numbers of all slots where a car of a particular color is parked");
		System.out.println();
		System.out.print("Enter Your choice:");
		int ch2=sc.nextInt();
		sc.nextLine();
		return ch2;
	
	}
	
}
