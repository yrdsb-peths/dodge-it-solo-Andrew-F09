import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Description: The player's character, purpose is to not touch the moving
 monster, if it happens, the game will end and player will be teleported to
 spawn.
 
 * @author: Andrew Fok
 * @Version:Final 
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
       // Hero will move places after being clicked
       if(Greenfoot.mouseClicked(null)){
          atTop =!atTop;
        }
        if(atTop)
        {
            setLocation(300,300);
        } else 
        {
            setLocation(300, 100);

        }
        
        //hero will be sent to spawn and the monster will dissapear, game over
        if(isTouching(Monster.class))
        {
            removeTouching(Monster.class);
            setLocation(300, 300); 
        }
    }
}
