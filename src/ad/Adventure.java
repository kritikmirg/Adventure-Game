package ad;
public class Adventure
{
    private String q1, q2, q3, q4, message1, message2,  message3, message4;
    private int a1, a2, a3, a4;
    

    public String Q1()
    {
        q1 = ("You've made it!"
              +"\nAfter years of research and finding clues"
              +"\nyou have found the Cave of Wonder deep in the Amazon."
              +"\nFinally you have a chance to find the Royal Gem"
              +"\nand restore your family's name. "
              +"\nYou will be faced with a number of challenges up ahead. "
            
              +"\n"
              +"\nYou need to choose all the right step, your family is counting on it. "
              +"\n\nThree doors appear in front of you..."
              +"\nYou must decide"
              +"\n\n1) Left"
              +"\n\n2) Middle"
              +"\n\n3) Right");
        return q1;
    }
    public void setA1(int a)
    {
        a1 = a;
        
    }
    public String Message1()
    {
        switch(a1)
        {
            case 1:
               message1 = ("You chose the left door."
                           +"\nDEAD END."
                           +"\nBefore you are able to exit the door shuts and"
                           +"\nyou are trapped with no way to escape."
                         
                           +"\n\n\t\tGAME OVER");
            break;
             case 2:
                message1 = ("");
            break;
            case 3:
               message1 = ("You chose the right door."
                           +"\nThe door shuts behind you and the room"
                           +"\nstarts to fill up with water. You see an opening above. "
                           +"\nUnfortunately, you don't know how to swim."
                           
                           +"\n\n\t\tGAME OVER");
            break;
            default:
               message1 = ("You have entered an invalid response");
            break;
            
            
        }
        return message1; 
    }
    public String Q2()
    {
            q2 = ("You chose correctly. The middle door has brought you to a hall way."
                 +"\nYou see something running towards. What could it be?"
                 +"\nIt's the skeleton guards who are sworn to protect the gem."
                 
                 +"\nYou go..."
                 +"\n\n1) Turn Around"
                 +"\n\n2) Hide Behind a Rock"
                 +"\n\n3) Charge and Attack");
        
        
        return q2;
        
    }
    public void setA2(int a)
    {
        a2 = a;
        
    }
    public String Message2()
    {
        switch(a2)
        {
            case 1:
               message2 = ("You worked so hard, made it all this way, only to "
                         +"\nbe turned away by a few skeletons?"
                         +"\nMaybe next time... "
                       
                         +"\n\n\t\tGAME OVER");
            break;
            case 2:
                message2 = ("");
            break;
            case 3:
               message2 = ("Don't be a hero. "
                        +"\nYou are clearly outnumbered and have no way of fighting"
                        +"\nthe skeletons. "
                     
                        +"\n\n\t\tGAME OVER");
            break;
            default:
               message2 = ("You have entered an invalid response");
            break;
            
            
        }
        return message2; 
    }
    public String Q3()
    {
        
            q3 = ("Hiding worked!"
                + "\nTurns out the skeletons were just trying to leave. "
                + "\nThe've been trapped in the cave for so long, you finally "
                + "\ngave them a way out. They ran right passed you. "
                + "\nYou walk to the end of the hall only to come to a river. "
                + "\nYou decide too..."
                + "\n\n1) Swim Across the River"
                + "\n\n2) Build a Raft"
                + "\n\n3) Look for Another Way Out");
        
        
        return q3;
        
    }
    public void setA3(int a)
    {
        a3 = a;
        
    }
    public String Message3()
    {
        switch(a3)
        {
            case 1:
               message3 = ("Did you forget that you can't swim?"
                    
                         +"\n\n\t\tGAME OVER");
            break;
            case 2:
                message3 = ("Unfortunately, you are an archeologist not an engineer. "
                         +"\nWater quickly over flows your raft and you "
                         +"\nsink right to the bottom."
                          +"\n\n\t\tGAME OVER");
            break;
            case 3:
               message3 = ("");
            break;
            
            default:
               message3 = ("You have entered an invalid response");
            break;
            
            
        }
        return message3; 
    }
    public String Q4()
    {
        
            q4 = ("Congratulations, you look around a find a lever that closes off the river."
                +"\nYou are able able to simply walk across now. "
                +"\nBut wait... Do you hear that?"
                +"\nThe cave is booby trapped!"
                +"\nFinally you decide to..."
                +"\n\n1) Out run all the traps"
                +"\n\n2) Dodge all of them, parkour style."
                +"\n\n1) Try to find a way to turn them off.");
        
        
        return q4;
        
    }
    public void setA4(int a)
    {
        a4 = a;
        
    }
    public String Message4()
    {
        switch(a4)
        {
            case 1:
               message4 = ("Thankfully you were on the track team in college because you were able to "
                        +"\nout run all the traps. You enter a shiny room. Jewels everywhere."
            		   +"\nBut, you are only concered about one..."
            		
                        + "\n\n\t\tCongratulations, you have found the Royal Gem.");
            break;
            case 2:
                message4 = ("You were able to duck under the spikes."
                         +"\nYou're an animal lover so the alligators didn't scare you."
                         +"\nBut the boulder..."
                         +"\\nYou didn't see it coming"
                         
                          +"\n\n\t\tGAME OVER");
            break;
            case 3:
               message4 = ("You found a switch."
                          +"\nThe switch turned off the lamps and you couldn't see."
                  
                           +"\n\n\t\tGAME OVER");
            break;
            default:
               message4 = ("You entered an invalid option");
            break;
            
            
        }
        return message4 ; 
    }
    }



