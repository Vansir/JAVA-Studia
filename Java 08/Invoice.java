/**
 *@author	Jakub Koster
 *@author	178253 KrZZIs2014
 *@version	2.0
 *@since	2013-12-15
 *Class Invoice
 */
import java.util.*;

public class Invoice implements ProForma{
	private static int invoiceCounter = 0;
	private int invoiceNumber;
	private Contractor seller;
	private Contractor buyer;
	private Product[] products;
	
	/** constructor for new Invoice object
	 *@param	seller		person/company which is selling something in our invoice
	 *@param	buyer		person/company which is buying something in our invoice
	 *@param	products	array of products which will be invoiced
	 */
	public Invoice(Contractor seller, Contractor buyer, Product[] products){
		this.seller = seller;
		this.buyer = buyer;
		this.products = products;
		invoiceNumber = ++invoiceCounter;
	}
	
	/** method which prints ProForma
	 */
	public void printProForma(){
		System.out.println();
		System.out.println("PROFORMA");
		System.out.println(this);
	}
	
	/** method which returns object of Invoice class as String
	 *@return	formatted object of Invoice class as String
	 */
	public String toString(){
		
		Arrays.sort(products);
		
		String print="";
				
		print+=String.format("%n%s%n%n%s%n%n%s%n%-15s%d%n","VAT INVOICE","Seller Data",
			this.seller,"Invoice no: ",invoiceNumber);
		
		Calendar callendar = Calendar.getInstance();
		print+=String.format("%-15s%2s%s%2s%s%4s%n%n","Date:",callendar.get(Calendar.DAY_OF_MONTH),"-",
		(callendar.get(Calendar.MONTH)+1),"-",callendar.get(Calendar.YEAR));
		
		print+=String.format("%s%n%n%s%n%n","Buyer Data",this.buyer);
		
		print+=String.format("%s%n%s%n%s%n%s%n",
		"+----+---------------------+-----------+---------+-----------+------+--------+----------+",
		"|No. | Product description | Quantity  |  Unit   |  Total    | VAT  |  VAT   |  Gross   |",
		"|    |                     |           |  price  |           | rate |        |          |",
		"+----+---------------------+-----------+---------+-----------+------+--------+----------+");
		
		for(int i=0; i<products.length; i++){
			print+=String.format("|  %-2s",i+1);
			print+=products[i];
			print+=String.format("%s%n",
				"+----+---------------------+-----------+---------+-----------+------+--------+----------+");
		}
				
		double totalTotal = 0.00;
		double totalVat = 0.00;
		double totalGross = 0.00;
		for (int i=0; i<products.length; i++) {
			totalTotal += products[i].calculateTotal();
		}
		
		for (int i=0; i<products.length; i++) {
			totalVat += products[i].calculateVat();
		}
		
		for (int i=0; i<products.length; i++) {
			totalGross += products[i].calculateGross();
		}
		
		print+=String.format("|%26s|%5s      |%8s | %9.2f |%4s  |%7.2f |%9.2f |%n","RAZEM","X","X",
			totalTotal,"X",totalVat,totalGross);
		print+=String.format("%s%n",
			"+----+---------------------+-----------+---------+-----------+------+--------+----------+");
		
		double totalVatVat = 0.00;
		double totalGrossVat = 0.00;
		int[] vatRate = {5,8,23};
		
		for (int s=0; s<vatRate.length; s++){
		
			for (int i=0; i<products.length; i++) {
				if (products[i].getVatRate()==vatRate[s]) {
					totalVatVat += products[i].calculateVat();
				}
			}	

			for (int i=0; i<products.length; i++) {
				if (products[i].getVatRate()==vatRate[s]) {
					totalGrossVat += products[i].calculateGross();
				} 
			}
		
			print+=String.format("%62s %2s%%  |%7.2f |%9.2f |%n","|",vatRate[s],totalVatVat,totalGrossVat);
			print+=String.format("%s%n",
				"                                                             +------+--------+----------+");
		
			totalVatVat = 0.00;
			totalGrossVat = 0.00;
		}
		return print;
		
	}
	
}