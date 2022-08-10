package lockedme;
import java.io.*;
import java.nio.*;
import java.nio.file.*;
import java.nio.file.Path;
import java.nio.file.Paths;

import java.util.*;
public class FileOperations1 {

	public static void createMainFolderIfNotPresent(String folderName) {
		File file = new File(folderName);
		// If file doesn't exist, create the main folder
		if (!file.exists()) {
		file.mkdirs();
		}
	}
		
	public static void displayAllFiles(String path) {
		FileOperations1.createMainFolderIfNotPresent("main");
		
		System.out.println("Displaying all files in ascending order\n");
						
		try {
			File folder = new File(path);
			File[] listOfFiles = folder.listFiles();
			if(listOfFiles.length==0)
			{
			System.out.println("No Files exist");
			}
			else
			{
			for(File l:listOfFiles)
			{
			System.out.println(l.getName());
			}
			}
			
			}
			catch(Exception ex)
			{
				System.out.println("Error Ocuccured" );
				ex.printStackTrace();
			}
	}
	public static void createFile() {
				
		FileOperations1.createMainFolderIfNotPresent("main");
			
			try {
				
				Scanner sc = new Scanner(System.in);
				String fileName;
				System.out.println("Enter the filename: ");
				fileName = sc.nextLine();
				Path pathToFile = Paths.get("./main/" + fileName);
						
				System.out.println(fileName + " created successfully");
			System.out.println("Would you like to add some data to the file? (Y/N)");
			String choice = sc.next().toUpperCase();
			sc.nextLine();
			if (choice.equals("Y")) {
								 				 
			System.out.println("\n Enter data and press enter.\n");
			String content = sc.nextLine();
							
			Files.write(pathToFile, content.getBytes());
			
			System.out.println("\n Data written to file " + fileName);
			
			}
			} catch (IOException e) {
				System.out.println("Error Ocuccured" );
				e.printStackTrace();
			}
			}
		
		
		
		
		
	
		public static void deleteAllFiles()
	{
	Scanner obj = new Scanner(System.in);
	try
	{
	String fileName;
	System.out.println("Enter the file name to be deleted");
	fileName = obj.nextLine();
	File file = new File("main" +"\\"+fileName);
	if(file.exists())
	{
	file.delete();
	
	System.out.println(fileName+ " File deleted SuccessFully.");
	}
	else
	System.out.println("File do not exists");
	}
	catch(Exception ex)
	{
		System.out.println("Error Ocuccured" );
	    ex.printStackTrace();
	}
			
	}
		
	public static void searchFiles()
	{
	Scanner obj = new Scanner(System.in);
	try
	{
	String fileName;

	System.out.println("Enter the file name to be Searched");
	fileName = obj.nextLine();
	File folder = new File("main");
	File[] listOfFiles = folder.listFiles();
	LinkedList<String> filenames = new LinkedList<String>();
	for(File l:listOfFiles)
	   filenames.add(l.getName());
	if(filenames.contains(fileName))
	System.out.println("File is available");
	else
	System.out.println("File is not available");
	}
	catch(Exception ex)
	{
		System.out.println("Error Ocuccured" );
		ex.printStackTrace();
	} 
	
	
	
	}

		
}
			
		
	