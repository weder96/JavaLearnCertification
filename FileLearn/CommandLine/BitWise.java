/**
 * This program displays a bitWise
 * @version 0.01 2021-03-15
 * @author Weder Sousa
 */
public class BitWise {
    public static void main(String[] args) {
        int n = 8;
        int fourBitFromRight = (n & 0b1000) / 0b1000;
        System.out.println(fourBitFromRight);
        int fourthBitFromRight = (n & (1 << 3)) >> 3;
        System.out.println(fourthBitFromRight);
    }
}