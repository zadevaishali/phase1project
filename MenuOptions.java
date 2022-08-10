package lockedme;

 class MenuOptions {

	
		public static void welcomeScreen(String appName,String developerName)
		{
			String companyDetails=String.format("******************************************************\n"
		+"Welcome to %s.com\n"+"This application is developed by ** %s **\n"+"******************************************************\n",
					 appName, developerName);
			String appDetails="You can use this application to:-\n"+"Retrive all file names\n"+"Add,Search,Delete files\n"+"\nPlease enter correct file name for searching or deleting file.";
			System.out.println(companyDetails);
			System.out.println(appDetails);
		}
		public static void displayMenu()
		{
			String menu="\nSelect any choice from below and press Enter:\n"+
		     "1)Retrive all files\n"+"2)Display menu for File operations\n"+"3)Exit Program\n";
			System.out.println(menu);
		}
		public static void displayFileMenuOptions()
		{
			String fileMenu="\nSelect any choice from below and press Enter:\n"+"1)Add a file\n"+"2)Delete a file\n"+"3)Search for a file\n"+"4)Show Previous Menu\n"+"5)Exit program\n";
			System.out.println(fileMenu);
		}

		
	}


