package co.com.bancolombia.certification.bizagi.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class PageComponents {
		
	public static final Target ACCOUNT_BUTTON = Target.the("Account Button").located(By.xpath("//span[contains(text(),'My Account')]"));
	public static final Target SELECT_LOGIN = Target.the("Select Login").located(By.xpath("//li/a[contains(text(),'Login')]"));
	
	public static final Target USER = Target.the("User").located(By.xpath("//input[@id='input-email']"));
	public static final Target PASSWORD = Target.the("Password").located(By.xpath("//input[@id='input-password']"));
	public static final Target LOGIN_BUTTON = Target.the("Login Button").located(By.xpath("//input[@value='Login']"));
	
	public static final Target ADDRESS_BOOK = Target.the("Address Book").located(By.xpath("//li/a[contains(text(),'Address Book')]"));
	public static final Target NEW_ADDRESS = Target.the("New Address").located(By.xpath("//div/a[contains(text(),'New Address')]"));
	
	public static final Target FIRSTNAME = Target.the("Firstname").located(By.xpath("//input[@id='input-firstname']"));
	public static final Target LASTNAME = Target.the("Lastname").located(By.xpath("//input[@id='input-lastname']"));
	public static final Target ADDRESS = Target.the("Address").located(By.xpath("//input[@id='input-address-1']"));
	public static final Target CITY = Target.the("City").located(By.xpath("//input[@id='input-city']"));
	public static final Target POSTCODE = Target.the("Postcode").located(By.xpath("//input[@id='input-postcode']"));
	public static final Target COUNTRY = Target.the("Country").located(By.xpath("//select[@id='input-country']"));
	public static final Target SELECT_COUNTRY = Target.the("Select Country").located(By.xpath("//option[contains(text(),'Colombia')]"));
	public static final Target REGION = Target.the("Region").located(By.xpath("//select[@id='input-zone']"));
	public static final Target SELECT_REGION = Target.the("Select Region").located(By.xpath("//option[contains(text(),'Antioquia')]"));
	public static final Target YES_BUTTON = Target.the("Yes Button").located(By.xpath("//input[@value='0']"));
	public static final Target CONTINUE_BUTTON = Target.the("Continue Button").located(By.xpath("//input[@value='Continue']"));
	public static final Target DELETE_BUTTON = Target.the("Delete Button").located(By.xpath("//*[@id=\"content\"]/div[1]/table/tbody/tr/td[2]/a[contains(text(),'Delete')]"));
	
	
}
