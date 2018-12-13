/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

/**
 *
 * @author josue
 */
public class Error {
    public int ID, Row, Colum;
    public String Error, Description;

    public int getID() {
        return ID;
    }

    public int getRow() {
        return Row;
    }

    public int getColum() {
        return Colum;
    }

    public String getError() {
        return Error;
    }

    public String getDescription() {
        return Description;
    }

    public Error(int ID, int Row, int Colum, String Error, String Description) {
        this.ID = ID;
        this.Row = Row;
        this.Colum = Colum;
        this.Error = Error;
        this.Description = Description;
    }
}
