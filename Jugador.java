public class Jugador
{
     public int x, y, n;
     public String nombre;
     
     public Jugador()
     {
          x = 0;
          y = 0;
          n = 1;
          nombre = new String("JUGADOR " + Integer.toString(n));
     }
     
     public Jugador(int x_pos, int y_pos)
     {
          x = x_pos;
          y = y_pos;
          n = 1;
          nombre = new String("JUGADOR " + Integer.toString(n));
     }
     
     public Jugador(int x_pos, int y_pos, int nb)
     {
          x = x_pos;
          y = y_pos;
          n = nb;
          nombre = new String("JUGADOR " + Integer.toString(n));
     }
     
     public Jugador(int x_pos, int y_pos, int nb, String nm)
     {
          x = x_pos;
          y = y_pos;
          n = nb;
          nombre = nm;
     }
     
     public boolean movePiece(String dir)
     {
          boolean movido = true;
          
          if(dir.equalsIgnoreCase("ARRIBA"))
          {
               y--;
               if (y < 0)
               {
                    y++;
                    movido = false;
               }
          }
          else if(dir.equalsIgnoreCase("ABAJO"))
          {
               y++;
               if (y > 8)
               {
                    y--;
                    movido = false;
               }
          }
          else if(dir.equalsIgnoreCase("IZQ"))
          {
               x--;
               if (x < 0)
               {
                    x++;
                    movido = false;
               }
          }
          else if(dir.equalsIgnoreCase("DERECH"))
          {
               x++;
               if (x > 8)
               {
                    x--;
                    movido = false;
               }
          }
          else
               movido = false;
          
          return movido;
     }
     
     public int getX()
     {
          return x;
     }
     
     public int getY()
     {
          return y;
     }
     
     public void setX(int newX)
     {
          x = newX;
     }
     
     public void setY(int newY)
     {
          y = newY;
     }
     
     
     public String toString()
     {
          return nombre;
     }
     
}
