
package pruebas;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class Tiempo {
    public static void main(String[]args){
        Timer nuevo = new Timer();
        TimerTask tarea ;
        tarea = new TimerTask( ){
        @Override
        public void run (){
        
            System.out.println("  Estoy lavando " + new Date ());
            nuevo.cancel();
        
        }
        };
        
        nuevo.schedule(tarea ,5000   ,10);
        System.out.println("acabó de lavar" + new Date ( ) ) ;
    
    }
}
