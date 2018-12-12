/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

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
    String[] Mn = {"<", ">"};
    String[] D = {"/"};
    String[] SL = {"\n"};

    public boolean ValidateAlphabet(String[] alph, char currentChar) {
        String currentCharStr = String.valueOf(currentChar);
        for (String item : alph) {
            if (item.equals(currentCharStr)) {
                return true;
            }
        }
        return false;
    }
}
