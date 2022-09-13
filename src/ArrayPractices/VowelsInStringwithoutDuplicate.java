package ArrayPractices;

import java.util.LinkedHashSet;

public class VowelsInStringwithoutDuplicate {

	public static void main(String[] args) {
     String str[]= {"apple","mango","banana","orange"};
    

    
     for (int i = 0; i < str.length; i++) {
    	 int count=0;
    	  String chr = str[i];
          LinkedHashSet<Character> set = new LinkedHashSet<Character>();
     
    	  for(int j = 0; j <chr.length(); j++) {
    		  set.add(chr.charAt(j));
    	  }
    	
     
    	 for (Character s:set)
    	 {	 
    		 if(s=='a'||s=='e'||s=='i'||s=='o'||s=='u') {
        		 count++;
    		 } 
    	 }	
    	 System.out.println(chr+" is "+count);
    	    
	}
    

	}

}
