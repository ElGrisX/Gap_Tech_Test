package reverseWord;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.*;
import java.util.Scanner;

/**
 * This class contains attributes and methods in order to get largest word from a text file with a bunch of different words
 * @author Miguel A.
 * @version 1.0
 */
public class ReverseWord {

    String file_path="";

    /**
     * Custom ReverseWord class Contructor method
     * @File_Path Define the file path for create or delete the file
     *writeWordsIntoFile method for delete(if the file exist) and create one everytime
     */
    public ReverseWord() {
        this.file_path = "words.txt";
        writeWordsIntoFile();
    }

    /**
     * Method for delete a text file if exist
     */
    public void deleteFile(){

        try {
            File file = new File(file_path);
            if(file.delete()) {
                System.out.println(file.getName() + " was deleted!");
            } else {
                System.out.println("Delete operation is failed.");
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
    /**
     * Method for create a text file and add words to the text file
     */
    public void writeWordsIntoFile(){
        deleteFile();
        PrintWriter out = null;
        try {
            out = new PrintWriter(new BufferedWriter(new FileWriter(file_path, false)));
            System.out.println("File was created");
        } catch (IOException e) {
            e.printStackTrace();
        }
        out.println("a");
        out.println("ab");
        out.println("abc");
        out.println("abcd");
        out.println("abcde");
        out.close();
    }

    /**
     * Method for get the largest word from the text file
     * @return Return the largest word from the text file
     */
    public String getLargestWord() {
        String bigWord = "";
        try {
            File myFile = new File(file_path);
            Scanner scanner = new Scanner(myFile);

            while (scanner.hasNextLine()) {
                Scanner wordScanner = new Scanner(scanner.nextLine());
                while (wordScanner.hasNext()) {
                    String str = wordScanner.next();
                    if (str.length() > bigWord.length())
                        bigWord = str;
                    System.out.println("Word: "+ str);
                }
            }
            System.out.println("The largest word is : "+ bigWord);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return bigWord;
    }

    /**
     * Method for reverse the largest word from the file text
     * @param word Largest word from text file
     * @return Return a reversed word
     */
    public String getReversedWord(String word){
        String reversedWord = "";
        int length = word.length();

        for (int i = length - 1 ; i >= 0 ; i--) {
            reversedWord = reversedWord + word.charAt(i);
        }
        System.out.println("The largest word reversed is : "+ reversedWord);
        return reversedWord;
    }

    /**
     * Test method for test the get functionality largest word from a text file
     */
    @Test
    public  void testGetLargestWord(){
        String largestWord = getLargestWord();

        //largest word unit tests
        Assert.assertEquals(largestWord, "abcde", "Expected largest word doesn't match");
        Assert.assertNotEquals(largestWord, "ab", "Expected largest word doesn't match");
    }

    /**
     * Test method for test the reverse largest word functionality
     */
    @Test
    public  void testReverseLargestWord(){
        String reversedLargestWord = getReversedWord(getLargestWord());

        //reversed word unit tests
        Assert.assertEquals(reversedLargestWord, "edcba", "Expected largest reversed word doesn't match");
        Assert.assertNotEquals(reversedLargestWord, "edc","Expected largest reversed word is not correct");
    }

}
