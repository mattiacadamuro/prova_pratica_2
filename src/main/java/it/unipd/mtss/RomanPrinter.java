////////////////////////////////////////////////////////////////////
// MATTIA CADAMURO 2111534
// MICHELE TESSER 2111012
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

public class RomanPrinter {
    public static String print(int  num){
        return printAsciiArt(IntegerToRoman.convert(num));
    }

    private static String printAsciiArt(String romanNumber){
        StringBuilder out = new StringBuilder();
        for(int i = 0; i < RomanNumber.lineHeight; i++){
            for(String ch : romanNumber.split("")){
                switch(ch){
                    case "I": out.append(RomanNumber.I[i]); break;
                    case "V": out.append(RomanNumber.V[i]); break;
                    case "X": out.append(RomanNumber.X[i]); break;
                    case "L": out.append(RomanNumber.L[i]); break;
                    case "C": out.append(RomanNumber.C[i]); break;
                    case "D": out.append(RomanNumber.D[i]); break;
                    case "M": out.append(RomanNumber.M[i]); break;
                    default: return "";
                }
                out.append(" ");
            }
            out.append("\n");
        }

        out.deleteCharAt(out.length()-1);
        return out.toString();
    }
}