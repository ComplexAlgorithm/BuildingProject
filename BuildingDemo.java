import java.util.Scanner;
public class BuildingDemo {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		Building [] annandaleCampusArray = new Building[10];
		int numberOfBuildings = 0;
		int option;
		
		do {
			System.out.println("Press 1 to add Building");
			System.out.println("Press 2 to look at all the Buildings");
			System.out.println("Press 3 to end the program");
			option = keyboard.nextInt();
			keyboard.nextLine(); //go to the next line
			
			if(option == 1) {
				System.out.println("What is the name of the new Building?");
				String newName = keyboard.nextLine();
				
				System.out.println("How many rooms are in the new Building?");
				int newNumberOfRooms = keyboard.nextInt();
				
				Building currentBuilding = new Building(); //creates an object of the Building
				currentBuilding.setName(newName);
				currentBuilding.setNumberOfRooms(newNumberOfRooms);
				
				if(numberOfBuildings < annandaleCampusArray.length) {
					annandaleCampusArray[numberOfBuildings] = currentBuilding;
					numberOfBuildings++;
				}
				else {
					System.out.println("There are no room for any additional buildings.");
				}
			}
			else if(option == 2) {
				//loop through the array printing the name and the number of rooms for each building
				String newName;
				int newNumberOfRooms = 0;
				for(int i = 0; i < numberOfBuildings; i++) {
					System.out.println("The building name is: " + annandaleCampusArray[i].getName());
					System.out.println("The number of rooms in the building are: " + annandaleCampusArray[i].getNumberOfRooms());
				}
			}
			else if(option == 3) {
				//print thank you for using the program
				System.out.println("Thank you for using the program!");
			}
			else {
				//print error, invalid option, try again
				System.out.println("Error! Invalid option!");
			}
		}while(option != 3);
		

	}

}


