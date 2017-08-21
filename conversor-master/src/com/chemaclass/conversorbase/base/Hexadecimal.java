
package com.chemaclass.conversorbase.base;

import com.chemaclass.conversorbase.Principal;
import com.chemaclass.conversorbase.Utils;

public class Hexadecimal implements Base {

    @Override
    public String toBinary(String input) {
        if (!Utils.isHexadecimal(input) || input.length() == 0) {
            String text = "Input Error. eh Hexadecimal?";
            return text;
        }
        String resultado = "", binario = "", out = "";
        for (int i = 0; i < input.length(); i++) {
            String s = "" + input.charAt(i);
            
            if (!Utils.isAlpha(s)) {
                binario = Utils.getBinaryByDecimal(s, 16);
            } 
            else {
                binario = Utils.getBinaryByAlpha(s);
            }
            out += s + ":" + binario + " "; 
            resultado += binario;
        }
        Principal.log(out);
        return resultado;
    }

    @Override
    public String toOctal(String input) {
        if (!Utils.isHexadecimal(input) || input.length() == 0) {
            return "Input Error. eh Hexadecimal?";
        }
        String resultado = "", decimal = "", out = "1 convertido em binário:\\n/ ";
        for (int i = 0; i < input.length(); i++) {
            String s = "" + input.charAt(i);
            
            if (!Utils.isAlpha(s)) {
                decimal = Utils.getBinaryByDecimal(s, 16);
            } 
            else {
                decimal = Utils.getBinaryByAlpha(s);
            }
            out += s + ":" + decimal + " "; 
            resultado += decimal;
        }
        out += "\nbinário seria " + resultado + "\n";
        out += "Agora fazemos as somas para passar de binário para decimal:";

        Principal.log(out);

        Binary binary = new Binary();
        resultado = binary.toOctal(resultado);

        return resultado;
    }

    @Override
    public String toDecimal(String input) {
        if (!Utils.isHexadecimal(input) || input.length() == 0) {
            return "Input Error. eh Hexadecimal?";
        }
        String resultado = "", decimal = "", out = "1 convertido em binário:\n";
        for (int i = 0; i < input.length(); i++) {
            String s = "" + input.charAt(i);
            
            if (!Utils.isAlpha(s)) {
                decimal = Utils.getBinaryByDecimal(s, 16);
            } 
            else {
                decimal = Utils.getBinaryByAlpha(s);
            }
            out += s + ":" + decimal + " "; 
            resultado += decimal;
        }
        out += "\nbinário seria " + resultado + "\n";
        out += "Agora fazemos as somas para passar de binário para decimal:";

        Principal.log(out);

        Binary binary = new Binary();
        resultado = binary.toDecimal(resultado);
        return resultado;
    }

    @Override
    public String toHexadecimal(String input) {
        return (!Utils.isHexadecimal(input) || input.length() == 0) ? "Input error. eh hexadecimal?"
                : input;
    }

    @Override
    public String me() {
        return "Hexadecimal";
    }
}
