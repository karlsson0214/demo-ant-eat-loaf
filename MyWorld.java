import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author Rikard Karlsson 
 * @version 20-01-10
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
        super(400, 400, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Ant ant = new Ant();
        addObject(ant,155,163);
        Loaf loaf = new Loaf();
        addObject(loaf,255,65);
        Loaf loaf2 = new Loaf();
        addObject(loaf2,310,129);
        Loaf loaf3 = new Loaf();
        addObject(loaf3,62,63);
        Loaf loaf4 = new Loaf();
        addObject(loaf4,202,278);
        Loaf loaf5 = new Loaf();
        addObject(loaf5,68,223);
        Loaf loaf6 = new Loaf();
        addObject(loaf6,78,324);
        Loaf loaf7 = new Loaf();
        addObject(loaf7,319,349);
        Loaf loaf8 = new Loaf();
        addObject(loaf8,321,210);
        Loaf loaf9 = new Loaf();
        addObject(loaf9,154,226);
        Loaf loaf10 = new Loaf();
        addObject(loaf10,181,86);
        Loaf loaf11 = new Loaf();
        addObject(loaf11,360,40);
        Loaf loaf12 = new Loaf();
        addObject(loaf12,356,261);
        Loaf loaf13 = new Loaf();
        addObject(loaf13,135,371);
        Loaf loaf14 = new Loaf();
        addObject(loaf14,57,262);
    }
}
