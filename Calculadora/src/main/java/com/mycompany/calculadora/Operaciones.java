package com.mycompany.calculadora;

public class Operaciones {
    String txt_pantalla;
    String lbl_numeroguardado;
    String lbl_guardado = "";
    double operador;
    Operaciones (String txt_pantalla, String lbl_numeroguardado){
        this.txt_pantalla = txt_pantalla;
        this.lbl_numeroguardado = lbl_numeroguardado;
    }
    public String suma(){
        if(lbl_numeroguardado.isBlank()){
            lbl_numeroguardado = "0";
        }
        if(txt_pantalla.isBlank()){
            txt_pantalla = "0";
        }
            for(int i = 0; i < lbl_numeroguardado.length(); i++){
                if(lbl_numeroguardado.charAt(0) != '-' && i > 1){
                    if (lbl_numeroguardado.charAt(i) != '+' && lbl_numeroguardado.charAt(i) != '-'){
                        lbl_guardado = lbl_guardado + lbl_numeroguardado.charAt(i);
                    }
                }else{
                    lbl_guardado = lbl_guardado + lbl_numeroguardado.charAt(0);
                }
            }
            operador = Double.parseDouble(lbl_guardado) + Double.parseDouble(txt_pantalla);
            lbl_guardado = String.valueOf(operador);
        return lbl_guardado;
    }
    public String resta(){
        int i = 0;
        if(lbl_numeroguardado.isBlank()){
            
            lbl_numeroguardado = String.valueOf(Integer.parseInt(txt_pantalla) + Integer.parseInt(txt_pantalla));
        }
        if(txt_pantalla.isBlank()){
            txt_pantalla = "0";
        }
            for(i = 0; i < lbl_numeroguardado.length(); i++){
                
                    if (lbl_numeroguardado.charAt(i) != '+' && lbl_numeroguardado.charAt(i) != '-'){
                        lbl_guardado = lbl_guardado + lbl_numeroguardado.charAt(i);
                    }
            }
            if(lbl_numeroguardado.charAt(0) != '-'){
                operador = Double.parseDouble(lbl_guardado) - Double.parseDouble(txt_pantalla);
            }else{
                operador = - Double.parseDouble(lbl_guardado) - Double.parseDouble(txt_pantalla);
            }
            lbl_guardado = String.valueOf(operador);
        return lbl_guardado;
    }
    public String multiplicacion(){
      
        return "";
    }
    public String division(){
      
        return "";
    }
    public String igual(){
      
        return "";
    }
    
    public String porcentaje(){
      
        return "";
    }
}
