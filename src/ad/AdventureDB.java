package ad;

import javax.swing.JOptionPane;
public class AdventureDB
{
    public static void main(String[]args)
    {
        Adventure quest = new Adventure();

        
        int a1, a2, a3,a4;
        

        a1 = Integer.parseInt(JOptionPane.showInputDialog(null, quest.Q1(), "Cave of Wonder", 3));
        quest.setA1(a1);
        
        if (a1 == 2)
        {
              a2 = Integer.parseInt(JOptionPane.showInputDialog(null, quest.Q2(), "Cave of Wonder", 3));
              
             quest.setA2(a2);
             if (a2 == 2)
             {
                  a3 = Integer.parseInt(JOptionPane.showInputDialog(null, quest.Q3(), "Cave of Wonder", 3));
             
                  quest.setA3(a3);
                if (a3 == 3)
                {
                     a4 = Integer.parseInt(JOptionPane.showInputDialog(null, quest.Q4(), "Cave of Wonder", 3));
                       quest.setA4(a4);
                       JOptionPane.showMessageDialog(null, quest.Message4(), "Cave of Wonder", 3);
                }
                else
                {
                    JOptionPane.showMessageDialog(null, quest.Message3(), "Cave of Wonder", 3);
               
                }
                }
             else
             {
                  JOptionPane.showMessageDialog(null, quest.Message2(), "Cave of Wonder", 3);
                } 
        }
        else
        {
             JOptionPane.showMessageDialog(null, quest.Message1(), "Cave of Wonder", 3);
            
        }

        
        System.exit(0);
    }
}




