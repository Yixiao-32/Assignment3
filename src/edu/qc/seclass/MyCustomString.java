package edu.qc.seclass;

public class MyCustomString implements MyCustomStringInterface {
    
    private String myString;


	@Override
	public String getString() {
		if(this.myString.isEmpty()){
			return null;
		}

		else{
			return this.myString;
		}
	}

	@Override
	public void setString(String myString){
        this.myString = myString;
    }

    //countNumbers
    @Override
    public int countNumbers(){
    	
    	if (myString.isEmpty()) {
    		throw new NullPointerException();
    	}
    	
        int countNumbers = 0;
        for (int i = 0; i <myString.length(); i++) {
        	if (Character.isDigit(myString.charAt(i))) {
        		countNumbers++;
        	}
        }
        return countNumbers;
    }

    //getEeveryNthCharacterFromBeginningOrEnd
    @Override
    public String getEveryNthCharacterFromBeginningOrEnd(int n, boolean BeginOrEnd){
    	String NthNumber = " ";
    	if(n <= 0) {
    		throw new IllegalArgumentException();
    	}
    	if(n > myString.length()) {
    		throw new NullPointerException();
    	}
    	//from begin to end
    	if (BeginOrEnd == false) {
    		for(int i = 1; i < myString.length(); i+=n) {
    			NthNumber = NthNumber + Character.toString(myString.charAt(i));
    		}
    	}
    	
    	//from end to begin
    	else {
    		for (int i = myString.length() - n; i >= 0; i-=n) {
    			NthNumber = NthNumber + Character.toString(myString.charAt(i));
    		}
    	}
    	return NthNumber;
    }
    
    //converDigitsToNamesInSubstring
    @Override
    public void convertDigitsToNamesInSubstring(int startPosition, int endPosition){
    	
    	if(startPosition > endPosition){
            throw new IllegalArgumentException();
        }
    	
    	if(startPosition<=endPosition ){
    		if((startPosition<1 || endPosition>myString.length())) {
    			throw new MyIndexOutOfBoundsException();
    		}
       
        	if(startPosition>0 && endPosition >0) {
        		if(myString == null) {
        		throw new NullPointerException();
        		}
        	}
        }
    	
        else {
            String digit = " ";
            String array[]=new String[100];
            
            for (int i = 0; i < myString.length(); i++) {
                array[i]=Character.toString(myString.charAt(i));
            }
            
            for(int j=startPosition-1;j<endPosition;j++)
            {
            	   String substring=String.valueOf(array[j]);
            	  
            	   if(substring.equals("0")){
            		   digit="Zero"; 
            	   }     
            	   
            	   if(substring.equals("1")){
            		   digit="One";      	      
            	   }
            	   
            	   if(substring.equals("2")){
            		   digit="Two";        	      
            	   }
            	   
            	   if(substring.equals("3")){
            		   digit="Three";
            	   }
            	   
            	   if(substring.equals("4")){
            		   digit="Four";          	      
            	   }
            	   
            	   if(substring.equals("5")){
            		   digit="Five";        	      
            	   }
            	   
            	   if(substring.equals("6")){
            		   digit="Six";         	      
            	   }
            	   
            	   if(substring.equals("7")){
            		   digit="Seven";         	      
            	   }
            	   
            	   if(substring.equals("8")){
            		   digit="Eight";	      
            	   }
            	  
            	   if(substring.equals("9")){
            		   digit="Nine";
            	   }
            	  digit = digit + digit;
            	 }  
            }
        
        }
}