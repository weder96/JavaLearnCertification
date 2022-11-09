/**
 * This program displays a declaring constants
 * @version 0.01 2021-03-15
 * @author Weder Sousa
 */
public class Constantes2 {
    public static final double CM_PER_INCH = 2.54;
    
    public static void main(String[] args) {
        double paperWidth = 8.5;
        double paperHeight = 11;
        System.out.println("Paper size in centimeters: "
        + paperWidth * CM_PER_INCH + " by " + paperHeight * CM_PER_INCH);
        int x = 0;
        x += 3.5;        
        x += 3;     
        System.out.println(x);
    }
}