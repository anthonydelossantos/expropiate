
import java.util.*;

public class Quoridor
{
     public static void main (String [] beans)
     {
          Scanner in = new Scanner(System.in);
          String entrada = new String();
          boolean isGameOver = false;
          Jugador[] jugadores = new Jugador[2];
     
         
          
          //establece los dos jugadores , sus posiciones iniciales (x_pos, y_pos), el numero identificador (nb) y su nombre (nm)
          Jugador jugador1 = new Jugador(4, 8, 1, "JUGADOR 1");
          Jugador jugador2 = new Jugador(4, 0, 2, "JUGADOR 2");
          jugadores[0] = jugador1;
          jugadores[1] = jugador2;
          int contador = 0;
          boolean moviste=true;
          Jugador jugadorActual = new Jugador();
          MesadeJuego MESA = new MesadeJuego(jugador1, jugador2);        
         
          while(!isGameOver)
                { 
                  
                    System.out.println("\t\t"+MESA);
                    jugadorActual = jugadores[contador];
                    System.out.println("\t\tARRIBA - ABAJO - IZQ - DERECH");
                    System.out.print("$>");
                    entrada = in.nextLine();
                    
                    moviste = jugadorActual.movePiece(entrada);
                        
                    while (!moviste ) {
                         System.out.println("\tNO HAS MOVIDO NINGUNA PIEZA");
                         System.out.println("\tARRIBA - ABAJO - IZQ - DERECH");
                         System.out.print("$>");
                         entrada = in.nextLine();
                         moviste = jugadorActual.movePiece(entrada);
                              
                     }

                         
                    MESA.reDraw(jugador1, jugador2);
                         
                     if (jugadores[contador].n == 1) {
                              contador++;

                              
                    }              
                    else {
                              contador--;
                         
                    }
                         
                         
                         
                    
                    
                    
                   
          } 
          in.close();
    } 
                    
          
}//end Quoridor class
