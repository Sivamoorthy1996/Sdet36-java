package ArrayPractices;

import java.util.LinkedHashSet;

public class TwoArray {

	public static void main(String[] args)
	{
	String s1="welcome to india";
	String s2="welcome to bangalore";
    String s3 = s1+" "+s2;
    String[] str = s3.split(" ");
    LinkedHashSet<String> set = new LinkedHashSet<String>();
    for (int i = 0; i < str.length; i++) {
    	set.add(str[i]);
	}
    for(String word:set) {
    	int count=0;
    for (int i = 0; i < str.length; i++) {
          if(word.equals(str[i])) {
    		count++;
    	}  	
	}
    
    if(count==1) {
    	System.out.println(word);
    }
  
    }
	}

}
