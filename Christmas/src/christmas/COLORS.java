/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package christmas;

import java.util.Random;

/**
 *
 * @author hunter
 */
enum COLORS{
    GRAY("\033[38;5;244m"),
    RED("\u001b[38;2;255;13;13m"),
    WHITE("\033[1;37m"),
    BLUE("\u001b[38;2;0;191;255m"),
    YELLOW("\033[1;33m"),
    GREEN("\u001B[1;92m");
    
    private final String c;
    COLORS(String c){
        this.c = c;
    }
    
    public static String getRandomColors(){
        Random randomGen = new Random();
        COLORS colors[] = {
            GRAY, RED, WHITE, BLUE, YELLOW, GREEN
        };
        return colors[randomGen.nextInt(6)].getColor();
    }
    
    public String getColor(){
        return this.c;
    }
}