/**
 * 
 * @author Maurício
 * 
 * 
*/

class convert {
    char[] hj;

    convert(int size, char[] name) {
        hj = new char[size];
        hj = name;
    }
    
    void silabas(int size, char[] name) {
        //super(size, name);
    }
    
    /*
    char[] Hangul = { '\u1100', '\u1102', '\u1103', '\u1105', '\u1106',
        '\u1107', '\u1109', '\u110B', '\u110C', '\u110E', '\u110F', '\u1110',
        '\u1111', '\u1112', '\u1161', '\u1163', '\u1165', '\u1167', '\u1169',
        '\u116E', '\u1172', '\u1173', '\u1175', '\u1101', '\u1104', '\u1108',
        '\u110A', '\u110D', '\u1162', '\u1164', '\u1166', '\u1168', '\u116C',
        '\u1171', '\u1174', '\u116A', '\u116F', '\u116B', '\u1170' };
    */
    
    void trad(char[] hj) {
        for (int i = 0; i < size; i++) {
            switch(hj[i]) {
                case 'A':
                    hj[i] = '\uc544';
                break;
                case 'B':
                break;
                case 'C':
                break;
                case 'D':
                break;
                case 'E':
                break;
                case 'F':
                break;
                case 'G':
                break;
                case 'H':
                break;
                case 'I':
                break;
                case 'J':
                break;
                case 'K':
                break;
                case 'L':
                break;
                case 'M':
                break;
                case 'N':
                break;
                case 'O':
                break;
                case 'P':
                break;
                case 'Q':
                break;
                case 'R':
                break;
                case 'S':
                break;
                case 'T':
                break;
                case 'U':
                break;
                case 'V':
                break;
                case 'W':
                break;
                case 'X':
                break;
                case 'Y':
                break;
                case 'Z':
                break;
            }
        }
    }
}


class Main {
    public static void main(String[] args) 
        throws java.io.IOException {
    
        char[] name = new char[10];

        int i;
        for (i = 0; i < 10; ++i) {
            name[i] = (char) System.in.read();
            if (i == 9) name[i] = '\n';
            if (name[i] == '\n') break;
        }
        
        for (int j = 0; j < name.length; j++)
            name[j] = Character.toUpperCase(name[j]);
                                        
//        Convert cv = new Convert(i, name);
//        cv.trad(name);
        
        // Apenas exibe o nome digitado em Caps Lock (Por enquanto).
        System.out.println(name);
    }    
}
