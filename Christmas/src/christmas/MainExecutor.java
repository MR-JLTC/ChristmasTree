/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package christmas;

import static christmas.COLORS.BLUE;
import static christmas.COLORS.GRAY;
import static christmas.COLORS.GREEN;
import static christmas.COLORS.RED;
import static christmas.COLORS.WHITE;
import static christmas.COLORS.YELLOW;
import java.util.Scanner;

/**
 *
 * @author hunter
 */
public class MainExecutor {
    public static void main(String[] args) throws InterruptedException {
        COLORS[] colors = {
            GRAY, RED, WHITE, BLUE, YELLOW, GREEN
        };
        Christmas xmas = new Christmas();
        xmas.cls();
        System.out.print("Speed: ");
        int speed = new Scanner(System.in).nextInt();
        System.out.print("Your Message: ");
        String msg = new Scanner(System.in).nextLine();
        System.out.print("Left Padding: ");
        xmas.setLeftPadding(new Scanner(System.in).nextInt());
        System.out.print("From: ");
        String msgr = new Scanner(System.in).nextLine();
        xmas.printStyle(colors, speed, msg.toUpperCase(), msgr.toUpperCase());
    }
}
