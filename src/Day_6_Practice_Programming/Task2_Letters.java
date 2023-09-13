package Day_6_Practice_Programming;

public class Task2_Letters {
    public static void main(String[] args) {
        /*add main method
define a character. print me the
next four characters on new lines
Note: Each characters has a number
assigned to eat. So, if you declare a
character and use increment it will take the
next letter in the alphabet
*/

     char character = 'a';
     System.out.println(character);
     System.out.println(++character);
     System.out.println(++character);
     System.out.println(++character);
     System.out.println();
     char num = '1';
     System.out.println(num);
     System.out.println(++num);
     System.out.println(++num);
     System.out.println(++num);
     System.out.println();

     char letter = 'A';
     System.out.println("Original " + letter);

     System.out.println("Next four: ");
     System.out.println(++letter);
     System.out.println(++letter);
     System.out.println(++letter);
     System.out.println(++letter);


    }
}
