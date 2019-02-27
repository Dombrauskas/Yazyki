package Cirilico;

/**
 *
 * @author Mauricio
 * Converte nomes escritos no alfabeto latino para o alfabeto cirilico.
 * Converts names written in the Latin alphabet to the Cyrillic alphabet.
*/
class Convert {
    char[] xh;
    
    Convert (int size, char[] n) {
        xh = new char[size];
        xh = n;
    }
    
    // Converte cada caracter individualmente;
    // alguns casos especiais são atendidos.
    // Converts each character individually;
    // some special case are dealt with.
    void trad(char[] xh) {
        for (int i = 0; i < xh.length; i++) {
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
                // Letra C tem muitas variações: Chico, Chaves, Richard...
                // Não completamente (ou decentemente) abordados ainda...
                // 27.02.19 - 20:21 MF.
                case 'C':
                    xh[i] = '\u041A';
                    break;
                case 'c':
                    if (xh[i+1] == 'h') {
                        xh[i] = '\u0449';
                        xh[i+1] = '\u044C';
                    } else 
                        xh[i] = '\u043A';
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
                    if (xh[i+1] == 'i') 
                        xh[i] = '\u0416';
                    else 
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
                    xh[i] = '\u0438';
                    switch (xh[i+1]) {
                        case 'a':
                            xh[i+1] = '\u044F';
                            continue;
                        case 'u':
                            xh[i+1] = '\u044E';
                            continue;
                        default:
                            xh[i] = '\u0438';
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
                    if (xh[i+1] == 'h') {
                        xh[i] = '\u0424';
                        xh[i+1] = '\u044C';
                    }
                    else 
                        xh[i] = '\u041F';
                    break;
                case 'p':
                    switch(xh[i+1]) {
                        case '\n':
                            xh[i] = '\u043F';
                            xh[i+1] = '\u044C';
                            break;
                        case 'h':
                            xh[i] = '\u0444';
                            xh[i+1] = '\u044C';
                            break;
                        default:
                            xh[i] = '\u043F';
                    }
                    /*
                    if (xh[i+1] == '\n') 
                        xh[i+1] = '\u044C';
                    else if (xh[i+1] == 'h') {
                        xh[i] = '\u0444';
                        xh[i+1] = '\u044C';
                    }
                    else 
                        xh[i] = '\u043F';*/
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
                    boolean z = false, Z = false;
                    // Alguns casos não estão funcionando corretamente
                    // 27.02 20:49 MF
                    switch (xh[i-1]) {
                        case 'a':
                        case 'e':
                        case 'i':
                        case 'o':
                        case 'u':
                        case 'A':
                        case 'E':
                        case 'I':
                        case 'O':
                        case 'U':
                            z = true;
                            System.out.println(z);
                            break;
                    }
                    if (z)
                        switch(xh[i+1]) {
                            case 'a':
                            case 'e':
                            case 'i':
                            case 'o':
                            case 'u':
                                Z = true;
                                break;
                        }
                    System.out.println("status "+z);
                    if (Z)
                        xh[i] = '\u0437';
                    if (!z) {
                        if (xh[i+1] == 'h') {
                            xh[i] = '\u0448';
                            xh[i+1] = '\u044C';
                        } else
                            xh[i] = '\u0441';
                    }
                    break;
                case 'U':
                    xh[i] = '\u0423';
                    break;
                case 'u':
                    if (xh[i-1] == '\u0410' | xh[i-1] == '\u0430')
                        xh[i] = '\u0432';
                    else 
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
                case 'T':
                    xh[i] = '\u0422';
                    break;
                case 't':
                    if (xh[i+1] == '\n') xh[i+1] = '\u044C';
                    xh[i] = '\u0442';
                    break;
                case 'M':
                    xh[i] = '\u041C';
                    break;
                case 'm':
                    xh[i] = '\u043C';
                    break;
                case 'É':
                    xh[i] = '\u042D';
                    break;
                case 'é':
                    xh[i] = '\u044D';
                    break;
            }
        }
        System.out.print("Seu nome em russo: ");
    }
    
    // Método para excluir os "ь" do nome. ->> Ainda excluindo o último não pode excluí-lo).
    // Method to peel the "ь" off the name.
    void limpa(Convert s) {
        int i;
        boolean flag = false;
        for (i = 0; i < s.xh.length - 1; ++i)
            if (s.xh[i] == '\u044C') {
                flag = true;
                break;
            }
            
        if (flag)
            for (int j = i; j < s.xh.length - 1; ++j)
                s.xh[j] = s.xh[j+1];
    }
}

public class NovoClass {
    public static void main(String []args) 
        throws java.io.IOException {
        char []name = new char[10];
        
        int i;
        for (i = 0; i < 10; ++i) {
            name[i] = (char) System.in.read();
            if (name[i] == '\n') break;
        }
        
        Convert cv = new Convert(i, name);
        cv.trad(name);
        
        // Se o nome em russo tiver um "ь" entre a segunda e a penúltima posição,
        // o objeto que contém o nome é passado para o método 'limpa' que os removerá.
        // If the Russian name has a "ь" between the second and before-last position
        // the object which has the name is passed to the method 'limpa' that will
        // wipe it off.
        for (int j = 0; j < i; j++) 
            if (cv.xh[j] == '\u044C') {
                cv.limpa(cv);
                break;
            }
        System.out.println(cv.xh);
    }
}
