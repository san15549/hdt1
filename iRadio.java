
public interface iRadio{ 

	
    void On ();
	
    void Off ();
       
    void isOn ();

    String getFrecuency ();
	
    void setFrecuency (String frecuency);
	
    String getStation ();
	
    void setStation (String station);
	
    void Foward ();
	
    void Backward ();
	
    void setMemory (String station, int position, String frecuency);
    
    String toString ();
	
}