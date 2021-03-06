/**
 * @author Carlo David Sanchinelli, Juan Pablo Zea, Luis Najera
 * @version 13.07.16
 */
public class Radio implements iRadio{
    private boolean state;
    private String frequency;
    private double station;
    private double[] botonam;
    private double[] botonfm;

    public Radio(boolean state) {
        this.state = state;
        frequency = "fm";
        station = 87.9;
        botonam = new double[] {530,530,530,530,530,530,530,530,530,530,530,530};
        botonfm = new double[] {87.9,87.9,87.9,87.9,87.9,87.9,87.9,87.9,87.9,87.9,87.9,87.9};
    }
//------------------------------------------------------------------------------
    
    public void OnOff(){
        state = !state;
    }

    
    public boolean isOn(){
        return state;
    }

    
    public String getFrequency(){
        return frequency;
    }

    
    public void setFrequency(String frequency){
        this.frequency = frequency;
    }

    
    public String getStation(){
        String station2 = String.valueOf(station);
        return station2;
    }

    
    public void setStation(int position){
        position = position - 1;
        if(frequency.equals("am")){
            station = botonam[position];
        }
        if(frequency.equals("fm")){
            station = botonfm[position];
        }
        getStation();
    }

    
    public void Forward(){
        if(frequency.equals("am") && station<=1610){
            if(station==1610){
                station = 520;
            }
            station = station + 10;
        }
        if(frequency.equals("fm") && station<=107.9){
            if(station==107.9){
                station = 87.7;
            }
            station = station + 0.2;
            station = Math.round(station *100.0) / 100.0;
        }
    }

    
    public void Backward(){
        if(frequency.equals("am") && station>=530){
            if(station==530){
                station = 1620;
            }
            station = station - 10;
        }
        if(frequency.equals("fm") && station>=87.9){
            if(station==87.9){
                station = 108.1;
            }
            station = station - 0.2;
            station = Math.round(station *100.0) / 100.0;
        }
    }

    
    public void setMemory(int position){
        position = position - 1;
        if(frequency.equals("am")){
            botonam[position] = station;
        }
        if(frequency.equals("fm")){
            botonfm[position] = station;
        }
    }

    
    public String toString(){ 
        String texto = "\nESTADO: \nFrecuencia:" + frequency + "\nEstacion:" + station + "\n";
        return texto;
    }
}
