package Cirilico;

/**
 *
 * @author Mauricio
 */
class Convert {
    char[] xh;
    
    Convert (int size, char[] n) {
        xh = new char[size];
        xh = n;
//        char ch;
        
        for (int i = 0; i < size; i++) {
//            System.out.println("Letra da vez " + xh[i] + " - " + i);
            switch (xh[i]) {
                case 'A':
                    xh[i] = '\u0410';
                    break;
                case 'a':
                    xh[i] = '\u0430';
                    break;
                case 'B':
                    xh[i] = '\u0411';
                    break;
                case 'b':
                    xh[i] = '\u0431';
                    break;
                case 'C':
                    xh[i] = '\u041A';
                    break;
                case 'c':
                    xh[i] = '\u0441';
                    break;
                case 'D':
                    xh[i] = '\u0414';
                    break;
                case 'd':
                    xh[i] = '\u0434';
                    break;
                case 'E':
                    xh[i] = '\u0415';
                    break;
                case 'e':
                    xh[i] = '\u0435';
                    break;
                case 'F':
                    xh[i] = '\u0424';
                    break;
                case 'f':
                    xh[i] = '\u0444';
                    break;
                case 'G':
                    xh[i] = '\u0413';
                    break;
                case 'g':
                    xh[i] = '\u0433';
                    break;
                case 'H':
                    if (xh[i+1] == 'a') xh[i] = '\u0425';
                    else xh[i] = '\u042C';
                    break;
                case 'h':
                    xh[i] = '\u044C';
                    break;
                case 'I':
                    xh[i] = '\u0418';
                    break;
                case 'i':
                    n[i] = '\u0438';
                    switch (n[i+1]) {
                        case 'a':
                            n[i+1] = '\u044F';
                            continue;
                        case 'u':
                            n[i+1] = '\u044E';
                            continue;
                        default:
                            n[i] = '\u0438';
                    }
                    break;
                case 'J':
                    xh[i] = '\u0416';
                    break;
                case 'j':
                    xh[i] = '\u0436';
                    break;
                case 'K':
                    xh[i] = '\u041A';
                    break;
                case 'k':
                    xh[i] = '\u043A';
                    break;
                case 'L':
                    xh[i] = '\u041B';
                    break;
                case 'l':
                    if (xh[i+1] == '\n') xh[i+1] = '\u044C';
                    xh[i] = '\u043B';
                    break;
                case 'N':
                    xh[i] = '\u041D';
                    break;
                case 'n':
                    xh[i] = '\u043D';
                    break;
                case 'P':
                    xh[i] = '\u041F';
                    break;
                case 'p':
                    xh[i] = '\u043F';
                    break;
                case 'R':
                    xh[i] = '\u0420';
                    break;
                case 'r':
                    xh[i] = '\u0440';
                    break;
                case 'S':
                    xh[i] = '\u0421';
                    break;
                case 's':
                    xh[i] = '\u0441';
                    break;
                case 'U':
                    xh[i] = '\u0423';
                    break;
                case 'u':
                    xh[i] = '\u0443';
                    break;
                case 'V':
                    xh[i] = '\u0412';
                    break;
                case 'v':
                    xh[i] = '\u0432';
                    break;
                case 'Y':
                    xh[i] = ' ';
                    switch (xh[i+1]) {
                        case 'a':
                            xh[i+1] = '\u042F';
                            continue;
                        case 'u':
                            xh[i+1] = '\u042E';
                            continue;
                        default:
                            xh[i] = '\u0419';
                            break;
                    }
                    break;
                case 'y':
                    switch (xh[i+1]) {
                        case 'a':
                            xh[i] = '\u044F';
                            break;
                        case 'u':
                            xh[i] = '\u044E';
                            break;
                        default:
                            xh[i] = '\u044B';
                            xh[i+1] = '\u0439';
                            break;
                    }
                    break;
                case 'Z':
                    xh[i] = '\u0417';
                    break;
                case 'z':
                    xh[i] = '\u0437';
                    break;
                case 't':
                    xh[i] = '\u0442';
                    break;
                case 'm':
                    xh[i] = '\u043C';
                    break;
//                default:
  //                  continue;
            }
        }
        System.out.print("Seu nome em russo: ");
    }
    
    public static void main(String []args) 
        throws java.io.IOException {
        char []name = new char[10];
        
        int i;
        for (i = 0; i < 10; ++i) {
            name[i] = (char) System.in.read();
            if (name[i] == '\n') break;
        }
//        i -=1;
//        System.out.print(name);
        
        Convert cv = new Convert(i, name);
        System.out.print(cv.xh);
     }
}
