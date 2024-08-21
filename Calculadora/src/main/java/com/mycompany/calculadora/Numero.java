package com.mycompany.calculadora;

public class Numero {
    String txt_pantalla;
    String num;
    Numero(String txt_pantalla, String num){
        this.txt_pantalla = txt_pantalla;
        this.num = num;
    }
    public String agregarnumero(){
        txt_pantalla = txt_pantalla + num;
        return txt_pantalla;
    }
}
