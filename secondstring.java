import java.util.Scanner;
public class secondstring {

    public static void main(String[] args) {
       exc1();
       exc2();

       exc3();
       String not = "Welcomex";

       String empty = " ";
       System.out.println(exc4(empty));

       String first = "Hello";
       String second = "Hi";
       System.out.println(exc5(first, second)); 
    }

    public static void exc1() {
        String num1 = "hello"; //get num1's value length
        String num2 = "bye";   // get num2's value length
        String var = "variable"; //substring will be dervived from this word
    
        int num1Length = num1.length(); 
        int num2Length = num2.length();
        String vary = var.substring(0,3);
        
        System.out.print(vary+ " = " +num1Length+ " + " +num2Length+ ";" ); //combine found variables
        System.out.println();
    }

    public static void exc2() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first name:");
        String firstname = scan.nextLine();

        System.out.println("Enter last name:");
        String lastname = scan.nextLine();

        String newlastname = lastname.toUpperCase(); //set the last name to all capital 

        System.out.print(firstname + " " +newlastname); //print names with space btw them
        scan.close();
    }

    public static String exc3(String remove) {    
        if (remove.length() >= 1) {
              char firstx = remove.charAt(remove.length(8)); // index 8 = 'x' at the beginning 
              char lastx = remove.charAt(remove.length(0));  // index 0= 'x' at the end 

              if (firstx == 'x' && lastx == 'x') {  //if starts & ends with 'x' print remove variable
                 String newword = "Welcome";
                 return newword; 
              }
        } 
        else {
              return not;  //if does not meet conditon then print the notremove variable
        }
    }

     public static String exc4(String redblue) {
        if (redblue.length() >= 3) {
            String redd = redblue.substring(0,3);
            String first = "red";
            String bluee = redblue.substring(0,4);
            String second = "blue";

            if (redd == "red") {
                return first;
            }
             if (bluee == "blue") {
                return second;
            }
        }
        else {
            return empty;
        }
    }

    public static String exc5(String one, String two) {
        if (one.length() == two.length()) {
            String same = one + two;

            if (one.length() > two.length()) {
                String cut = one.substring(3,5);
                String diff = cut+two;
            }
            return diff;
        }
        return same;
    } 
}


