/**
 *@author	Jakub Koster
 *@author	178253 KrZZIs2014
 *@version	1.0
 *@since	2013-12-06
 *Subclass Company
 */
public class Company extends Contractor{
	private String NIP;
	
	/** constructor for new Company object
	 *@param	name	name of company
	 *@param	address	address of company
	 *@param	NIP		NIP of company
	 */	
	public Company (String name, Address address, String NIP){
		super(name,address);
		this.NIP = NIP;
	}
	
	/** method for getting NIP
	 *@return	NIP of company
	 */
	public String getNIP(){
		return NIP;
	}
	
	/** method for setting NIP
	 *@param	newNIP	new NIP which will replace old one
	 */	
	public void setNIP(String newNIP){
		this.NIP = newNIP;		
	}
	
	/** method which returns object of Company subclass as String
	 *@return	formatted object of Company subclass as String
	 */ 
	public String toString(){
		return String.format("%-15s%s%n%s%-15s%s%n","Name: ",getName(),getAddress(),"NIP: ",getNIP());
	}
}