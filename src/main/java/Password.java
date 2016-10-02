import com.sun.org.apache.xerces.internal.impl.io.ASCIIReader;

import static java.lang.Character.*;

/**
 * Created by ManiCibi on 10/2/2016.
 */
public class Password {

    public static void main(String[] args) {
        String password = "Aa#3";
        validatePassword(password);
    }

    public static void validatePassword(String password){
        boolean validSym=false;
        boolean validNum=false;
        boolean validLower=false;
        boolean validUpper=false;
        char[] charSym = {'@','#','&','!'};
        for(int i=0;i<password.length();i++){
            for(int j=0;j<charSym.length;j++){
                if(password.charAt(i) == charSym[j]){
                    validSym = true;
                    continue;
                }
            }
            if(isDigit(password.charAt(i))){
                validNum = true;
                continue;
            }
            if(password.charAt(i) == toLowerCase(password.charAt(i))){
                validLower = true;
                continue;
            }

            if(password.charAt(i) == toUpperCase(password.charAt(i))){
                validUpper = true;
                continue;
            }

        }
        if(validNum && validLower && validUpper && validSym){
            System.out.print("Valid Password");
        }else{
            System.out.println("Invalid Password");
        }
    }
}
