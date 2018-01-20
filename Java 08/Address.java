/**
 *@author	Jakub Koster
 *@author	178253 KrZZIs2014
 *@version	1.0
 *@since	2013-12-06
 *Class Address
 */
public class Address{
	
	private String address;
	private String zipCode;
	private String city;
	private String country;
	private String phone;
	private String email;
	
	/** constructor for new Address object which requires 3 parameters
	 *@param	address	street and building number
	 *@param	zipCode	Zip code for address
	 *@param	city	city for address	
	 */
	public Address(String address, String zipCode, String city){
		this.address = address;
		this.zipCode = zipCode;
		this.city = city;
	}
	
	/** constructor for new Address object which requires 6 parameters
	 *@param	address	street and building number
	 *@param	zipCode	Zip code for address
	 *@param	city	city for address
	 *@param	country	country for address
	 *@param	phone	phone number
	 *@param	email	email address	
	 */
	public Address(String address, String zipCode, String city, String country, String phone, String email){
		this.address = address;
		this.zipCode = zipCode;
		this.city = city;
		this.country = country;
		this.phone = phone;
		this.email = email;
	}
	
	/** method for getting street and building number
	 *@return	street and building number
	 */
	public String getAddress(){
		return address;
	}
	
	/** method for setting street and building number
	 *@param	newAddress	new street and building number which will replace old one
	 */
	public void setAddress(String newAddress){
		this.address = newAddress;		
	}
	
	/** method for getting Zip code
	 *@return	Zip code
	 */
	public String getZipCode(){
		return zipCode;
	}
	
	/** method for setting Zip code
	 *@param	newZipCode	new Zip code which will replace old one
	 */
	public void setZipCode(String newZipCode){
		this.zipCode = newZipCode;		
	}
	
	/** method for getting city
	 *@return	city
	 */
	public String getCity(){
		return city;
	}
	
	/** method for setting city
	 *@param	newCity	new city which will replace old one
	 */
	public void setCity(String newCity){
		this.city = newCity;		
	}
	
	/** method for getting country
	 *@return	country
	 */
	public String getCountry(){
		return country;
	}
	
	/** method for setting country
	 *@param	newCountry	new country which will replace old one
	 */
	public void setCountry(String newCountry){
		this.country = newCountry;		
	}
	
	/** method for getting phone number
	 *@return	phone number
	 */
	public String getPhone(){
		return phone;
	}
	
	/** method for setting phone number
	 *@param	newPhone	new phone number which will replace old one
	 */
	public void setPhone(String newPhone){
		this.phone = newPhone;		
	}
	
	/** method for getting email address
	 *@return	email address
	 */
	public String getEmail(){
		return email;
	}
	
	/** method for setting email address
	 *@param	newEmail	new email address which will replace old one
	 */
	public void setEmail(String newEmail){
		this.email = newEmail;		
	}
	
	/** method which returns object of Address class as String
	 *@return	formatted object of Address class as String
	 */
	public String toString(){
		return String.format("%-15s%s%n%-15s%s%n%-15s%s%n%-15s%s%n%-15s%s%n%-15s%s%n",
			"Address: ",getAddress(),"Zip code: ",getZipCode(),"City: ",getCity(),"Country: ",getCountry(),
			"Phone: ",getPhone(),"Email: ",getEmail());
	}
	
}