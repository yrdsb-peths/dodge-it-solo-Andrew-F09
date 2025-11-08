import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
<<<<<<< Updated upstream
 * Write a description of class monster here.
=======
 * Write a description of class Monster here.
>>>>>>> Stashed changes
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Monster extends Actor
{
    /**

     * Act - do whatever the monster wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
   
        // Add your action code here.

    boolean atTop = true;
    public void act()
    {
        // Add your action code here.
        if(Greenfoot.mouseClicked(null)){
          atTop =!atTop;
       }
       
       if(atTop){
           setLocation(67, 41);
        } else {
            setLocation(350,250);
        }

    }
}
