import java.util.Scanner;
/**
 * @author Carlo David Sanchinelli, Juan Pablo Zea, Luis Najera
 * @version 13.07.16
 */
public class HDT1{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Radio radio = new Radio(false);
        boolean run = true;
        
        System.out.println("BIENVENIDOS A LA SUPER RADIO UVG");
	System.out.println("Ingrese ON para encender y OFF para apagar la radio.");
        while (run==true){     
            while (radio.isOn() == true){
                String toString = radio.toString();
                System.out.println(toString);
                System.out.println("Ingrese un comando:");
                String comando = teclado.nextLine();
                if(comando.equals("OFF")){
                    radio.OnOff();
                }
                if(comando.equals("am")){
                    radio.setFrequency("am");
                    radio.setStation(1); 
                }
                if(comando.equals("fm")){
                    radio.setFrequency("fm");
                    radio.setStation(1);
                }
                if(comando.equals("1")){
                    int position = Integer.parseInt(comando);
                    radio.setStation(position);
                }
                if(comando.equals("2")){
                    int position = Integer.parseInt(comando);
                    radio.setStation(position);
                }
                if(comando.equals("3")){
                    int position = Integer.parseInt(comando);
                    radio.setStation(position);
                }
                if(comando.equals("4")){
                    int position = Integer.parseInt(comando);
                    radio.setStation(position);
                }
                if(comando.equals("5")){
                    int position = Integer.parseInt(comando);
                    radio.setStation(position);
                }
                if(comando.equals("6")){
                    int position = Integer.parseInt(comando);
                    radio.setStation(position);
                }
                if(comando.equals("7")){
                    int position = Integer.parseInt(comando);
                    radio.setStation(position);
                }
                if(comando.equals("8")){
                    int position = Integer.parseInt(comando);
                    radio.setStation(position);
                }
                if(comando.equals("9")){
                    int position = Integer.parseInt(comando);
                    radio.setStation(position);
                }
                if(comando.equals("10")){
                    int position = Integer.parseInt(comando);
                    radio.setStation(position);
                }
                if(comando.equals("11")){
                    int position = Integer.parseInt(comando);
                    radio.setStation(position);
                }
                if(comando.equals("12")){
                    int position = Integer.parseInt(comando);
                    radio.setStation(position);
                }
                if(comando.equals("f")){
                    radio.Forward();
                }
                if(comando.equals("b")){
                    radio.Backward();
                }
                if(comando.equals("store 1")){
                    radio.setMemory(1);
                }
                if(comando.equals("store 2")){
                    radio.setMemory(2);
                }
                if(comando.equals("store 3")){
                    radio.setMemory(3);
                }
                if(comando.equals("store 4")){
                    radio.setMemory(4);
                }
                if(comando.equals("store 5")){
                    radio.setMemory(5);
                }
                if(comando.equals("store 6")){
                    radio.setMemory(6);
                }
                if(comando.equals("store 7")){
                    radio.setMemory(7);
                }
                if(comando.equals("store 8")){
                    radio.setMemory(8);
                }
                if(comando.equals("store 9")){
                    radio.setMemory(9);
                }
                if(comando.equals("store 10")){
                    radio.setMemory(10);
                }
                if(comando.equals("store 11")){
                    radio.setMemory(11);
                }
                if(comando.equals("store 12")){
                    radio.setMemory(12);
                }
                
            }
            while (radio.isOn() == false){
                System.out.println("ESTADO: La radio esta APAGADA.\n");
                System.out.println("Ingrese un comando:");
                String comando2 = teclado.nextLine();
                if(comando2.equals("ON")){
                    radio.OnOff();
                    System.out.println("ESTADO: La radio esta ENCENDIDA.\n");
                }
            }
        }
    }
}
