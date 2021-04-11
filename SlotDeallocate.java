package ticket_genrator;
import java.util.Scanner;

public class SlotDeallocate {
	static Scanner sc=new Scanner(System.in);

	public static void deallocate() {
		System.out.print("Enter Vehicle No to Deallocate :");
		String vehicleNo=sc.nextLine();
		int flag=0;
		for (int i = 0; i < Main.slots.length; i++) {
			if(Main.slots[i] !=null && Main.slots[i][0].equals(vehicleNo)) {
				Main.slots[i]=null;
				//to indicate that slot is de-allocated
				flag=1;
				System.out.println();
				System.out.println("Slot No "+ (i+1) +" is deallocated");
				System.out.println();
				break;
			}
		}
		if(flag == 0) {
			System.out.println("Wrong Vehivcle No !!!");
		}
	}
}
