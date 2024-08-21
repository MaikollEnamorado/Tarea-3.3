package com.mycompany.calculadora;

public class Text_Field {
    String txt_pantalla;
    Text_Field(String txt_pantalla){
        this.txt_pantalla = txt_pantalla;
    }
    public String numeros(){
        String numeros = "0123456789";
        String texto2 = "";
        int cero = 0;
        int contador = 0;
        int encontrado = 0;
        cero();
        if(txt_pantalla.charAt(0) != '.' ){
            for(int i = 0; i < txt_pantalla.length(); i++){
                for(int f = 0; f < numeros.length(); f++){
                    if(txt_pantalla.charAt(i) == numeros.charAt(f) || (txt_pantalla.charAt(i) == '.' 
                            && encontrado  == 0)){
                        if(txt_pantalla.charAt(i) == '.'){
                        encontrado = 1;
                        }
                        if(txt_pantalla.charAt(i) == '0' ){
                            contador = contador + 1;
                        }
                        texto2 = texto2 + txt_pantalla.charAt(i);
                    }
                }
            }
        }else{
            texto2 = "0.";
        }
        return texto2;
    }
    public String cero(){
        int b = 0;
        if(txt_pantalla.length() > 1){
            if(txt_pantalla.charAt(0) == '0' && txt_pantalla.charAt(1) != '.')
                for (int i = 0; i < txt_pantalla.length(); i++){
                    if(txt_pantalla.charAt(i) == '0' && txt_pantalla.charAt(1) != '.'){
                        b = b + 1;
                    }
                }
        }
        if(b != 0){
            txt_pantalla = "0";
        }
        
        return txt_pantalla;
    }
    
}
