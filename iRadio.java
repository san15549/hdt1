/**
 * @author Carlo David Sanchinelli, Juan Pablo Zea, Luis Najera
 * @version 13.07.16
 */
public interface iRadio{ 
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
