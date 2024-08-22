
package calculadora;

public class Operacion {
    public boolean activo;
    public char tipo;
    public double valor1;
    public double valor2;
    
    Operacion(boolean activo, char tipo, double valor1, double valor2){
        this.activo = activo;
        this.tipo = tipo;
        this.valor1 = valor1;
        this.valor2 = valor2;
    }
    
}
