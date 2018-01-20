//PROGRAM DOCUMENTATION http://wizard.uek.krakow.pl/~s178253/javadoc7/
/**
 *@author	Jakub Koster
 *@author	178253 KrZZIs2014
 *@version	7.0
 *@since	2013-12-15
 *Program for creating Invoices
 *Run: java InvoiceManagement
 */
import java.util.*;

public class InvoiceManagement {
	
	/**main method which read all data which is needed to create invoice and then display invoice
	 *@param	args
	 */	
	public static void main(String[] args){
		Company seller = readSellerData();
		Person buyer = readBuyerData();
		Product[] products = readProductsData();
		
		Invoice invoice = new Invoice(seller, buyer, products);
		printInvoice(invoice);
	}
	/**
	 *method which allows us to put in seller data from keyboard
	 *@return	object of Company class
	 */
	public static Company readSellerData(){
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Seller data:");
		System.out.println();
		System.out.printf("		Name: ");
		String name = keyboard.nextLine();
		System.out.printf("		NIP: ");
		String NIP = keyboard.nextLine();
		System.out.printf("		Address (street and number): ");
		String address = keyboard.nextLine();
		System.out.printf("		Zip code: ");
		String zipCode = keyboard.nextLine();
		System.out.printf("		City: ");
		String city = keyboard.nextLine();
		System.out.printf("		Country: ");
		String country = keyboard.nextLine();
		System.out.printf("		Phone: ");
		String phone = keyboard.nextLine();
		System.out.printf("		Email: ");
		String email = keyboard.nextLine();
		System.out.println();
		
		Company seller = new Company(name, new Address(address,zipCode,city,country,phone,email), NIP);
		return seller;
	}
	/**
	 *method which allows us to put in buyer data from keyboard
	 *@return	object of Person class
	 */
	public static Person readBuyerData(){
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Buyer data:");
		System.out.println();
		System.out.printf("		Name: ");
		String name = keyboard.nextLine();
		System.out.printf("		PESEL: ");
		String PESEL = keyboard.nextLine();
		System.out.printf("		Address (street and number): ");
		String address = keyboard.nextLine();
		System.out.printf("		Zip code: ");
		String zipCode = keyboard.nextLine();
		System.out.printf("		City: ");
		String city = keyboard.nextLine();
		System.out.printf("		Country: ");
		String country = keyboard.nextLine();
		System.out.printf("		Phone: ");
		String phone = keyboard.nextLine();
		System.out.printf("		Email: ");
		String email = keyboard.nextLine();
		System.out.println();
		
		Person buyer = new Person(name, new Address(address,zipCode,city,country,phone,email), PESEL);
		return buyer;
	}
	/**
	 *method which allows us to read products data from keyboard
	 *@return	array of Product class objects
	 */
	public static Product[] readProductsData(){
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("How many positions will have your invoice?: ");
				
		String numberOfPositions = keyboard.nextLine();
		int arrayLenght = Integer.parseInt(numberOfPositions);
		
		Product[] products = new Product [arrayLenght];
			
		for (int i=0; i<arrayLenght; i++) {
						
			System.out.println("Name of position "+ (i+1) +" from "+ arrayLenght +": ");
			String position = keyboard.nextLine();
						
			System.out.println("Quantity of position as integer: ");
			
			int howMany = keyboard.nextInt();
			keyboard.nextLine();
			
			System.out.println("Set unit price for this position in 0.00 format: ");
			String priceString = keyboard.nextLine();
			double price = Double.parseDouble(priceString);
			
			System.out.println("Set VAT for this product as integer without %: ");
			String vat = keyboard.nextLine();
			
			String vat5 = "5";
			String vat8 = "8";
			String vat23 = "23";
			
			switch(vat) {
				case "23":
					vat = vat23;
					break;
				case "8":
					vat = vat8;
					break;
				case "5":
					vat = vat5;
					break;
				default:
					vat = vat23;
			}
			
			int valueVat = Integer.parseInt(vat);
			
			products[i]= new Product(position, howMany, price, valueVat);
		}		
		return products;
	}
	
	/**
	 *method which allows us to print whole invoice
	 *@param	invoice	object of Invoice type
	 */
	public static void printInvoice(Invoice invoice){
		invoice.printProForma();
		System.out.println(invoice);
	}
}