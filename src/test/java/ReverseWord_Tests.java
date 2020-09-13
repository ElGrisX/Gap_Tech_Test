import org.testng.annotations.Test;
import reverseWord.ReverseWord;

/**
 * This class contains annotations to control the test execution workflow and test methods in order to run the test
 * @author Miguel A.
 * @version 1.0
 */

public class ReverseWord_Tests{

    ReverseWord reverseWord;

    /**
     * Test method that call the method the get functionality largest word from a text file
     */
    @Test(priority=1)
    public  void verifyGetLargestWord(){
        reverseWord = new ReverseWord();
        reverseWord.testGetLargestWord();
    }

    /**
     * Test method for test the reverse largest word functionality
     */
    @Test(priority=2)
    public  void verifyReverseLargestWord(){
        reverseWord = new ReverseWord();
        reverseWord.testReverseLargestWord();
    }
}
