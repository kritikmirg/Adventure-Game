package ad;

import java.util.Scanner;
public class AdventureSC
{
    public static void main(String[]args)
    {
        Adventure quest = new Adventure();
        Scanner keyboard = new Scanner(System.in);
        
        int a1, a2, a3,a4;
        
        System.out.println("======================="
                        +"\n APOCALYPTIC ADVENTURE"
                        +"\n    BK"
                        +"\n=======================");
                        
        System.out.print("\n"+ quest.Q1());
        a1 = keyboard.nextInt();
        
        quest.setA1(a1);
        
        if (a1 == 2)
        {
             System.out.print("\f");
             System.out.print(quest.Q2());
             
             a2 = keyboard.nextInt();
             quest.setA2(a2);
             if (a2 == 2)
             {
                  System.out.print("\f");
                  System.out.print(quest.Q3());
             
                  a3 = keyboard.nextInt();
                  quest.setA3(a3);
                if (a3 == 3)
                {
                      System.out.print("\f");
                      System.out.print(quest.Q4());
             
                    a4 = keyboard.nextInt();
                    quest.setA4(a4);
                    
                     System.out.print("\f");
                    System.out.println(quest.Message4());
                }
                else
                {
                    System.out.print("\f");
                    System.out.println(quest.Message3());
               
                }
                }
             else
             {
                  System.out.print("\f");
                  System.out.println(quest.Message2());
               
                } 
        }
        else
        {
            System.out.print("\f");
            System.out.println(quest.Message1());
            
        }
        
        
        
    }
}


