import javax.swing.*;


public class MesadeJuego extends JComponent
{     
     private String board;
     
     public MesadeJuego(Jugador p1, Jugador p2)
     {          
          board = new String();
          
          for(int i = 0; i < 9; i++)
          {               
               board += "\t\t"+i+"|";
               
               for(int j = 0; j < 9; j++)
               {
                    if(p1.getX() == j && p1.getY() == i)
                    {
                         board += "A|";
                    }
                    else if(p2.getX() == j && p2.getY() == i)
                    {
                         board += "B|";
                    }
                    else
                         board += "_|";
               }//end for    
               
               board += "\t\t\t\t\n";
               
          }//end for 
     }     
     
     public String reDraw(Jugador p1, Jugador p2)
     {
          board = new String();
          
          for(int i = 0; i < 9; i++)
          {               
               board += "\t\t"+i+"|";
               
               for(int j = 0; j < 9; j++)
               {
                    if(p1.getX() == j && p1.getY() == i)
                    {
                         board += "A|";
                    }
                    else if(p2.getX() == j && p2.getY() == i)
                    {
                         board += "B|";
                    }
                    else
                         board += "_|";
               }//end for    
               
               board += "\t\t\t\t\n";
               
          }//end for 
          
          return new String("   + + + + + + + + \n" + board);
     }
     
     public String toString()
     {
          return new String("   + + + + + + + + \n" + board);
     }
}//Board class
