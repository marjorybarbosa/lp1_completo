
package com.chemaclass.conversorbase.base;

import com.chemaclass.conversorbase.Principal;
import com.chemaclass.conversorbase.Utils;

public class Decimal implements Base {

    @Override
    public String toBinary(String input) {
        return (!Utils.isDecimal(input) || input.length() == 0) ? "Input Error. eh decimal?"
                : convert(input, 2);
    }

    @Override
    public String toOctal(String input) {
        return (!Utils.isDecimal(input) || input.length() == 0) ? "Input Error. eh decimal?"
                : convert(input, 8);
    }

    @Override
    public String toDecimal(String input) {
        return (!Utils.isDecimal(input) || input.length() == 0) ? "Input Error. eh decimal?"
                : input;
    }

    @Override
    public String toHexadecimal(String input) {
        return (!Utils.isDecimal(input) || input.length() == 0) ? "Input Error. eh decimal?"
                : convert(input, 16);
    }

   
    private String convert(String inputDecimal, int base) {
        String resultado = "", out = "";
        long input, aux = Long.parseLong(inputDecimal);
        int residuo = 0;
        while (Math.round(aux / base) != 0) {
            residuo = (int) aux % base;
            residuo = Math.abs(residuo);
            input = aux; 
            aux /= base;
            resultado = ((base == 16 && residuo > 9) ? Utils.getCharByHexa(residuo)
                    : residuo) + resultado;
            out += input + " / " + base + " =  " + aux + " (->" + residuo
                    + ")\t| ... " + resultado + "\n";
        }
       
        residuo = (int) aux % base;
        input = aux; 
        aux /= base;
        resultado = ((base == 16 && residuo > 9) ? Utils.getCharByHexa(residuo)
                : residuo) + resultado;
        out += input + " / " + base + "  =  " + aux + " (->" + residuo
                + ")\t| ... " + resultado;

        Principal.log(out);
        return resultado; 
    }

    @Override
    public String me() {
        return "Decimal";
    }
}
