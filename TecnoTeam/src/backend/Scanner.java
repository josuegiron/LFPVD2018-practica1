/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

import java.util.ArrayList;

/**
 *
 * @author josue
 */
public class Scanner {

    public String Code;
    public int currentRow, currentColum, currentState;
    private char currentChar;
    private int index;
    public ArrayList<Token> TokenTable;
    public ArrayList<Error> ErrorTable;
    public Alphabet alph;
    private Token token;

    public Scanner(String code) {
        Code = code;
        currentState = 0;
        currentRow = currentColum = 1;
        TokenTable = new ArrayList<Token>();
        ErrorTable = new ArrayList<Error>();
        alph = new Alphabet();
    }

    public void Scan() {
       
        for (index = 0; index < Code.length(); index++) {
            currentChar = Code.charAt(index);
             System.out.println(currentChar);
            currentColum++;
            switch (currentState) {
                case 0:
                    token = new Token();
                    token.Row = currentRow;
                    token.Colum = currentColum;

                    if (alph.Validate(alph.M, currentChar)) {
                        token.Lexema += currentChar;
                        currentState = 1;
                    }else{
                        System.out.println("No funciona");
                    }
                    break; // So

                case 1:
                    System.out.println("hola");
                    if (alph.Validate(alph.M, currentChar)) {
                        token.Lexema += currentChar;
                        currentState = 1;
                    } else {
                        currentState = 0;
                        index--;
                        currentColum--;
                        token.setType("Palabra reservada");
                        TokenTable.add(token);
                    }
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
                    currentState = 0;
                    index--;
                    currentColum--;
                    token.setType(Code);
                    TokenTable.add(token);
                    break; // S6 *

                default: // ERROR
                // Statements
            }
        }
        
        System.out.println(TokenTable);

    }
}
