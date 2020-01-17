import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Loaf here.
 * 
 * @author Rikard Karlsson 
 * @version 20-01-10
 */
public class Loaf extends Actor
{
    public Loaf()
    {
        int scale = 4;
        int width = getImage().getWidth()  / scale;
        int height = getImage().getHeight() / scale;
        getImage().scale(width, height);
        int angle = Greenfoot.getRandomNumber(360);
        setRotation(angle);
    }
}
