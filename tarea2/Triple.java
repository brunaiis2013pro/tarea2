
public class Triple
{
    private double mayor;
    private double medio;
    private double menor;
    
    public Triple(double mayor, double medio, double menor){
        this.mayor = mayor;
        this.medio = medio;
        this.menor = menor;
    }
    
    public void setMayor(double mayor){
        this.mayor = mayor;
    }
    
    public void setMedio(double medio){
        this.medio = medio;
    }
    
    public void setMenor(double menor){
        this.menor = menor;
    }
    
    public double getMayor(){
        return mayor;
    }
    
     public double getMedio(){
        return medio;
    }
    
     public double getMenor(){
        return menor;
    }
    
}
