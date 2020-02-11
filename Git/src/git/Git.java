/*

@author armandosanpon 04/02/2020
pide dni (numeros) y di la letra

*/

package git;

import java.util.Scanner;

public class Git {
    
    static Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args) {
        String letters;    
            System.out.print("DNI: ");       
            int dni= keyboard.nextInt();              
            char letter= DNILetter(dni);
            System.out.print(dni + "" + letter);          
    } 
    private static char DNILetter(int dni){
        int rest = dni%23;         
        String letters = "TRWAGMYFPDXBNJZSQVHLCKE";
        return letters.charAt(rest);
    }  
}
