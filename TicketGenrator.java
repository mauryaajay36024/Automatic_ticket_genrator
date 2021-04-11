package ticket_genrator;
import java.util.Scanner;

public class TicketGenrator {
	
	static Scanner sc=new Scanner(System.in);
	//Initial slot for vehicle
	static int slotPosition;
	
	
	//To genrate the ticket
	public static void genrate() {
		
		String[][] slots=Main.slots;
		
		for (int i = 0; i < slots.length; i++) {
			if(slots[i]==null) {
				
				System.out.print("Enter Vehicle No :");
				String vehicleNo=sc.nextLine();
				System.out.print("Enter Vehicle Colour :");
				String colour=sc.nextLine();
				slots[i]=new String[2];
				slots[i][0]=vehicleNo;
				slots[i][1]=colour;
				//As array will start from 0
				slotPosition=i;
				break;
			}
			
		}
	}
	//To give the genrated ticket to the vehicle driver
	public static void ticketGenrated() {
		System.out.println();
		System.out.println("--------------Ticket---------------");
		System.out.println("Vehicle Number         :"+Main.slots[TicketGenrator.slotPosition][0]);
		System.out.println("Vehicle Colour         :"+Main.slots[TicketGenrator.slotPosition][1]);
		System.out.println("Vehicle slot available :"+(TicketGenrator.slotPosition+1));
		System.out.println("------------------------------------");
	}
	
	

}
