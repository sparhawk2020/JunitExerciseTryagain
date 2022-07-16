import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Password obj = new Password();

        int upperCount = 0;
        int lowerCount = 0;
        int digitCount = 0;
        int letterCount = 0;
        Scanner in = new Scanner(System.in);
        int numSpaces = 0;
        boolean ss=false;
        String pass="";
        int string1=0;





        while (upperCount < 2 || lowerCount < 3 || digitCount < 1 || ss==false || string1 <= 5 ) {


            System.out.print("Enter a string >> ");
            pass= in.nextLine();

            upperCount = obj.upper(pass);
            letterCount= obj.lower(pass);
            digitCount = obj.digit(pass);
            ss = obj.sc(pass);
            string1 = obj.lengthof(pass);


            if(obj.checkpass(pass)==true){
                break;
            } else {


                if (upperCount < 2)
                    System.out.println("At least 2 uppercase letters");
                if (lowerCount < 3)
                    System.out.println("At least 3 lowercase letters");
                if (digitCount < 1)
                    System.out.println("At least 1 digit");

                if(ss==false){
                    System.out.println("You must at least have one special character");

                }

                if(string1 <= 5){
                    System.out.println("You must have at least 8 characters");
                }

                upperCount = 0;
                lowerCount = 0;
                digitCount = 0;
                letterCount = 0;
                ss=false;
            }




            }









    }
}