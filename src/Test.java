import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		PhoneManagementApp phoneApp = new PhoneManagementApp();
		Scanner scanner = new Scanner(System.in);

		int choise;
		do {
			choise = Menu(scanner);

			switch (choise) {
			case 1:
				System.out.print("Enter the brand: ");
				scanner.nextLine(); 

				String brand = scanner.nextLine();

				System.out.print("Enter the model: ");
				String model = scanner.nextLine();

				System.out.print("Enter the serial number: ");
				String serialNumber = scanner.nextLine();

				System.out.print("Enter the storage capacity (in GB): ");
				int storageCapacity = scanner.nextInt();

				scanner.nextLine();

				System.out.print("Enter the operating system: ");
				String operatingSystem = scanner.nextLine();

				Phone newPhone = new Phone(brand, model, serialNumber, storageCapacity, operatingSystem);
				phoneApp.addPhone(newPhone);
				System.out.println("Phone added successfully!");

				break;
			case 2:
				phoneApp.listPhone();
				break;
			case 3:
				System.out.print("Enter the serial number of the phone to delete: ");
				scanner.nextLine(); 
				String serialNum = scanner.nextLine();
				phoneApp.deletePhone(serialNum);
				break;
			case 4:
				System.out.print("Enter the serial number of the phone to manage: ");
				scanner.nextLine(); 
				String serialNumToManage = scanner.nextLine();
				Phone phoneToManage = null;
				for (Phone phone : phoneApp.phones) {
					if (phone.getSerialNumber().equals(serialNumToManage)) {
						phoneToManage = phone;
						break;
					}
				}
				if (phoneToManage != null) {
					scanner.nextLine();
					phoneOptions(scanner, phoneToManage, phoneApp);
				} else {
					System.out.println("Error: Phone not found.");
				}
				break;

			case 5:
				phoneOptionsMenu(scanner);
				break;
			case 6:
				System.out.println("Exiting...");

				break;
			default:
				System.out.println("You have made an invalid choice.");
				break;
			}
		} while (choise != 6);
	}
	
	private static int Menu(Scanner scanner) {
		System.out.println("Main Manu");
		System.out.println("1. Add phone");
		System.out.println("2. List all phones");
		System.out.println("3. Delete phone");
		System.out.println("4. Choose phone");
		System.out.println("5. Phone options");
		System.out.println("6. Exit");
		System.out.println("Choise:  ");
		System.out.println();
		return scanner.nextInt();
	}

	private static void phoneOptions(Scanner scanner, Phone phone, PhoneManagementApp phoneApp) {
		int choice;
		do {
			choice = phoneOptionsMenu(scanner);

			switch (choice) {
			case 1:
				contactOptions(scanner);
				break;
			case 2:
				appOptions(scanner);
				break;
			case 3:
				phoneApp.checkStorage(phone);

				break;
			case 4:
				System.out.println("Returning to the main menu...");

				break;
			default:
				System.out.println("You have made an invalid choice.");
				break;
			}
		} while (choice != 4);
	}

	private static int phoneOptionsMenu(Scanner scanner) {
		System.out.println("Phone Options");
		System.out.println("1. Contacts");
		System.out.println("2. Apps");
		System.out.println("3. Check Storage");
		System.out.println("4. Back to main menu");
		System.out.print("Choice: ");
		System.out.println();
		return scanner.nextInt();
	}

	private static void contactOptions(Scanner scanner) {
		int choice;
		do {
			choice = contactOptionsMenu(scanner);

			switch (choice) {
			case 1:

				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				System.out.println("Returning to phone options...");

				break;
			case 5:
				break;
			case 6:
				break;
			default:
				System.out.println("You have made an invalid choice.");
				break;
			}
		} while (choice != 6);
	}

	private static int contactOptionsMenu(Scanner scanner) {
		System.out.println("Contact Options");
		System.out.println("1. List Contacts");
		System.out.println("2. Add Contact");
		System.out.println("3. Delete Contact");
		System.out.println("4. Call");
		System.out.println("4. Back to phone options");
		System.out.println("5. Üst Menüye Dön");
		System.out.print("Choice: ");
		System.out.println();
		return scanner.nextInt();
	}

	private static void appOptions(Scanner scanner) {
		int choice;
		do {
			choice = appOptionsMenu(scanner);

			switch (choice) {
				case 1:
					break;
				case 2:
				break;
				case 3:
				break;
				case 4:
					System.out.println("Returning to phone options...");
					break;
				default:
					System.out.println("You have made an invalid choice.");
					break;
			}
		} while (choice != 4);
	}

	private static int appOptionsMenu(Scanner scanner) {
		System.out.println("App Options");
		System.out.println("1. List Apps");
		System.out.println("2. Add App");
		System.out.println("3. Delete App");
		System.out.println("4. Back to phone options");
		System.out.print("Choice: ");
		return scanner.nextInt();
	}

}
