/**
 * This program displays a declaring constants
 * @version 0.01 2021-03-15
 * @author Weder Sousa
 */
public class Constantes {
 public static void main(String[] args) {
    final double CM_PER_INCH = 2.54;
    double paperWidth = 8.5;
    double paperHeight = 11;
    System.out.println("Paper size in centimeters: " 
    + paperWidth * CM_PER_INCH + " by " + paperHeight * CM_PER_INCH);
 }
}