package _99_extra._04_tea_party;

public class TeaParty {
	    public String welcome(String name, boolean isWoman, boolean isKnighted) {
	    	String message = "Hello ";
	    	
	    	if(isKnighted && isWoman) {
	    		message += "Lady ";
	    	}else if(isKnighted) {
	    		message += "Sir ";
	    	}else if(isWoman) {
	    		message += "Ms. ";	    				
	    	}else {
	    		message += "Mr. ";
	    	} 
	    	message += name;
	    	return message;		
	    }
}
