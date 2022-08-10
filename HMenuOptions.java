package lockedme;
import java.util.*;
public class HMenuOptions {

	public static void hWelcomeScreenChoice() {
		boolean flag = true;
		Scanner sc = new Scanner(System.in);
		do {
		try {
		MenuOptions.displayMenu();
		int choice = sc.nextInt();
		switch (choice) {
		case 1:
		FileOperations1.displayAllFiles("main");
		break;
		case 2:
		HMenuOptions.handleFileMenuOptions();
		break;
		case 3:
		System.out.println("Program exited successfully.");
		flag = false;
		sc.close();
		System.exit(0);
		break;
		default:
		System.out.println("Please select a valid option from above.");
		}
		} catch (Exception e) {
		System.out.println(e.getClass().getName());
		hWelcomeScreenChoice();
		}
		} while (flag== true);
		

	}
	public static void handleFileMenuOptions() {
		boolean flag = true;
		Scanner sc = new Scanner(System.in);
		do {
		try {
		MenuOptions.displayFileMenuOptions();
		FileOperations1.createMainFolderIfNotPresent("main");
		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			//File create
		FileOperations1.createFile();
		break;
		case 2:
		// File delete
		 FileOperations1.deleteAllFiles(); 
		
		break;
		case 3:
		// File Search
		FileOperations1.searchFiles();
		break;
		case 4:
		// Go to Previous menu
		return;
		case 5:
		// Exit
		System.out.println("Program exited successfully.");
		flag = false;
		sc.close();
		System.exit(0);
		default:
		System.out.println("Please select a valid option from above.");
		}
		} catch (Exception e) {
		System.out.println(e.getClass().getName());
		handleFileMenuOptions();
		}
		} while (flag == true);
		}

}
