import java.util.Scanner;
public class code_example {

public static void main(String[] args) {
    //INITIAL VALUES. 0 = false, 1 = true

    // ================================================== PART FOR JOHN ========================================================
    
    int min=8,max=16,digit=0,special=0,upCount=0,loCount=0; //INT 0 IT'S LIKE BOOLEAN FALSE
    
    Scanner scn=new Scanner(System.in); //CREATING NEW VARIABLE. TYPE - SCANNER, NAME - scn
    
    System.out.println("Enter Your Password:"); //PROMPT TO ASK USER FOR TYPING
    String password=scn.nextLine(); //IT WILL SAVE USER INPUT INTO VARIABLE CALLED password
    
    //STATEMENT TO CHECK IS PASSWORD LENGTH IS MORE THAN 8 AND LESS THAN 16
    if(password.length()>=min&&password.length()<=max) { //CHECKING FOR PASSWORD LENGTH >=8 AND <=16. IF TRUE - CONTINUE, IF NOT - JUMP TO "ELSE"
        for(int i=0;i<password.length();i++) { //LOOP. CREATES VALUE 0, WILL ADD +1 TO VALUE BEFORE VALUE WILL BE EVEN THAN PASSWORDS LENGTH
            char c = password.charAt(i); //IT WILL CHECK EVERY CHAR IN PASSWORD (PASSWORD LENGTH) TIMES
            
            if(Character.isUpperCase(c)) { //IF SOMEWHERE IN PASSWORD UPPERCASE IS EXISTING - RETURN 1 (TRUE)
                upCount++;
            }
            if(Character.isLowerCase(c)) { //IF SOMEWHERE IN PASSWORD LOWERCASE IS EXISTING - RETURN 1 (TRUE)
                loCount++;
            }
            if(Character.isDigit(c)) { //IF SOMEWHERE IN PASSWORD NUMBER IS EXISTING - RETURN 1 (TRUE)
                digit++;
            }
            if(c>=33&&c<=46||c==64) {
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
