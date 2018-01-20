/**
 *@author	Jakub Koster
 *@author	178253 KrZZIs2014
 *@version	3.0
 *@since	2013-12-15
 *Class		Product
 */
import java.util.*; 
public class Product implements Comparable<Product>{
	
	private String description;
	private int quantity;
	private double price;
	private int vatRate;
	
	/** constructor for new Product object which requires 1 parameter
	 *@param	description	description of product
	 */	
	public Product(String description){
		this.description = description;
	}
	
	/** constructor for new Product object which requires 4 parameters
	 *@param	description	description of product
	 *@param	quantity	quantity of product
	 *@param	price		price of product
	 *@param	vatRate		Vat rate for product
	 */	
	public Product(String description, int quantity, double price, int vatRate){
		this.description = description;
		this.quantity = quantity;
		this.price = price;
		this.vatRate = vatRate;
	}
	
	/** method for comparing product to another
	 *@param	another	object of Product type
	 *@return	0 if product is same, <0 if product	is before one we given and >0 if product is after one we given
	 */
	public int compareTo(Product another)
	{
		return description.compareToIgnoreCase(another.getDescription());
	}
	
	/** method for getting description
	 *@return	description of product
	 */		
	public String getDescription(){
		return description;
	}
	
	/** method for setting description
	 *@param	newDescription	new description which will replace old one
	 */
	public void setDescription(String newDescription){
		this.description = newDescription;
	}
	/** method for getting quantity
	 *@return	quantity of product
	 */		
	public int getQuantity(){
		return quantity;
	}
	
	/** method for setting quantity
	 *@param	newQuantity	new quantity which will replace old one
	 */
	public void setQuantity(int newQuantity){
		this.quantity = newQuantity;
	}
	
	/** method for getting price
	 *@return	price of product
	 */		
	public double getPrice(){
		return price;
	}
	
	/** method for setting price
	 *@param	newPrice	new price which will replace old one
	 */
	public void setPrice(double newPrice){
		this.price = newPrice;
	}
	
	/** method for getting Vat rate
	 *@return	Vat rate of product
	 */		
	public int getVatRate(){
		return vatRate;
	}
	
	/** method for setting Vat rate
	 *@param	newVatRate	new Vat rate which will replace old one
	 */
	public void setVatRate(int newVatRate){
		this.vatRate = newVatRate;
	}
	
	/** method for calculating total price
	 *@return	total price which is not including Vat
	 */
	public double calculateTotal(){
		return (this.quantity*this.price);
	}
	
	/** method for calculating Vat value
	 *@return	Vat value calculated from vat rate and total value
	 */
	public double calculateVat(){
		return (calculateTotal()*vatRate/100);
	}
	
	/** method for calculating gross value
	 *@return	total price which includes Vat
	 */
	public double calculateGross(){
		return (calculateTotal() + calculateVat());
	}
	
	/** method which returns object of Product class as String
	 *@return	formatted object of Product class as String
	 */
	public String toString(){
		return String.format("| %-18s  |    %-5s  |  %6.2f | %9.2f | %2s%%  |%7.2f |%9.2f |%n",
		getDescription(),getQuantity(),getPrice(),calculateTotal(),getVatRate(),calculateVat(),calculateGross());
	}
}