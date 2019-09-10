/**
 * 
 */

import java.util.Scanner;
/**
 * @author Adrien
 *
 */
public class LabInventory {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//the welcoming statement
		System.out.println("         ****************************************************");
		System.out.println("                               Welcome ");
		System.out.println("                                  to   ");
		System.out.println("                      Adrien's data base inventory ");
		System.out.println("         ****************************************************");
		
		//for input of data
		Scanner keys = new Scanner(System.in);
		
		String PASSWORD = "DitProg123";  // constant for password
		
		//declaring variables
	    String item_id ;
		String name ;
		String description ;
		String category;
		String supplier_name;
		int contact ;
		double price ;
		int quantity ;
		boolean w = true;
		boolean a = true;
		int time = 0;
		
		//the total size of the inventory list
		System.out.println("the length of the list ? ");
		int size = keys.nextInt();

		//creating an array named itemDatabase

		Item [] itemDatabase = new Item[size];
	
		//loop valid only if w = true
		while (w == true) {
				
				//the main menu
				System.out.println(" ");
				System.out.println("------------------------------------------------------------------------------------");
				System.out.println("What do you want to do ? ");
				System.out.println(" 	  1. Enter a new Item to the inventory (password required)	    ");
				System.out.println(" 	  2. Change information of an existing Item (password required) ");
				System.out.println("  	  3. Display all the Items with the specified category          ");
				System.out.println("      	4. Display all Items to be re-ordered                       ");
				System.out.println(" 	  5. Number of Items currently in store                         ");
				System.out.println("	  6. Quit                                                       ");
				System.out.println("------------------------------------------------------------------------------------");

				System.out.print("Please enter your choice > ");//to chose an ability from the menu
				String ans = keys.next();
				System.out.println(" ");
				
				
				if (ans.equalsIgnoreCase("1")){
							// validity of the password			
				    for (int count = 0 ;count <3 ;count++) {
						System.out.print(" Password : ");
						String pass = keys.next();					
						
						//if it is valid
						if (pass.equalsIgnoreCase(PASSWORD)) {
							System.out.println("Please enter the number of object you want to add to the item data base : ");
							int n = keys.nextInt();//the num of item that would be input now
							Item [] itemDatabase1 = new Item[n];
							
							if (n>size) {
								System.out.println("The number of item to be input exceeds that of the inventory capacity ");
								break;
							}
							
							System.out.println("Please enter the name of the object in the list and its corresponding characteristics : "); 
							
							for (int i=0 ; i < n ; i ++)
								
							{ 	System.out.println(" ");
							int b = Item.totalitems();
								System.out.println((b+1) + " item of the inventory :" );
								

								System.out.print(" Item id : ");
								item_id = keys.next();
								


								System.out.print(" name : ");
								name = keys.next();
								
								System.out.print(" description : ");
								description = keys.next();
								
								System.out.print(" category : ");
								category = keys.next();
								
								System.out.print(" supplier name : ");
								supplier_name = keys.next();
								
								System.out.print(" contact number : ");
								contact = keys.nextInt();
								
								while (true) {
									System.out.print(" price : ");
									price  = keys.nextDouble();
									//validation of price
									if (price <0 ) {
										System.out.println("Price cannot be less than 0 ! Please reset price.");
									}
									else {
										break;
									}
								}
								System.out.print(" quantity : ");
								quantity = keys.nextInt();
								
								//setting the corresponding details inside of the array 
								itemDatabase1[i]= new Item(item_id, name, description, category, supplier_name, contact, price, quantity );
								itemDatabase1[i].setItem_id(item_id);
								itemDatabase1[i].setName(name);
								itemDatabase1[i].setDescription(description);
								itemDatabase1[i].setCategory(category);
								itemDatabase1[i].setSupplier_name(supplier_name);
								itemDatabase1[i].setContact(contact);
								itemDatabase1[i].setPrice(price);
								itemDatabase1[i].setQuantity(quantity);
								
								b = Item.totalitems();
	                            itemDatabase[(b-1)]=itemDatabase1[i];
							}
							System.out.println(" ");
							System.out.println("Item ID "+ " Name " + " Description " + " Category " + " Supplier Name " + " Contact "+ " Price " + " Quantity ");
							int b = Item.totalitems();// act as a boundary for the "for loop" to stop  
							for (int j=0; j<b ; j++ ) {
							 System.out.println(itemDatabase[j]);
							}
							
							break;
										
						}
						else if (!pass.equalsIgnoreCase(PASSWORD) && count!=2) {
							
							System.out.println("Incorrect password. You have " +(2 - (count)) + " chance left."); }
						else if (count == 2 && !pass.equalsIgnoreCase(PASSWORD)) {

								time++;
								if (time == 4) {
									System.out.println("");
									System.out.println("Program detected suspicious activity and terminating!");
									w = false;	
									break;
								}
								else {
								break;}					
						    }
						  
					    }   
					   
				   
				}
				
				else if (ans.equalsIgnoreCase("2")) {
					int count = 0 ;
					a = true;	
				    	while (a == true) {
				    		
							System.out.print(" Password : ");
							String pass = keys.next();
						     if (!pass.equalsIgnoreCase(PASSWORD) && count!=2) {
								
								System.out.println("Incorrect password. You have " +(3 - (count+1)) + " chance left.");
							     count++; }
						    
							  else if (count == 2 && !pass.equalsIgnoreCase(PASSWORD)) {
						    	   a = false;
						    		}			
						
				    	
							  else if (pass.equalsIgnoreCase(PASSWORD)) {
									System.out.print("enter the item id you want to update : ");
									String id_input = keys.next();
									
									int b = Item.totalitems();
									for (int i=0 ; i <b; i++ ) {
											String q = itemDatabase[i].getItem_id();
									    if(id_input.equalsIgnoreCase(q)) {
									    	
								     	     System.out.println("Your desired item :");
									         System.out.println(itemDatabase[i]);
									//displaying the corresponding characteristic wrt the item selected 
										System.out.println("Item ID : " + itemDatabase[i].getItem_id());
										System.out.println("Name : " + itemDatabase[i].getName());
										System.out.println("Description : " + itemDatabase[i].getDescription());
										System.out.println("Category : " + itemDatabase[i].getCategory());
										System.out.println("Supplier Name : " + itemDatabase[i].getSupplier_name());
										System.out.println("Contact : " + itemDatabase[i].getContact());
										System.out.println("Price : " + itemDatabase[i].getPrice());
										System.out.println("Quantity : " + itemDatabase[i].getQuantity());
										
										System.out.println(" ");
										
										//menu for what to changed from our selected item details 
									while(true) {
											System.out.println("What do you want to change ");
											System.out.println("     1. Name "+ "\n" + "     2. Description " + "\n" + "     3. Category " +"\n " + "     4.Supplier Name " +
											"\n" + "     5.Supplier Contacts " + "\n" + "     6.Price " + "\n" + "     7.Available qty" + "\n" + "     8.Quit" + "\n" +"choice >" );
											
											// selecting what to change from the menu provided
											String choice = keys.next();
											if (choice.equalsIgnoreCase("1")) {
												System.out.print("New Name : ");
												name = keys.next();
												
												itemDatabase[i].setName(name);
												System.out.println(itemDatabase[i]);
											
											}
											else if (choice.equalsIgnoreCase("2") ) {
												System.out.print("New Description : ");
												description = keys.next();
												
												itemDatabase[i].setDescription(description);
												System.out.println(itemDatabase[i]);
												
											}
											else if (choice.equalsIgnoreCase("3")) {
												System.out.print("New Category : ");
												category = keys.next();
												
												itemDatabase[i].setCategory(category);
												System.out.println(itemDatabase[i]);
												
											}
											else if (choice.equalsIgnoreCase("4")) {
												System.out.print("New Supplier Name : ");
												supplier_name = keys.next();
												
												itemDatabase[i].setSupplier_name(supplier_name);
												System.out.println(itemDatabase[i]);
											}
											else if(choice.equalsIgnoreCase("5")) {
												System.out.print("New Supplier Contact : ");
												contact = keys.nextInt();
												
												itemDatabase[i].setContact(contact);
												System.out.println(itemDatabase[i]);
												
											}
											else if(choice.equalsIgnoreCase("6")){
												while (true) {
													System.out.print("New price : ");
													price  = keys.nextDouble();
													//validation of price
													if (price <0 ) {
														System.out.println("Price cannot be less than 0 ! Please reset price.");
													}
													else {
														break;
													}
												}
					
												
												itemDatabase[i].setPrice(price);
												System.out.println(itemDatabase[i]);										
											}
											else if(choice.equalsIgnoreCase("7")) {
												System.out.print("New Available quantity : ");
												quantity = keys.nextInt();
												
												itemDatabase[i].setQuantity(quantity);
												System.out.println(itemDatabase[i]);
											}
	
											else if(choice.equalsIgnoreCase("8")){
												a = false;
												break;
										}
											//executed only if the choice is not in the range of 1-8
										else {
											System.out.println("Choose between 1-8 only.");
										}
									}
										 }

									}
							}
	
				    }}
				// to fing items with same category
				else if (ans.equalsIgnoreCase("3")) {
					System.out.print("Please insert Category of items :" );
					String input_cat = keys.next();
					int b = Item.totalitems();
					for (int i=0; i <b; i++) {
						String y = itemDatabase[i].getCategory();
					 if(input_cat.equalsIgnoreCase(y)) {
						 System.out.println(itemDatabase[i].findItemByCat());						
					 	}
		
					}
				}
				//to display items that are out of stock and the remaining one which are on the inventory 
				else if (ans.equalsIgnoreCase("4")) {
					int b = Item.totalitems();
						System.out.println("");
						System.out.println("your re-ordered inventory is ");
						//display items that are not out of stock
					for (int i=0 ; i <b; i++) {
						//if quantity of items < 5 they are classified as out of stock
						if(itemDatabase[i].getQuantity()<5) {		
						}
						else {
							System.out.println(itemDatabase[i]);
						}
					}
					//display items that ran out of stock
					for (int j=0 ; j <b; j++) {
						
						if(itemDatabase[j].getQuantity()<5) {		
							System.out.println("");
					System.out.println("The item with the Id : "+ itemDatabase[j].getItem_id() +" ran out of stock.");
					}
					}
					
				}
				//display the total item added so far
				else if (ans.equalsIgnoreCase("5")) {
					System.out.print("The total number of items which have been created so far : ");
					Item.totalitem();
				} 
				
				//the ending of the program
				else if(ans.equalsIgnoreCase("6")) {
					System.out.println("*****************************");
					System.out.println("            Exit             ");
					System.out.println("     program is ending       ");
					System.out.println("*****************************");
					w = false;
					break;
				}
				//apply only if ans choose is not in the range of 1-6
				else  {
					System.out.println("Please choose between 1-6 !");
				}

}

	keys.close();
	}
	
}
