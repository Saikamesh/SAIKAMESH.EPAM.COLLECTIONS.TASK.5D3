package EPAM.COLLECTION.LIST;
import java.util.*;
import EPAM.COLLECTION.LIST.set.*;
public class list 
{
	static additems add=new additems();
	static deleteitems delete=new deleteitems();
	static print PRINT=new print();
	
	static int operation;
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int num,num_of_ele;
		boolean choice=true;
		add.initializes_items();
		while(choice) {
			PRINT.printtext("===== Operations on a list of Numericals =====" );
		PRINT.printtext("1. Show current Elements in the list :");
		PRINT.printtext("2. Add Element to the list :");
		PRINT.printtext("3. Add Multiple Elements to the list :");
		PRINT.printtext("4. Remove Elements from the list ");
		PRINT.printtext("5. Remove Multiple Elements from the list");
		PRINT.printtext("6. Print an Element in list");
		PRINT.printtext("7. Print Multiple Elements in list");
		PRINT.printtext("===== Select a Operation to Perform =====");
		
		operation=s.nextInt();
		if(operation<0 && operation>6)
			PRINT.printtext("Invalid Operation Selection ");
			switch(operation)
			{
			case 1:
				PRINT.printtext("The Elements in the List are :");
				PRINT.printobject();
				break;
			case 2:
				PRINT.printtext("Enter the Number You Want to Add in The List :");
				num=s.nextInt();
				add.additem(num);
				break;
			case 3:
				PRINT.printtext("Enter the Number of Elements you want to add to list:");
				num_of_ele=s.nextInt();
				PRINT.printtext("Enter Elements :");
				for(int i=0;i<num_of_ele;i++) {
					num=s.nextInt();
					add.additem(num);
					}
				break;				
			case 4:
				PRINT.printtext("Enter the Index of Number You Want to delete in The List :");
				num=s.nextInt();
				delete.removeitem(num);	
				break;
			case 5:
				PRINT.printtext("Indexes have to choosen Carefully \n After deletion of every element \n the indexes get updated \n");
				PRINT.printtext("Enter the Number of Elements you want to delete in list:");
				num_of_ele=s.nextInt();
				PRINT.printtext("Enter index of Elements :");
				for(int i=0;i<num_of_ele;i++) {
					num=s.nextInt();
					delete.removeitem(num);	
					}
				break;
			case 6:
				PRINT.printtext("Enter the index of the element to print :");
				num=s.nextInt();
				PRINT.printelement(num);
				break;
			case 7:
				PRINT.printtext("Enter the Number of the element to print :");
				num_of_ele=s.nextInt();
				PRINT.printtext("Enter index of Elements :");
				for(int i=0;i<num_of_ele;i++) {
					num=s.nextInt();
				PRINT.printelement(num);
				}
				break;
				
		}
			PRINT.printtext(" ");
			PRINT.printtext("do you want to continue your Operations :");
			PRINT.printtext("True / False ");
			choice=s.nextBoolean();
		
		}
	s.close();
	}
}