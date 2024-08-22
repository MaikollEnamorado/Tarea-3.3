package com.mycompany.calculadora;

public class Operaciones {
    String txt_pantalla;
    String lbl_numeroguardado;
    double operador;
    Operaciones (String txt_pantalla, String lbl_numeroguardado){
        this.txt_pantalla = txt_pantalla;
        this.lbl_numeroguardado = lbl_numeroguardado;
    }
    public String suma(){
        if(lbl_numeroguardado.isEmpty()){
            lbl_numeroguardado = txt_pantalla;
            return lbl_numeroguardado;
        }else{
            operador = Double.parseDouble(lbl_numeroguardado) + Double.parseDouble(txt_pantalla);
            
            txt_pantalla = String.valueOf(operador);
        }
        return txt_pantalla;
    }
    public String resta(){
      
        return "";
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
