import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ant here.
 * 
 * @author Rikard Karlsson 
 * @version 20-01-10
 */
public class Ant extends Actor
{
    private int score = 0;

    public void act() 
    {
        checkKeyboard();
        tryEat();
    } 
    private void checkKeyboard()
    {
        if (Greenfoot.isKeyDown("left"))
        {
            turn(-5);
        }
        else if (Greenfoot.isKeyDown("right"))
        {
            turn(5);
        }
        if (Greenfoot.isKeyDown("up"))
        {
            move(4);
        }
    }
    private void tryEat()
    {
        if (isTouching(Loaf.class))
        {
            removeTouching(Loaf.class);
            score = score + 1;
            getWorld().showText("score: " + score, 100, 30);
        }
    }
}
