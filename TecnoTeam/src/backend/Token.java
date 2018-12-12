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
public class Token {
    public int ID, Token, Row, Colum;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getToken() {
        return Token;
    }

    public void setToken(int Token) {
        this.Token = Token;
    }

    public int getRow() {
        return Row;
    }

    public void setRow(int Row) {
        this.Row = Row;
    }

    public int getColum() {
        return Colum;
    }

    public void setColum(int Colum) {
        this.Colum = Colum;
    }

    public String getLexema() {
        return Lexema;
    }

    public void setLexema(String Lexema) {
        this.Lexema = Lexema;
    }

    public String getType() {
        return Type;
    }

    public void setType(String Type) {
        this.Type = Type;
    }

    public Token(int ID, int Token, int Row, int Colum, String Lexema, String Type) {
        this.ID = ID;
        this.Token = Token;
        this.Row = Row;
        this.Colum = Colum;
        this.Lexema = Lexema;
        this.Type = Type;
    }

    public Token() {
    }
    public String Lexema, Type;
}
