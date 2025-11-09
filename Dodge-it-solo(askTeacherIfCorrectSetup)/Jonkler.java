import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Description: taunt symbol to induce rage in the player.
 * 
 * @author Andrew Fok
 * @Version : Final
 */
public class Jonkler extends Actor
{
    /**
     * Act - do whatever the jonkler wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        
    }
    
    //scales to needed size
    public Jonkler()
    {
        GreenfootImage img = getImage();
        img.scale(300, 100);
        setImage(img);
    }
    
    
}
