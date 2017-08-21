
package com.chemaclass.conversorbase.base;

import com.chemaclass.conversorbase.Principal;
import com.chemaclass.conversorbase.Utils;


public class Octal implements Base {

    @Override
    public String toBinary(String input) {
        if (!Utils.isOctal(input) || input.length() == 0) {
            return "Input Error. eh Octal? ";
        }
        String resultado = "", binario = "", out = "/ ";
        for (int i = 0; i < input.length(); i++) {
            String s = "" + input.charAt(i);
            binario = Utils.getBinaryByDecimal(s, 8);
            out += s + ":" + binario + " / "; 
            resultado += binario;
        }
        Principal.log(out);
        return resultado;
    }

    @Override
    public String toOctal(String input) {
        return (!Utils.isOctal(input) || input.length() == 0) ? "Input error. eh octal?"
                : input;

    }

    @Override
    public String toDecimal(String input) {
        if (!Utils.isOctal(input) || input.length() == 0) {
            return "Input Error. eh Octal?";
        }
        String resultado = "", decimal = "", out = "1 convertido em binário:\n/ ";
        for (int i = 0; i < input.length(); i++) {
            String s = "" + input.charAt(i);
            decimal = Utils.getBinaryByDecimal(s, 8);
            out += s + ":" + decimal + " / "; 
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
        if (!Utils.isOctal(input) || input.length() == 0) {
            return "Input Error. eh Octal?";
        }
        String resultado = "", decimal = "", out = "1 convertido em binário:\n";
        for (int i = 0; i < input.length(); i++) {
            String s = "" + input.charAt(i);
            decimal = Utils.getBinaryByDecimal(s, 8);
            out += s + ":" + decimal + " "; 
            resultado += decimal;
        }
        out += "\nbinário seria " + resultado + "\n";
        out += "Agora fazemos as somas para passar de binário para decimal:";

        Principal.log(out);

        Binary binary = new Binary();
        resultado = binary.toHexadecimal(resultado);

        return resultado;
    }

    @Override
    public String me() {
        return "Octal";
    }
}
