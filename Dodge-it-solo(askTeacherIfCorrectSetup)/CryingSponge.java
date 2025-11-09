import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
* Description: taunt symbol to induce rage in the player.
 * 
 * @author Andrew Fok
 * @Version : Final
 */
public class CryingSponge extends Actor
{
    /**
     * Act - do whatever the crying wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    // adds movment for variety and extra rage iducement.
    public void act()
    {
        // Add your action code here.
        move(-3);
    }
    
    //scales to needed size
    public CryingSponge()
    {
        GreenfootImage img = getImage();
        img.scale(150, 150);
        setImage(img);
    }
}
