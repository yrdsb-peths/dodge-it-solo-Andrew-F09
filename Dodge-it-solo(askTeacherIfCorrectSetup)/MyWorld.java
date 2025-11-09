import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @Andrew 
 * @0.0.1 (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        
        //created monster
        Hero hero1 = new Hero();
        addObject(hero1, 90, 67);
        
        // created monster
        Monster monster1 = new Monster();
        addObject(monster1, 67, 41);
        
        

    }
}
