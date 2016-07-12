/**
 * @author Carlo David Sanchinelli
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
        botonam = new int[] {530,530,530,530,530,530,530,530,530,530,530,530};
        botonfm = new double[] {87.9,87.9,87.9,87.9,87.9,87.9,87.9,87.9,87.9,87.9,87.9,87.9};
    }
//------------------------------------------------------------------------------
    @Override
    public void On(){
        state = true;
    }

    @Override
    public void Off(){
        state = false;
    }

    @Override
    public boolean isOn(){
        return state;
    }

    @Override
    public String getFrequency(){
        return frequency;
    }

    @Override
    public void setFrequency(String frequency){
        this.frequency = frequency;
    }

    @Override
    public String getStation(){
        String station2 = String.valueOf(station);
        return station2;
    }

    @Override
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

    @Override
    public void Forward(){
        if(frequency.equals("am") && station<1610){
            if(station==1610){
                station = 520;
            }
            station = station + 10;
        }
        if(frequency.equals("fm") && station<107.9){
            if(station==107.9){
                station = 87.7;
            }
            station = station + 0.2;
        }
    }

    @Override
    public void Backward(){
        if(frequency.equals("am") && station>530){
            if(station==530){
                station = 1620;
            }
            station = station - 10;
        }
        if(frequency.equals("fm") && station>87.9){
            if(station==87.9){
                station = 108.1;
            }
            station = station - 0.2;
        }
    }

    @Override
    public void setMemory(int position){
        position = position - 1;
        if(frequency.equals("am")){
            botonam[position] = station;
        }
        if(frequency.equals("fm")){
            botonfm[position] = station;
        }
    }

    @Override
    public String toString(){
        return "Radio{" + "state=" + state + ", frequency=" + frequency + ", station=" + station + '}';
    }
}
