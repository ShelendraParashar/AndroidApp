package com.weather;

import static org.testng.Assert.fail;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class Account {

	
	
	
	       static int acc_id=100;
	       String acc_type;
	       
	       Account(String acc_type)
	       {
	             acc_id++;
	             this.acc_type=acc_type;
	       }
	       
	       
	       void display()
	       {
	             System.out.println(" "+acc_id+" "+acc_type);
	       }
	       
	       
	       
	       public static void main(String[] args)
	       {
	             Account account1= new Account("Saving");
	             account1.display();
	             Account account2= new Account("Current");
	             account2.display();
	             Account account3= new Account("Salaried");
	             account3.display();  
	             System.out.println(" acount1 id --------");
	             account1.display();
	       }

	
	
	

}
