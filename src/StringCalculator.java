
public class StringCalculator {

	private final String delimiter= ",|\n";
	
	public int add(String input) throws Exception {
		String[] numbers = input.split(delimiter);
		
		if(isEmpty(input)){
            return 0;
        } 
	    if(input.length() == 1 ){
           return stringToInt(input);  
	    }
        else {
        	return getSum(numbers);
        }
        
 	}

	private int getSum(String[] numbers) throws Exception{
		findDangerousInput(numbers);
		int sum = 0;
		for(String current:numbers) {
			sum += stringToInt(current);
		}
		return sum; 
	}
	
	 private void findDangerousInput(String[] numbers) throws Exception {
	    	for(String current:numbers){
	            if(stringToInt(current)<0) {
	        	   throw new Exception("Negatives Not Allowed:");
	            }
	    	}
	 }	
	
	private boolean isEmpty(String input) {
		return input.isEmpty();
	}
	
	private int stringToInt(String input) {
		return Integer.parseInt(input);
		
	}
}
