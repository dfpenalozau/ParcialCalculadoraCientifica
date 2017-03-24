package calculadoracientifica;

import static java.lang.Math.cos;
import static java.lang.Math.sin;
import static java.lang.Math.tan;

public class Calculador {

    public float Numero1;
    public float Numero2;
    public float Numero3;
    public float Resultado;
    
    public float Sumar(){
        
        Resultado=Numero1+Numero2;
        return Resultado;
    
    }
    
    public float Restar(){
        
        Resultado=Numero1-Numero2;
        return Resultado;
    
    }
    public float Multiplicar(){
        
        Resultado=Numero1*Numero2;
        return Resultado;
    
    }
    
       public float Dividir(){
        
        Resultado=Numero1/Numero2;
        return Resultado;
    
    }
       
    public float Seno(){
        return (float) (sin(Numero3* Math.PI/180.0));
    }
    
    public float Coseno(){
        return (float) (cos(Numero3* Math.PI/180.0));
    }
    
    public float Tangente(){
        return (float) (tan(Numero3* Math.PI/180.0));
    }
    
    public float Cotangente(){
        return (float) (1/tan(Numero3* Math.PI/180.0));
    }
    
    public float Secante(){
        return (float) (1/cos(Numero3* Math.PI/180.0));
    }
    
    public float Cosecante(){
        return (float) (1/sen(Numero3* Math.PI/180.0));
    }

    private int sen(double d) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
       
    
}

       



   
