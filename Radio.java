/**
 * @author Carlo David Sanchinelli, Juan Pablo Zea, Luis Najera
 * @version 13.07.16
 */
/**Se crea la clase de radio que implementara la clase principal "main" atribuyendole las funciones declaradas en esta clase*/
public class Radio implements iRadio{
    /**Se declaran los tipos que llevaran cada cariable*/
    private boolean state;
    private String frequency;
    private double station;
    private double[] botonAm;
    private double[] botonFm;
    /**Se declaran los valores predeterminados de la clase Radio, que posteriormente seran llamadas dentro de las funciones*/
    public Radio(boolean state) {
        this.state = state;
        frequency = "fm";
        station = 87.9;
        botonAm = new double[] {530,530,530,530,530,530,530,530,530,530,530,530};
        botonFm = new double[] {87.9,87.9,87.9,87.9,87.9,87.9,87.9,87.9,87.9,87.9,87.9,87.9};
    }
//------------------------------------------------------------------------------
    /**Se declaran los diferentes metodos, que retornaran si es algo o si es un void*/
    @Override
    public void OnOff(){
        state = !state;
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
    /**Se declaran ciclos para dar opcion de retorno o salida*/
    @Override
    public void setStation(int position){
        position = position - 1;
        if(frequency.equals("am")){
            station = botonAm[position];
        }
        if(frequency.equals("fm")){
            station = botonFm[position];
        }
        getStation();
    }
    /**Se declara la programación defensiva, no permitiendole al usuario pasarse del parametro a la hora de cambiar de estación deacuerdo a lo predeterminado*/
    @Override
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

    @Override
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

    @Override
    public void setMemory(int position){
        position = position - 1;
        if(frequency.equals("am")){
            botonAm[position] = station;
        }
        if(frequency.equals("fm")){
            botonFm[position] = station;
        }
    }
