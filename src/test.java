import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class test 
{
    public static void main(String[] args)  
    {   System.out.println("   WELCOME TO Virtual Key for Your Repositories \n   DEVELOPER NAME:BUKKE SAI KUMAR NAIK ");
        File folder = new File("C:\\Users\\naiks\\Bukke Sai Kumar Naik");
        folder.mkdirs(); // Created a Directory named Project and inside it created a main folder
        Scanner scan = new Scanner(System.in);
       
        while(true)
        {       	
            System.out.println("***The following functions are : ***\n");
            System.out.println("1.Retrieving the file names in an ascending order:\n");
            System.out.println("2.Business-level operations: \n");
            System.out.println("3.Option to close the application:\n");
            System.out.println("Enter your choice which you want to select:\n");
            int choice = scan.nextInt();
            switch(choice)
            {
                case 1:

                    File arr[] = folder.listFiles();
                    Arrays.sort(arr);

                    for(int i=0;i<arr.length;i++)
                        System.out.println(arr[i]);
                        break;
                case 2:
                    Boolean temp = true;
                    while(temp)
                    {
                        System.out.println("Option 1 :- To Add a file in the existing Directory");
                        System.out.println("Option 2 :- To Delete a file from the existing Directory. ");
                        System.out.println("Option 3 :- To Search a user specified file from the Directory");
                        System.out.println("Option 4 :- Back to the previous menu");
                        System.out.println("Option 5 :- Terminate Program");


                        int choice2 = scan.nextInt();
                        
                        switch (choice2) 
                        {
                            case 1:
                                /*File f = new File("C:\Users\naiks\Bukke Sai Kumar Naik");*/
                                System.out.println("Enter a file name:");
                                String name = scan.next();
                                if(new File(folder,name).exists())
                                {
                                    System.out.println("file already exist");
                                }
                                else 
                                {
                                    File folder1 = new File(folder, name);
                                    folder1.mkdir();
                                    if (new File(folder, name).exists()) 
                                    {
                                        System.out.println("file added successfully");
                                    }
                                }
                                break;


                            case 2:
                                System.out.println("Enter a file name: ");
                                String name1 = scan.next();
                                boolean folder2 = new File(folder, name1).exists();
                                System.out.println(folder2);
                                if (folder2 == true) 
                                {
                                    File folder3 = new File(folder, name1);
                                    folder3.delete();
                                    System.out.println("File successfully deleted");
                                } else
                                {
                                    System.out.println("file does not exist");
                                }
                                break;

                            case 3:
                                System.out.println("Enter a keyword to search File:");
                                String search = scan.next();
                               File arr1[] = folder.listFiles();
                                for(int i=0;i<arr1.length;i++){
                                    if(arr1[i].getName().startsWith(search)){
                                        System.out.println("File Found");
                                      
                                    }else{
                                        System.out.println("No file found");
                                    }
                                }
                          break;
                                      
                            case 4:
                                temp = false;
                                break;

                            
                            case 5:

                                System.out.println("*********Program Terminated Successfully***********");
                                System.exit(0);
                            default:
                                System.out.println("Enter Correct input");

                        }

                    }
                    break;

                case 3:
                    System.out.println("*********Thank You***********");
                    System.exit(0);

                default:
                    System.out.println("Choose the Correct Option ");
                    break;

            }
        }
    }

}

