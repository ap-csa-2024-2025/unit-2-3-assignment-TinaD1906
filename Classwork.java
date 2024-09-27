public class Classwork
{
  public static void main(String[] args)
  {
    firstLastN("apple", 2);
    System.out.print(firstLastN);
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

}
