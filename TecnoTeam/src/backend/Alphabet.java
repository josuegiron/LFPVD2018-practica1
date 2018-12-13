/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import static jdk.nashorn.internal.objects.NativeArray.map;

/**
 *
 * @author josuegiron
 */
public class Alphabet {
    
    String[] Lm = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "\\u00f1", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
    String[] LM = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "\\u00d1", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
    String[] N = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "0"};
    String[] C = {","};
    String[] Cm = {"\""};
    String[] E = {"<", ">"};
    String[] D = {"/"};
    String[] SL = {"\n"};
    Map<Integer, String> ReservedWords = new HashMap<Integer, String>();
    Map<Integer, String[]> Token = new HashMap<Integer, String[]>();
    String[] des;
    private char[] specialChar = {' ', '\t', '\b', '\f', '\r', '\n'};
    
    public boolean ValidateAlphabet(String[] alph, char currentChar) {
        String currentCharStr = String.valueOf(currentChar);
        for (String item : alph) {
            if (item.equals(currentCharStr)) {
                return true;
            }
        }
        return false;
    }
    
    public boolean ValidateSpecialChar(char cuerrentChar){
        for (char item : specialChar) {
            if (item == cuerrentChar) {
                return true;
            }
        }
        return false;
    }
    
    public boolean ValidateLexeme(String lexeme) {
        Iterator it = ReservedWords.keySet().iterator();
        while (it.hasNext()) {
            Integer key = (Integer) it.next();
            if (ReservedWords.get(key).equals(lexeme)) {
                return true;
            }
            
        }
        return false;
    }
    
    public String[] getToken(int id) {
        Iterator it = Token.keySet().iterator();
        while (it.hasNext()) {
            Integer key = (Integer) it.next();
            if (key.equals(id)) {
                return Token.get(key);
            }
            
        }
        return null;
    }

    public Alphabet() {
        ReservedWords.put(1, "DIAGRAMA");
        ReservedWords.put(2, "NOMBRE");
        ReservedWords.put(3, "COMPONENTE");
        ReservedWords.put(4, "CODIGO");
        ReservedWords.put(5, "TIPO");
        ReservedWords.put(6, "TEXTO");
        ReservedWords.put(7, "RELACION");
        
        String[] reservada = {"Reservada", "Letras mayusculas, seguidas de letras mayusculas"};
        Token.put(1, reservada);
        String[] numero = {"Numero", "Numeros seguidos de numeros"};
        Token.put(2, numero);
    }
    
}
