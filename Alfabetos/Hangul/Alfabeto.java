/**
 * 
 * @author Mauricio
 * Alfabeto Coreano (Hangul Jamo).
 * Korean alphabet (Hangul Jamo).
*/

class Alfabeto {
    public static void main(String args[]) {
        char[] Hangul_Jamo = { '\u1161', '\u1163', '\u1165', '\u1168', '\u1162',
            '\u1164', '\u1169', '\u116D', '\u116E', '\u1173', '\u1166', '\u1168',
            '\u1175', '\u1173', '\u116A', '\u116B', '\u1170', '\u1171', '\u1174',
            '\u116F', '\u1107', '\u110C', '\u1103', '\u1100', '\u1109', '\u1106',
            '\u1102', '\u110B', '\u1105', '\u1112', '\u110F', '\u1110', '\u110E',
            '\u1111', '\u1108', '\u110D', '\u1104', '\u1101', '\u110A' };
        int i = 0;
        
        for (char col : Hangul_Jamo) {
            System.out.print(col + " ");
            i++;
            if (i == 10) {
                System.out.println();
                i = 0;
            }
        }
        System.out.println();
    }
}
