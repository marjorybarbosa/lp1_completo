
package com.chemaclass.conversorbase.base;

import java.util.StringTokenizer;

import com.chemaclass.conversorbase.Principal;
import com.chemaclass.conversorbase.Utils;


public class Binary implements Base {

    @Override
    public String toBinary(String input) {
        return (!Utils.isBinary(input) || input.length() == 0) ? " error. eh binario?"
                : input;
    }

    @Override
    public String toOctal(String input) {
        if (!Utils.isBinary(input) || input.length() == 0) {
            return " error. eh binario?";
        }
        int residuo = 0;
        
        if ((residuo = input.length() % 3) != 0) {
            String s = (residuo == 1) ? "00" : "0";
            input = s + input;
        }
        return convert(input, 3);
    }

    @Override
    public String toHexadecimal(String input) {
        if (!Utils.isBinary(input) || input.length() == 0) {
            return " error. eh binario?";
        }
        int residuo = 0;
       
        if ((residuo = input.length() % 4) != 0) {
            String s = (residuo == 1) ? "000" : ((residuo == 2) ? "00" : "0");
            input = s + input;
        }
        return convert(input, 4);
    }

   
    private String convert(String input, int base) {
        String resultado = "";

        
        String aux = "", log = "/ ";
        for (int i = 0; i < input.length() - 1; i += base) {
            String s = input.substring(i, i + base);
            int decimal = Integer.parseInt(Utils.getDecimalByBinary(s));
            log += s + ":" + Utils.getCharByHexa(decimal) + " / ";
            aux += s + " ";
        }
        Principal.log(log);
        StringTokenizer st = new StringTokenizer(aux, " ");

        while (st.hasMoreElements()) {
            
            String next = st.nextToken();
            int decimal = Integer.parseInt(Utils.getDecimalByBinary(next));
            resultado += Utils.getCharByHexa(decimal);
        }
        return resultado;
    }

    @Override
    public String toDecimal(String input) {
        if (!Utils.isBinary(input) || input.length() == 0) {
            return " error. eh binario?";
        }
        if (input.length() <= 4) {
            if (Long.parseLong(input) == 0 || Long.parseLong(input) == 1) {
                return input;
            }
        }
        String out = "";
        long resultado = 0, base = 0;
        long sumaje;
        for (int i = input.length() - 1; i >= 0; i--) {
            char c = input.charAt(i);
            if (c == '1') {
                sumaje = (long) Math.pow(2, base);
                out = sumaje + " (2^" + base + ") \n" + " + " + out;
                resultado += sumaje;
            }
            base++;
        }
        out = out.substring(0, out.length() - 3);
        out += " = " + resultado;
        Principal.log(out);
        return String.valueOf(resultado);     
    }

    @Override
    public String me() {
        return "Binary";
    }
}
