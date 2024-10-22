package christmas;

import static christmas.COLORS.BLUE;
import static christmas.COLORS.GRAY;
import static christmas.COLORS.GREEN;
import static christmas.COLORS.RED;
import static christmas.COLORS.WHITE;
import static christmas.COLORS.YELLOW;
import java.io.IOException;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author hunter
 */
public class Christmas {

    /**
     * @param args the command line arguments
     * @throws java.lang.InterruptedException
     */
    public static void main(String[] args) throws InterruptedException {
        COLORS[] colors = {
            GRAY, RED, WHITE, BLUE, YELLOW, GREEN
        };
        cls();
        System.out.print("Speed: ");
        int speed = new Scanner(System.in).nextInt();
        System.out.print("Your Message: ");
        String msg = new Scanner(System.in).nextLine();
        System.out.print("Left Padding: ");
        setLeftPadding(new Scanner(System.in).nextInt());
        System.out.print("From: ");
        String msgr = new Scanner(System.in).nextLine();
        printStyle(colors, speed, msg.toUpperCase(), msgr.toUpperCase());
    }
    
    private static void cls(){
        try{
            if(System.getProperty("os.name").contains("Windows")){
              new ProcessBuilder("cmd","/c", "cls").inheritIO().start().waitFor();
            }else{
              new ProcessBuilder("clear").inheritIO().start().waitFor();
            }
        }catch(IOException | InterruptedException e){}
    }
    
    private static void printStyle(COLORS[] colors, int speed, String msg, String msgr) throws InterruptedException{
        while(true){
            cls();
            printTree(colors);
            printStyledMsg(colors, msg, msgr);
            Thread.sleep(speed);
        }
    }
    
    private static void printTree(COLORS[] colors){
        Random randomGen = new Random();
        int n=30;
        System.out.println();
        for(int i=1; i<=n; i++){
            for(int spaces=1; spaces<=n-i; spaces++){
                System.out.print(" ");
            }
            for(int x=1; x<=2*i-1; x++){
                System.out.print(colors[randomGen.nextInt(6)].getColor()+"*");
            }
            System.out.println();
        }
        System.out.println(colors[5].getColor()+"                           |   |");
        System.out.println(colors[5].getColor()+"                           |   |");
        System.out.println(colors[5].getColor()+"                         __|   |__");
        
    }
    
    private static int padding =0;
    private static void setLeftPadding(int left_padding){
        padding = left_padding;
    }
    
    private static void printStyledMsg(COLORS[] color, String msg, String msgr) throws InterruptedException{
        String space = String.join("", Collections.nCopies(padding," "));
        String[] words = msg.split(" ");
        System.out.println();
        System.out.print(space);
        for(String word : words){
            System.out.print(COLORS.getRandomColors()+word+" ");
        }
        System.out.println();
        System.out.println(color[2].getColor()+"                       FROM "+color[5].getColor()+msgr);
    }
}