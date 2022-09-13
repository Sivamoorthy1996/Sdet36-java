package ArrayPractices;

public class VowelsInString {

	public static void main(String[] args) {
     String str[]= {"apple","mango","banana","orange"};
    
     for (int i = 0; i < str.length; i++) {
    	 int count=0;
    	 char[] chr = str[i].toCharArray();
    	 for (int j = 0; j < chr.length; j++)
    	 {
    		 if(chr[j]=='a'||chr[j]=='e'||chr[j]=='i'||chr[j]=='o'||chr[j]=='u') 
    		 {
        		 count++;
		}
    	 }
    	  System.out.println(str[i]+" is "+count);
	}
    

	}

}
