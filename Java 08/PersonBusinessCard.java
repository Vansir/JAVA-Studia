/**
 *@author	Jakub Koster
 *@author	178253 KrZZIs2014
 *@version	1.0
 *@since	2013-12-20
 *Class		PersonBusinessCard
 */
 
 import java.applet.*;
 import java.awt.*;
 
 public class PersonBusinessCard extends Applet{
 	
 	public void init(){
 		setBackground(Color.BLACK);
 	}
 	
 	public void start(){
 	}
 	
 	public void stop(){
 	}
 	
 	public void destroy(){
 	}
 	
 	public void paint(Graphics draw){
 		
 		String pName = getParameter("pName");
 		String pAddress = getParameter("pAddress");
 		String pZipCode = getParameter("pZipCode");
 		String pCity = getParameter("pCity");
 		String pCountry = getParameter("pCountry");
 		String pPhone = getParameter("pPhone");
 		String pEmail = getParameter("pEmail");
 		Address pAddressCard = new Address(pAddress,pZipCode,pCity,pCountry,pPhone,pEmail);
 		Person pPersonCard = new Person(pName,pAddressCard," ");
 		
 		Font font1 = new Font("Arial",Font.BOLD,16);
 		Font font2 = new Font("TimesNewRoman",Font.ITALIC,14);
 		Font font3 = new Font("SansSerif",Font.PLAIN,14);
 		
 		draw.setColor(Color.GREEN);
 		int xPolygon[] = {250,280,310};
 		int yPolygon[] = {70,20,70};
 		draw.fillPolygon(xPolygon,yPolygon, 3);
 		
 		draw.setColor(Color.BLUE);
		draw.fillOval(268,45,25,25);
 		
 		draw.setColor(Color.WHITE);
 		draw.setFont(font1);
 		draw.drawString(pPersonCard.getName(), 40, 40);
 		draw.setFont(font2);
		draw.drawString(pAddressCard.getAddress() + ",  " + pAddressCard.getCity(), 40, 65);
		draw.setFont(font3);
		draw.drawString("tel. " + pAddressCard.getPhone(), 40, 90);
		draw.drawString("email. " + pAddressCard.getEmail(), 40, 115);
	}
 }