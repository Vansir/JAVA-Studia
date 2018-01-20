/**
 *@author	Jakub Koster
 *@author	178253 KrZZIs2014
 *@version	1.0
 *@since	2013-12-06
 *Subclass Person
 */
public class Person extends Contractor{
	private String PESEL;
	
	/** constructor for new Person object
	 *@param	name	name of new person
	 *@param	address	object address of Address class
	 *@param	PESEL	PESEL of new person
	 */
	public Person (String name, Address address, String PESEL){
		super(name,address);
		this.PESEL = PESEL;
	}
	
	/** method for getting PESEL
	 *@return	PESEL of person
	 */
	public String getPESEL(){
		return PESEL;
	}
	
	/** method for setting person's PESEL
	 *@param	newPesel	new PESEL which will replace old one
	 */
	public void setPESEL(String newPESEL){
		this.PESEL = newPESEL;		
	}
	
	/** method which returns object of Person subclass as String
	 *@return	formatted object of Person subclass as String
	 */
	public String toString(){
		return String.format("%-15s%s%n%s%-15s%s%n","Name: ",getName(),getAddress(),"PESEL: ",getPESEL());
	}
}