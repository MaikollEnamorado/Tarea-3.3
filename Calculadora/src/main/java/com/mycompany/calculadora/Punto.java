package com.mycompany.calculadora;

public class Punto {
    String txt_pantalla;
    Punto (String txt_pantalla){
        this.txt_pantalla = txt_pantalla;
    }
    public String accion(){
        int encontrado = 0;
        if(txt_pantalla.isBlank() == false){
            for(int i = 0; i < txt_pantalla.length(); i++){
                if(txt_pantalla.charAt(i) == '.'){
                    encontrado = encontrado + 1;
                }
            }
            if (encontrado == 0){
                txt_pantalla = txt_pantalla + ".";
            }
        }else{
            txt_pantalla = "0.";
        }
        
        return txt_pantalla;
    }
    
}
