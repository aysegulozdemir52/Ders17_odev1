package org.example;

public class MySqlLocal {
    public static void main(String[] args) {

        /*CreateMethod tabloekle = new CreateMethod();
        tabloekle.create();*/

        SelectMethod tabloliste = new SelectMethod();
        tabloliste.select();

        UpdateMethod tablodegistir = new UpdateMethod();
        tablodegistir.degistir();

        tabloliste = new SelectMethod();
        tabloliste.select();

        DeleteMethod deletemethod = new DeleteMethod();
        deletemethod.sil();
    }
}