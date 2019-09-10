import java.lang.reflect.Array;

/**
 * 
 */

/**
 * @author Adrien
 *
 */
public class Item {
	// define attributes
	private String item_id;
	private String name ;
	private String description ;
	private String category;
	private String supplier_name;
	private int contact;
	private double price;
	private int quantity;
	static int totalItems = 0 ;
	
	/*
	 * default constructor
	 */
	public Item() {
		item_id = null;
		name = null;
		description = null;
		category = null;
		supplier_name = null;
		contact = 0;
		price = 0.0;
		quantity = 0;
		
		
	}
	
    /**
     *overloaded constructor
     * @param item_id
     * @param name
     * @param description
     * @param category
     * @param supplier_name
     * @param contact
     * @param price
     * @param quantity
     */
	public Item(String item_id, String name, String description, String category, String supplier_name, int contact, double price, int quantity ) {
	this.item_id = item_id;
	this.name = name ; 
	this.description = description;
	this.category = category;
	this.supplier_name = supplier_name;
	this.contact = contact;
	this.price = price;
	this.quantity = quantity;
	totalItems++;
	}
	public Item(String item_id) {
		this.item_id=item_id;
	}
	/**
	 * @return the item_id
	 */
	public String getItem_id() {
		return item_id ;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @return the category
	 */
	public String getCategory() {
		return category;
	}

	/**
	 * @return the supplier_name
	 */
	public String getSupplier_name() {
		return supplier_name;
	}

	/**
	 * @return the contact
	 */
	public int getContact() {
		return contact;
	}

	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * @return the quantity
	 */
	public int getQuantity() {
		return quantity;
	}

	/**
	 * @param item_id the item_id to set
	 */
	public void setItem_id(String item_id) {
		this.item_id = item_id;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @param category the category to set
	 */
	public void setCategory(String category) {
		this.category = category;
	}

	/**
	 * @param supplier_name the supplier_name to set
	 */
	public void setSupplier_name(String supplier_name) {
		this.supplier_name = supplier_name;
	}

	/**
	 * @param contact the contact to set
	 */
	public void setContact(int contact) {
		this.contact = contact;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}

	/**
	 * @param quantity the quantity to set
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	/**
	 * return the item_id, name, description, category, supplier_name, contact, price, quantity
	 */
	public String toString() {
		return(this.item_id + "  " + this.name+ "  " + this.description + "  " + this.category + "  "+ this.supplier_name + "  "+ this.contact+ "  " + this.price+ "  " + this.quantity);
	}
	/**
	 * compare if two item_id are the same 
	 * @param p
	 * @return
	 */
	public String equals(Item p ) {
		if (this.item_id.equalsIgnoreCase(p.item_id)) {
			return ("Error! The item id is already found in the inventory please put another item id. ");
		}
		else {
			return this.item_id ; 
		}
	}
	/**
	 * 
	 * @return the item_id, name, description, category, supplier_name, contact, price, quantity
	 */
	public String findItemByCat() {
		 return(this.item_id + "  " + this.name+ "  " + this.description + "  " + this.supplier_name + "  "+ this.contact+ "  " + this.price+ "  " + this.quantity);
		}
		
	/**
	 * display the total items
	 */
	public static void totalitem() {
	System.out.println(totalItems);
	}
	/**
	 * 
	 * @return totalitems
	 */
	public static int totalitems() {
		return totalItems;
	}
}

