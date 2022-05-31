import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The Butterfly, our hero.
 * 
 * @author Lynn 
 * @version May 2022
 */
public class Butterfly extends Actor
{
    GreenfootSound sound = new GreenfootSound("sounds/bark.mp3");

    /**
     * Act - do whatever the Butterfly wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */

    
    public void act() 
    {
        // Add your action code here.
        if(Greenfoot.isKeyDown("left"))
        {
            move(-2);
        }
        else if(Greenfoot.isKeyDown("right"))
        {
            move(2);
        }
        
        eat();
    }    
    
    public void eat()
    {
        if(isTouching(Strawberry.class))
        {
            sound.play();
            removeTouching(Strawberry.class);
            MyWorld world = (MyWorld) getWorld();
            world.createStrawberry();
            world.increaseScore();
        }
    }
}
