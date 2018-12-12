/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend.scanner;

import java.util.ArrayList;

/**
 *
 * @author josue
 */
public class Scanner {

    public String Code;
    private String lexema;
    public int row, column, currentRow, currentColum, currentState;
    private char currentChar;
    private int index;
    public ArrayList<Token> TokenTable;
    public ArrayList<Error> ErrorTable;
    public Alphabet alph;

    public Scanner(String code) {
        Code = code;
        row = column = currentState = 0;
        currentRow = currentColum = 1;
        TokenTable = new ArrayList<Token>();
        ErrorTable = new ArrayList<Error>();
        alph = new Alphabet();
    }

    public void Scan() {
        for (index = 0; index < Code.length(); index++) {
            currentChar = Code.charAt(index);
            switch (currentState) {
                case 0:
                    if (alph.Validate(alph.M, currentChar)) {

                    }
                    break; // So

                case 1:
                    break; // S1 *
                case 2:
                    break; // S2
                case 3:
                    break; // S3
                case 4:
                    break; // S4 *
                case 5:
                    break; // S5
                case 6:
                    break; // S6 *

                default: // ERROR
                // Statements
            }
        }

    }
}
