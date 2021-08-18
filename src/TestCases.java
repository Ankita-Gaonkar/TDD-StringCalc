import static org.testng.Assert.assertEquals;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

@Test
public class TestCases {
	private StringCalculator calculator =new StringCalculator();

    @BeforeTest
    public void init(){
        calculator =new StringCalculator();
    }
    
    //Test case1
    public void emptyStringReturnsZero() throws Exception{
        assertEquals(calculator.add(""),0);
    }
    
    public void singleValueIsReplied() throws Exception{
        assertEquals(calculator.add("1"),1);
    } 
    
    //Test case2  
    public void commaDelimitedReturnsSum() throws Exception{
        assertEquals(calculator.add("1,2"),3);
    } 
    
    //Test case3
    public void twoNumbersNewLineDelimitedReturnsSum() throws Exception{
        assertEquals(calculator.add("1\n2"),3);
    }
    
    //Test case4
    public void threeNumbersDelimitedBothWaysReturnsSum() throws Exception{
        assertEquals(calculator.add("1,2,3"),6);
    }
    
    //Test case5 
    @Test(expectedExceptions=Exception.class)
    public void negativeInputReturnsException() throws Exception {
    	calculator.add("-1");
    }
  
    //Test case6
    public void ignoresNumberGreaterThan1000() throws Exception {
    	assertEquals(calculator.add("10,10,1001"),20);
    }
}   

  
