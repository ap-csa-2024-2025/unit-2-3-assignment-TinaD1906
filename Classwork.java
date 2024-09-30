public class Classwork
{
  public static void main(String[] args)
  {
    String word1 = firstLastN("apple", 2);
    System.out.println(word1);

    String cutWord = delEnd("family",3);
    System.out.println(cutWord);

    int compareWord = compareLowerCase("animal","candle");
    System.out.println(compareWord);

    int lengthOfFirst = lengthFirst("Everything in its righ place");
    System.out.println(lengthOfFirst);
  }

  public static String firstLastN(String word, int n)
  {
    //word = dictionary
    //n = 3
    // dicary 
    String output = new String(); // makes a blank String

    //getting the first n letters
    String firstN = word.substring(0,n); //substring from 0 to n-1

    //getting the last n letters
    int indexOfNthToLast = word.length() - n;
    String lastN = word.substring(indexOfNthToLast); // starts at nth to last letter, and goes to the end 

    output = firstN + lastN;
    return output;

  }
  public static String delEnd(String s, int n)
  {
    int stoppingIndex = s.length() - n;
    String output = s.substring(0, stoppingIndex); // substring(start);
    return output;
  }

  public static int compareLowerCase(String firstWord, String secondWord)
  {
   int output = firstWord.compareTo(secondWord);
   return output;
  }

  public static String lengthFirst(String sentence)
  {
    int indexOfEndOfFirstWord = sentence.indexOf(" ");
    String firstWord = sentence.substring(0, indexOfEndOfFirstWord);
    return firstWord.length();

  }
  
}
