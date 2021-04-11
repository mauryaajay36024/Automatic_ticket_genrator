package ticket_genrator;


public class Main {
	//Array to allocate 20*5 slots in shopping mall
	static Integer noOfFloors=5;
	static Integer spaceAtEachFloor=20;
	static String[][] slots=new String[noOfFloors*spaceAtEachFloor][];
	 
	public static void main(String[] args) {
		System.out.print("\t\t\t\t\t");
		System.out.print("-------- Automated ticketing system --------");
		System.out.println();
	
		System.out.println();
		while(true) {
		Integer choice =Menu.menu();
			switch(choice) {
			case 1:
				//Ticket generator
				System.out.println();
				System.out.println("----Ticket Genrator---");
				System.out.println();
				
				TicketGenrator.genrate();
				TicketGenrator.ticketGenrated();
				System.out.println();
				break;
				
			case 2:
				//Deallocating ticket
				System.out.println();
				System.out.println("---Deallocating Ticket---");
				System.out.println();
				
				SlotDeallocate.deallocate();
				System.out.println();
				break;
				
			case 3:
				//Searching
				System.out.println();
				
				Searching.search();
				System.out.println();
				break;
				
				
			default:
				System.out.println("You entered a wrong choice !!!");
				System.out.println();
				break;
			}
		}
	}
}
