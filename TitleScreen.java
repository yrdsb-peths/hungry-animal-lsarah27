import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Title Screen.
 * 
 * @author Lynn Sarah 
 * @version May 2022
 */
public class TitleScreen extends World
{
    Label titleLabel = new Label("Hungry Butterfly", 70);

    /**
     * Constructor for objects of class TitleScreen.
     * 
     */
    public TitleScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 

        addObject(titleLabel, getWidth()/2, 200);
        prepare();
    }

    public void act()
    {
        if(Greenfoot.isKeyDown("space"))
        {
            MyWorld gameWorld = new MyWorld();
            Greenfoot.setWorld(gameWorld);
        }

    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Butterfly butterfly = new Butterfly();
        addObject(butterfly,417,96);
        Label label = new Label("Press <space> to Start", 40);
        addObject(label,266,272);
        label.setLocation(303,262);
    }
}
