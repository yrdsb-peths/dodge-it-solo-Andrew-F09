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


    public void act()
    {
        // Add your action code here.
        move(-8);
        
        if(getX() <= 0) {
            resetMonster();
        }
        
        if(isTouching(Hero.class)){
            //add gameover symbols
            YouLose youLose = new YouLose();
            getWorld().addObject(youLose, 300, 300);
            Jonkler jonkler = new Jonkler();
            getWorld().addObject(youLose, 100, 300);
            Crying crying = new Crying();
            getWorld().addObject(crying, 500, 300);
            getWorld().removeObject(this);
        }
    }
        public void resetMonster() {
            int num = Greenfoot.getRandomNumber(2);
            if(num == 0) {
                setLocation(600, 100);
            } else {
                setLocation(600, 300);
                }
            }
            
    public Monster()
    {
    GreenfootImage img = getImage();
    img.scale(70, 70);
    setImage(img);
    
    }
}
    

