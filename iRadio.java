/**
 * @author Carlo David Sanchinelli, Juan Pablo Zea, Luis Najera
 * @version 13.07.16
 */
public interface iRadio{ 
    void On();
	
    void Off();
       
    boolean isOn();

    String getFrequency();
	
    void setFrequency(String frequency);
	
    String getStation();
	
    void setStation(int position);
	
    void Forward();
	
    void Backward();
	
    void setMemory(int position);
}
