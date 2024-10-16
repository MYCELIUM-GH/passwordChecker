import java.util.Scanner; // import Scanner class
public class code_example {

public static void main(String[] args) {
    //INITIAL VALUES. 0 = false, 1 = true

    // ================================================== PART FOR JOHN ========================================================
    // This program tests a password to check for complexity requirements.
    
    int min=8,max=16,digit=0,special=0,upCount=0,loCount=0; //Varibles used in this program. Initialised to begining values. 
    
    Scanner scn=new Scanner(System.in); //CREATING NEW SCANNER CLASS, VARIABLE SCN
    
    System.out.println("Enter Your Password:"); //Prompt for password.
    String password=scn.nextLine(); //Scanner object to read input from system.in into varible called password
    
    // check password is between 8(min) and 16(max) characters.
    if(password.length()>=min&&password.length()<=max) { // check if password length between >=8 AND <=16. If TRUE - continue, If not - JUMP to "ELSE"
        for(int i=0;i<password.length();i++) { //create loop to iriterate through password to test for character requirements.
            char c = password.charAt(i); //IT WILL CHECK EVERY CHAR IN PASSWORD (PASSWORD LENGTH)
            
            if(Character.isUpperCase(c)) { //If character is uppercase, increment upCount   
                upCount++;
            }
            if(Character.isLowerCase(c)) { //If character is lowercase, increment  loCount. 
                loCount++;
            }
            if(Character.isDigit(c)) { //If character is digit, increment digit.
                digit++;
            }
            if(c>=33&&c<=46||c==64) {// If character is a special character, then increment special.
                special++;
            }
        } //THE END OF "FOR" LOOP

// ========================================= END OF THE PART OF JOHN ====================================================


// ========================================= PART FOR DARYA ========================================================
        if(special>=1&&loCount>=1&&upCount>=1&&digit>=1) { //IF ALL OF CONDITIONS ARE TRUE - PRINT TEXT
            System.out.println("Password is good.");
        }
    } //THE END OF CONDITIONS CHECKING

    if(password.length()<min) { //IF PASSWORD LENGTH LESS THAN 8 - START LOOP
        for(int i=0;i<password.length();i++) {
            char c = password.charAt(i);
            
            if(Character.isLowerCase(c)) {
                loCount++;
            }
        }

        if(loCount>0) {
            System.out.println("Password must be atleast "+min+" characters!");
            System.out.println("You need atleast one upper case chracter!");
            System.out.println("You need atleast one digit!");
            System.out.println("You need atleast one special chracter!");
        }
    } //THE END OF CHECKING FOR MIN LENGTH

    else if(password.length()<min&&upCount>1) {
        for(int i =0;i<password.length();i++) {
            char c =password.charAt(i);

            if(Character.isLowerCase(c)) {
                loCount++;
            }

            if(Character.isUpperCase(c)) {
                upCount++;
            }
        }
        
        if(loCount>0&&upCount>0) {
            System.out.println(" Password must be atleast "+min+" chracters:");
            System.out.println(" You need atleast one digit:");
            System.out.println(" You need atleast one special chracter:");
        }
    }
    
// ====================================== END OF THE PART FOR DARYA ==============================================
    
        if(password.length()>max||password.length()>=max&&upCount>1&&loCount>1&&digit>1) {
            System.out.println(" Password is too long.Limit is "+max+" chracters:");
            System.out.println(" You need atleast one special chracter:");

        }

        if(password.length()>=min&&password.length()<=max&&loCount>0&&upCount>0&&digit>0&&special==0) {
            System.out.println(" You need atleast a special chracter");
        }

        if(password.length()>=min&&password.length()<=max&&loCount>0&&upCount>0&&digit==0&&special==0) {
            System.out.println(" You need atleast one digit:");
            System.out.println(" You need atleast one special chracter:");
        }

    scn.close();
}
}
