package in.vikram.comp;

import java.util.Date;
//target class= userdefined = WishMessageGenerator
public class WishMessageGenerator {
	
	//dependant clas= Predefined = java.util.date
private Date date;

static {
	System.out.println("WishMethodGenerator.class file is loading......");
}
public WishMessageGenerator() {
	System.out.println("Object is instantiated...");
}

public void setDate(Date date) {
	this.date = date;
	System.out.println("setter method is being called to set the date which is injection");
	
}

//Business logic here 
public String generateMessage(String userName) {
	int hrs= date.getHours();
	if(hrs<12) {
		return "Good Morning Coders"+ userName;
	}
	else if (hrs<16) {
		return "Good AfterNoon  Coders"+ userName;
	}
	else if (hrs<20) {
		return "Good Morning Coders"+ userName;
	}
	else  {
		return "Good Night Coders"+ userName;
	}
}
}
