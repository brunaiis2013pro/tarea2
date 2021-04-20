
public class Matematico
{
    public Triple calcularNumeroMayorMenorMedio(double a,double b, double c){
        Triple respuesta = new Triple(0,0,0);
        
        if(a>b && b>c){
            respuesta.setMayor(a);
            respuesta.setMedio(b);
            respuesta.setMenor(c);
           
        }
        
        else if(a>c && c>b){
            respuesta.setMayor(a);
            respuesta.setMedio(c);
            respuesta.setMenor(b);
        }
        
        else if(b>a && a>c){
            respuesta.setMayor(b);
            respuesta.setMedio(a);
            respuesta.setMenor(c);
        }
        else if(b>c && c>a){
            respuesta.setMayor(b);
            respuesta.setMedio(c);
            respuesta.setMenor(a);
            
        }
        else if(c>a && a>b){
            respuesta.setMayor(c);
            respuesta.setMedio(a);
            respuesta.setMenor(b);
        }
        else if(c>b && b>a){
            respuesta.setMayor(c);
            respuesta.setMedio(b);
           respuesta.setMenor(a);
        }
        else if(a==b && b==c){
            respuesta.setMayor(a);
            respuesta.setMedio(b);
            respuesta.setMenor(c);
        }
        else if(a==b && b<c){
            respuesta.setMayor(c);
            respuesta.setMedio(b);
            respuesta.setMenor(a);
        }
        else if(a>b && b==c){
            respuesta.setMayor(a);
            respuesta.setMedio(b);
            respuesta.setMenor(c);
        }
        else if(a>b && a==c){
            respuesta.setMayor(a);
            respuesta.setMedio(c);
            respuesta.setMenor(b);
        }
        
        return respuesta;
    }
    
    public double calcularAreaCuadrado(double base, double altura){
        return base*altura;
    }
    
    public double calcularDistanciaPuntos(Punto punto1,Punto punto2){
        double distancia;
        
        distancia = Math.sqrt(Math.pow((punto2.getX()-punto1.getX()),2) + Math.pow((punto2.getY()-punto1.getY()),2));
       
        return distancia;
    }
    
    public String calcularCuadranteDeUnPunto(Punto punto){
        String res;
        if(punto.getX()>0 && punto.getY()>0){
            res = "Se encuentra en el 1° Cuadrante";
        }
        else if(punto.getX()<0 && punto.getY()>0){
            res = "Se encuentra en el 2° Cuadrante";
        }
        else if(punto.getX()<0 && punto.getY()<0){
            res = "Se encuentra en el 3° Cuadrante";
        }
        else if(punto.getX()>0 && punto.getY()<0){
            res = "Se encuentra en el 4° Cuadrante";
        }
        else{
            res = "Se encuentra en el punto de Origen 0";
        }
        return res;
    }

   
    
}
