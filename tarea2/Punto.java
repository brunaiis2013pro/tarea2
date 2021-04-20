
public class Punto
{
   private double coordenadaX;
   private double coordenadaY;
   
   public Punto(double coordenadaX, double coordenadaY){
        this.coordenadaX = coordenadaX;
        this.coordenadaY = coordenadaY;
        
    }
    
   public void setX(double coordenadaX){
       this.coordenadaX = coordenadaX;
    }
    
   public void setY(double coordenadaY){
       this.coordenadaY= coordenadaY;
   }
    
   public double getX(){
        return coordenadaX;
    }
    
   public double getY(){
        return coordenadaY;
    }
    
}
