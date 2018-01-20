/**
 *@author			Jakub Koster
 *@author			178253 KrZZIs2014
 *@version			2.0
 *@since			2013-12-15
 *Abstract class	Contractor
 */
 
public abstract class Contractor{
	
	private String name;
	private Address address;
	
	/** constructor for new Contractor object which requires 1 parameter
	 *@param	name	name of contractor
	 */
	public Contractor(String name){
		this.name = name;
	}
	
	/** constructor for new Contractor object which requires 2 parameters
	 *@param	name	name of contractor
	 *@param	address	contractor's address
	 */
	public Contractor(String name, Address address){
		this.name = name;
		this.address = address;
	}
	
	/** method for getting name of contractor
	 *@return	name of contractor
	 */
	public String getName(){
		return name;
	}
	
	/** method for setting name of contractor
	 *@param	newName	new name which will replace old one
	 */
	public void setName(String newName){
		this.name = newName;
	}
	
	/** method for getting address of contractor
	 *@return	address of contractor
	 */
	public Address getAddress(){
		return address;
	}
	
	/**method for setting address of contractor
	 *@param	newAddress	new address which will replace old one
	 */
	public void setAddress(Address newAddress){
		this.address = newAddress;
	}
	
	/** method which returns object of Contractor class as String
	 *@return	formatted object of Contractor class as String
	 */
	public String toString(){
		return getName() + getAddress();
	}
}	