/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cirilico;

/**
 *
 * @author Mauricio
 */
class Alfabeto {
    public static void main(String args[]) {
        char[] Cirilico = { '\u0410', '\u0411', '\u0412', '\u0413', '\u0414',
            '\u0415', '\u0401', '\u0416', '\u0417', '\u0418', '\u0419', '\u041A',
            '\u041B', '\u041C', '\u041D', '\u041E', '\u041F', '\u0420', '\u0421',
            '\u0422', '\u0423', '\u0424', '\u0425', '\u0426', '\u0427', '\u0428',
            '\u0429', '\u042A', '\u042B', '\u042C', '\u042D', '\u042E', '\u042F' };
        int i = 0;
        char ch = '\u0401';
        
        for (char col : Cirilico) {
            System.out.print(col);
            if (col == ch) {
                col = '\u0451';
                System.out.print("" + col + "\t");
                i++;
            } else {
                col = (char) ((int) col + 32);
                System.out.print("" + col + "\t");
                i++;
                if (i == 10) {
                    System.out.println();
                    i = 0;
                }
            }
        }
        System.out.println();
    }
}
