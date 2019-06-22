/**
 * 
 * @author Mauricio
 * Alfabeto Coreano (Hangul Jamo).
 * Korean alphabet (Hangul Jamo).
*/

class Alfabeto {
    public static void main(String args[]) {
        char[] Hangul_Jamo = { '\u1100', '\u1102', '\u1103', '\u1105', '\u1106',
        '\u1107', '\u1109', '\u110B', '\u110C', '\u110E', '\u110F', '\u1110',
        '\u1111', '\u1112', '\u1161', '\u1163', '\u1165', '\u1167', '\u1169',
        '\u116E', '\u1172', '\u1173', '\u1175', '\u1101', '\u1104', '\u1108',
        '\u110A', '\u110D', '\u1162', '\u1164', '\u1166', '\u1168', '\u116C',
        '\u1171', '\u1174', '\u116A', '\u116F', '\u116B', '\u1170' };
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

