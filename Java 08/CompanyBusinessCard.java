/**
 *@author	Jakub Koster
 *@author	178253 KrZZIs2014
 *@version	1.0
 *@since	2013-12-20
 *Class		CompanyBusinessCard
 */
 
 import java.applet.*;
 import java.awt.*;
 
 public class CompanyBusinessCard extends Applet{
 	
 	public void init(){
 		setBackground(Color.YELLOW);
 	}
 	
 	public void start(){
 	}
 	
 	public void stop(){
 	}
 	
 	public void destroy(){
 	}
 	
 	public void paint(Graphics draw){
 		
 		String cName = getParameter("cName");
 		String cAddress = getParameter("cAddress");
 		String cZipCode = getParameter("cZipCode");
 		String cCity = getParameter("cCity");
 		String cCountry = getParameter("cCountry");
 		String cPhone = getParameter("cPhone");
 		String cEmail = getParameter("cEmail");
 		Address cAddressCard = new Address(cAddress,cZipCode,cCity,cCountry,cPhone,cEmail);
 		Person cPersonCard = new Person(cName,cAddressCard," ");
 		
 		Font font1 = new Font("Arial",Font.BOLD,16);
 		Font font2 = new Font("TimesNewRoman",Font.ITALIC,14);
 		Font font3 = new Font("SansSerif",Font.PLAIN,14);
 		 		
 		draw.setColor(Color.RED);
 		draw.fillRect(250,51,29,29);
 		draw.fillRect(281,20,29,29);
 		 		
 		draw.setColor(Color.BLUE);
		draw.fillRect(250,20,29,29);
 		draw.fillRect(281,51,29,29);
 		
 		draw.setColor(Color.BLACK);
 		draw.setFont(font1);
 		draw.drawString(cPersonCard.getName(), 40, 40);
 		draw.setFont(font2);
		draw.drawString(cAddressCard.getAddress() + ",  " + cAddressCard.getCity(), 40, 65);
		draw.setFont(font3);
		draw.drawString("tel. " + cAddressCard.getPhone(), 40, 90);
		draw.drawString("email. " + cAddressCard.getEmail(), 40, 115);
	}
 }