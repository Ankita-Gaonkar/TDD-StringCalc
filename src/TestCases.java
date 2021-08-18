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
}   

