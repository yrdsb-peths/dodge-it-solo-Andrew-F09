import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Description: taunt symbol to induce rage in the player.
 * 
 * @author Andrew Fok
 * @Version : Final
 */
public class YouLose extends Actor
{
    /**
     * Act - do whatever the lose wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        
    }
    
    //scales to needed size
    public YouLose()
    {
        GreenfootImage img = getImage();
        img.scale(250, 150);
        setImage(img);
    }
}
