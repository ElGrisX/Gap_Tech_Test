import org.testng.annotations.Test;
import reverseWord.ReverseWord;
import utilities.TestAnnotationUtils.TestAnnotation;

/**
 * This class contains annotations and test methods in order to run the test and execute the asserts
 * @author Miguel A.
 * @version 1.0
 */

public class ReverseWord_Tests{

    ReverseWord reverseWord;

    /**
     * Test method that call the method the get functionality largest word from a text file
     */
    @TestAnnotation(value = "Verify get largest word from a text file")
    @Test(priority=1)
    public  void verifyGetLargestWord(){
        reverseWord = new ReverseWord();
        reverseWord.testGetLargestWord();
    }

    /**
     * Test method for test the reverse largest word functionality
     */
    @TestAnnotation(value = "Verify get largest word from a text file and reverse it ")
    @Test(priority=2)
    public  void verifyReverseLargestWord(){
        reverseWord = new ReverseWord();
        reverseWord.testReverseLargestWord();
    }
}
