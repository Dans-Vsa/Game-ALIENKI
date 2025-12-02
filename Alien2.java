import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Alien2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Alien2 extends Actor
{
    /**
     * Act - do whatever the Alien wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setLocation(getX(), getY()+5);
        if(isAtEdge())
        {
            setLocation(Greenfoot.getRandomNumber(getWorld().getWidth()),0);
        }
        if(isTouching(Bullet.class))
        {
            //remove the bullet
            removeTouching(Bullet.class);
            //add the object of the alien
            getWorld().addObject(new Alien2(),Greenfoot.getRandomNumber(getWorld().getWidth()),0);
            //add blast
            getWorld().addObject(new Blast(),getX(),getY());
            Greenfoot.playSound("blast.wav");
            //add the score
            MyWorld.score.add(10);
            MyWorld.A2.add(1);
            //remove the object Alien
            getWorld().removeObject(this);
            
        }
        
    }
}
