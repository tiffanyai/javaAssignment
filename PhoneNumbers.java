import java.util.Scanner;
//Tiffany Streitenberger
/*Purpose: We will have given contacts (first 10 in an array). We will
ask the user to tell us a name, and if the name is present, we do not
add it to the list. If it is, then we will add it to the list. We continue
this until there is no more space in the array.*/

public class PhoneNumbers 
{
    //Constant Variable
    public static final int CONST_SIZE = 12; 

	 public static void main(String [] args)
	 {
	     //Array Size 
	     int count = 10;
        
        //Variable for when Name/Phone# is found
        boolean found = false;
	       
        //New Array Based on Contacts Class 
	     Contacts[] contact = new Contacts[CONST_SIZE];
        
        //Temporarily Assign Un-Assigned Array Values
        for(int i = 0; i < CONST_SIZE; i++)
        {
            contact[i] = new Contacts("N/A ", "000-000-0000");
        }
         
        //ARRAY ASSIGNMENTS FOR FIRST 10 
	     contact[0] = new Contacts("Rick", "635-874-8574");
	     contact[1] = new Contacts("Kim", "726-354-1734");
	     contact[2] = new Contacts("Jake", "465-735-1823");
	     contact[3] = new Contacts("Leslie", "665-388-4526");
	     contact[4] = new Contacts("Robert", "742-744-3834");
	     contact[5] = new Contacts("Lina", "746-561-4853");
        contact[6] = new Contacts("Caren", "948-263-4854");
        contact[7] = new Contacts("Jeremy", "948-251-4853");
        contact[8] = new Contacts("Christina", "859-365-5833");
        contact[9] = new Contacts("Harvy", "659-465-8373");
	     
        //Looping Up To Largest Array Number
	     while(count < CONST_SIZE)
	     {
            //Initially Assigning Found Variable to False
            found = false;
            
	         //Creating new input variable, to ask user
	         Scanner enter = new Scanner(System.in);
	         //Asks question for user
	         System.out.println("Please input the first name (to quit, write quit):");
	         //User's input is stored
	         String outputName = enter.nextLine();
            
            //When User Types "quit" or "Quit"
	         if((outputName.equals("quit"))||(outputName.equals("Quit")))
	         {
                System.out.println("You Have Quit The Program.");
                break;
	         }
            
            //When User Types Name
	         else
	         {
                //Looping For Next Array Value
                for(int i = 0; i < count; i++)
                {
                    //If Entered Name = One Already In Array
                    if(outputName.equals(contact[i].getName()))
                    {
                        //Assigns Found Variable to True
                        found = true;
                        //Prints the Number of the Entered Person
                        System.out.print("Found Contact Number for " + outputName + ": " + contact[i].getNum() + "\n\n");
                        
                    }
                }
                
               //If the Name is Not Found
               if(!found)
               {
                   
                    //Setting Name to New Array Value
                    contact[count].setName(outputName);
                   
                    //Creating new input variable, to ask user
	                 Scanner ent = new Scanner(System.in);
	                 //Asks question for user
	                 System.out.println("What is their phone number? (to quit, write quit):");
	                 //User's input is stored
	                 String outputNum = ent.nextLine();
                    
                    //Setting the Provided Number From User To New Array
                    contact[count].setNum(outputNum);
                    
                    //Incrementing the Count
                    count++;
               }
               
	         }
            
               
	        	 
	      
	      }
	         System.out.println("\nFinal List Of Contacts: ");
            
            //Displaying All Assigned Contacts
	         for(int i = 0; i < CONST_SIZE; i++)
            {
                System.out.print(contact[i].getName() + " ");
                System.out.print(contact[i].getNum() + "\n");
            
            }
	   }
}