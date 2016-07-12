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
    
    String toString();
}