package lockedme;


class LockedMeMain1 
{
public static void main(String[] args) {
	// Create "main" folder if not present in current folder 
 FileOperations1.createMainFolderIfNotPresent("main");

	MenuOptions.welcomeScreen("LockedMe","Vaishali Zade");
	MenuOptions.displayMenu();
	HMenuOptions.hWelcomeScreenChoice();
}
}