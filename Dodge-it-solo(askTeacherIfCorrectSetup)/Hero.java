import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class hero here.
 * 
 * Andrew (your name) 
 * 0.0.1 (a version number or a date)
 */
public class Hero extends Actor
{
    /**
     * Act - do whatever the hero wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    boolean atTop = true;
    public void act()
    {
       //Add your action code here.
       if(Greenfoot.mouseClicked(null)){
          atTop =!atTop;
        }
        if(atTop == true)
        {
          setLocation(350,250);
        } else {
            setLocation(67,41);

        }
    }
        
    
}
