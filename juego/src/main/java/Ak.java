
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
        return "Ak{" + "\n tipo=" + tipo + ", \n cargador=" + cargador + ",\n precision=" + precision + ",\n velocidad=" + velocidad + ",\n precio=" + precio + "\n danio=" + danio + '}';
    }

   

    
    
}
