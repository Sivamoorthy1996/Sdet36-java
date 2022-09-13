package ArrayPractices;

import java.util.HashMap;
import java.util.HashSet;

public class ScreeningQuestion2 {

	public static void main(String[] args) {
		String Name="I am sivasubramaniam";
    	
	    HashSet set = new HashSet<>();
	  
	    for(int i=0;i<Name.length();i++)
	    {
	    	set.add(Name.charAt(i));
	    }
	    System.out.println(set);
	    

	}

}
