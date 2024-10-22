/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package christmas;

import java.io.IOException;
import java.util.Collections;
import java.util.Random;

/**
 *
 * @author hunter
 */
public class Christmas {

    public void cls(){
        try{
            if(System.getProperty("os.name").contains("Windows")){
              new ProcessBuilder("cmd","/c", "cls").inheritIO().start().waitFor();
            }else{
              new ProcessBuilder("clear").inheritIO().start().waitFor();
            }
        }catch(IOException | InterruptedException e){}
    }
    
    /**
     *
     * @param colors
     * @param speed
     * @param msg
     * @param msgr
     * @throws InterruptedException
     */
    public void printStyle(COLORS[] colors, int speed, String msg, String msgr) throws InterruptedException{
        while(true){
            cls();
            printTree(colors);
            printStyledMsg(colors, msg, msgr);
            Thread.sleep(speed);
        }
    }
    
    private void printTree(COLORS[] colors){
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
    
    private int padding =0;
    public void setLeftPadding(int left_padding){
        padding = left_padding;
    }
    
    private void printStyledMsg(COLORS[] color, String msg, String msgr) throws InterruptedException{
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