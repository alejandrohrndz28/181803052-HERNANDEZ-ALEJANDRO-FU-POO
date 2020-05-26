
public class Ak {    
    String tipo;
    int cargador=0;
    int precision;
    double velocidad;
    double precio;
    int danio;
    
    
    public void disparar(){
    System.out.println("te estoy haciendo un danio de"+danio);}
    public void apuntar(){}
    public void cargar(){}

    @Override
    public String toString() {
        return "Ak{" + "tipo=" + tipo + ", cargador=" + cargador + ", precision=" + precision + ", velocidad=" + velocidad + ", precio=" + precio + ", danio=" + danio + '}';
    }

   

    
    
}
