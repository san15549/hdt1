/**
 * @place Universidad del Valle de Guatemala
 * @class Algoritmos y Estructuras de Datos
 * @author Carlo David Sanchinelli, Juan Pablo Zea, Luis Najera
 * @version 13.07.16
 */
/**Se crea la interfaz iRadio que nos permitira poder asociar cualquier otro trabajo de otro grupo con el nuestro*/
public interface iRadio{ 
    /**Se crean los parametros de salida y entrada de los métodos declarados en la clase Radio*/
    public void OnOff();
       
    public boolean isOn();

    public String getFrequency();
    
    public void setFrequency(String frequency);
    
    public String getStation();
    
    public void setStation(int position);
    
    public void Forward();
    
    public void Backward();
    
    public void setMemory(int position);
    
    public String toString();
}
