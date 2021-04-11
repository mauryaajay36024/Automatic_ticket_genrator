package ticket_genrator;
import java.util.Scanner;

public class Searching {
	static Scanner sc=new Scanner(System.in);
	
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
	
	public static void searchByRegistration() {
		System.out.print("Enter Registration No to Search the car's slot No:");
		String rc=sc.nextLine();
		int flag=0;
		for (int i = 0; i < Main.slots.length; i++) {
			if(Main.slots[i] !=null && Main.slots[i][0].equals(rc)) {
				flag=1;
				System.out.println();
				System.out.println("Vehicle slot No is :"+(i+1));
				break;
				
			}
		}
		if(flag==0) {
			System.out.println();
			System.out.println("Vehicle No is incorrect or not found");
		}	
	}
	
	//Method to search car registration by there colour
	public static void rnByColour() {
		System.out.println();
		System.out.print("Enter Colour to find out Registration Numbers :");
		String colour=sc.nextLine();
		System.out.println();
		int flag =0;
		for (int i = 0; i < Main.slots.length; i++) {
			if(Main.slots[i] !=null && Main.slots[i][1].equals(colour)) {
				flag =1;
				System.out.println("Car Registration Number :"+Main.slots[i][0]);
			}
			
		}
		if(flag == 0) {
			System.out.println("This colour car is not parked yet !!");
		}
		
	}
	
	//Method to find slot no by the car colour
	public static void slotByColour() {
		System.out.println();
		System.out.print("Enter Colour to find out Slot Numbers :");
		String colour=sc.nextLine();
		System.out.println();
		int flag=0;
		for (int i = 0; i < Main.slots.length; i++) {
			if(Main.slots[i] !=null && Main.slots[i][1].equals(colour)) {
				flag=1;
				System.out.println("Car Slot Number :"+(i+1));
			}
			
		}
		if(flag==0) {
			System.out.println("This colour car is not parked yet !!");
		}
		
	}
	
	
	
	public static void search() {
		int choice=Searching.searchMenu();
		switch(choice) {
		case 1:
			//search by colour
			int ch=Searching.colourMenu();
			switch(ch) {
			case 1:
				//Registration numbers of all cars of a particular colour.
				Searching.rnByColour();
				break;
				
			case 2:
				//Slot numbers of all slots where a car of a particular colour is parked.	
				Searching.slotByColour();
				break;
				
			default:
				System.out.println("Wrong choice !!!!");
				break;
			}
			break;

		case 2:
			//search by registration
			Searching.searchByRegistration();
			break;
			
		default:
			System.out.println("Wrong choice !!!");
		}
	}

}
