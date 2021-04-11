package ticket_genrator;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class TicketGenrator {
	
	static Scanner sc=new Scanner(System.in);
	//Initial slot for vehicle
	static int slotPosition;
	
	
	//To generate the ticket
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
	//To give the generated ticket to the vehicle driver
	public static void ticketGenrated() {
		String floor = null;
		int position=TicketGenrator.slotPosition+1;
		if(TicketGenrator.slotPosition+1<21) {
			floor="1st Floor";
		}
		else if(position>= 21 && position <=41 ) {
			floor="2nd Floor";	
		}
		else if(position> 41 && position <=61 ) {
			floor="3rd Floor";
		}
		else if(position>61 && position <=81 ) {
			floor="4th Floor";
			
		}else if(position>81) {
			floor="5th Floor";	
		}
		
		System.out.println();
		System.out.println("--------------Ticket---------------");
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
	    Date date = new Date();  
	    System.out.println("Date and Time          :"+formatter.format(date));
		System.out.println("Vehicle Number         :"+Main.slots[TicketGenrator.slotPosition][0]);
		System.out.println("Vehicle Colour         :"+Main.slots[TicketGenrator.slotPosition][1]);
		System.out.println("Vehicle slot available :"+(TicketGenrator.slotPosition+1));
		System.out.println("Floor No               :"+floor);
		System.out.println("------------------------------------");
	}
	
	

}
