/**
 * This program displays a welcome for the reader.
 * @version 1.30 2021-03-13
 * @author Weder Sousa
 */
  public class Welcome {
    public static void main(String[] args) {
        String strTxt = "Welcome to Command-line!";
        System.out.println(strTxt);
            for (int i = 0; i < strTxt.length(); i++)
                System.out.print("*");
            System.out.println();
        }
 }