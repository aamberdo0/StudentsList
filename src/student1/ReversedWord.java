

package student1;

import java.util.Scanner;

/* author: amber Do */
public class ReversedWord {
    public static void main(String[] args){
        /*char[] myWord = new char[7]; 
        myWord[0] = 's'; 
        myWord[1] = 't'; 
        myWord[2] = 'u'; 
        myWord[3] = 'd'; 
        myWord[4] = 'e'; 
        myWord[5] = 'n';
        myWord[6] = 't'; 
        
        for(int i=0; i < myWord.length; i++){
            System.out.println(myWord.length);
        }*/
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String word = input.nextLine(); 
        char[] myLetters = new char[word.length()]; 
        /*for(int i = 0; i < myLetters.length; i ++){
            myLetters[i] = word.charAt(i); 
            System.out.println(myLetters[i]); 
                    
        }*/
        
        //print in Reverse
        for(int i = myLetters.length -1; i>=0; i--){
            myLetters[i] = word.charAt(i); 
            System.out.println(myLetters[i]); 
        }
           
    }
}
