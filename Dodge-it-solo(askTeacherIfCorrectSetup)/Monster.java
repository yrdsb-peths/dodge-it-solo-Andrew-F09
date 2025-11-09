import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Description: Monster will move around left to right and jumping up and down, 
 Player must avoid it. if the player's character (hero) touches the monster, 
 the game is over and the hero will be teleported to starting point and 
 symbols for losing will appear to taunt the player.
 
 * @author: Andrew Fok
 * @version: final
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
        //Monster's movment speed is set here, adjusted for difficulty
        move(-8);
        
        if(getX() <= 0) {
            resetMonster();
        }
        
        //Releases the taunts after player loses
        if(isTouching(Hero.class)){
            //add gameover symbols
            YouLose youLose = new YouLose();
            getWorld().addObject(youLose, 300, 300);
            Jonkler jonkler = new Jonkler();
            getWorld().addObject(jonkler, 300, 200);
            CryingSponge cryingSponge = new CryingSponge();
            getWorld().addObject(cryingSponge, 500, 300);
            
        }
    }
        
        //makes sure monster will be move up and down.
        public void resetMonster() {
            int num = Greenfoot.getRandomNumber(2);
            if(num == 0) {
                setLocation(600, 100);
            } else {
                setLocation(600, 300);
                }
            }
            
    
        //scales monster to needed size
        public Monster(){
            GreenfootImage img = getImage();
            img.scale(70, 70);
            setImage(img);
    
        }   
}
    

