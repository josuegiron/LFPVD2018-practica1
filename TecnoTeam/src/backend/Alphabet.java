/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author josue
 */
public class Alphabet {

    Map<Integer, String> map = new HashMap<Integer, String>();

    public String[] L = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
    public String[] M = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
    public String[] N = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "0"};
    public String[] C = {","};
    public String[] Cm = {"\""};
    public String[] D = {"/"};
    public String[] Mn = {"<", ">"};
    public String[] SL = {"\n"};

    public boolean Validate(String[] set, char currentChar) {
        String curStr = String.valueOf(currentChar);
        for (String item : set) {
            System.out.println(item);
            System.out.println(curStr);
            if (item.equals(curStr)) {
                return true;
            }
        }
        return false;
    }

    public Alphabet() {
        map.put(1, "Casillas");
        map.put(15, "Ramos");
        map.put(3, "Pique");
        map.put(5, "Puyol");
        map.put(11, "Capdevila");
        map.put(14, "Xabi Alonso");
        map.put(16, "Busquets");
        map.put(8, "Xavi Hernandez");
        map.put(18, "Pedrito");
        map.put(6, "Iniesta");
        map.put(7, "Villa");
    }

}
