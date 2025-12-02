import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * Method yang digunakan untuk memberikan initial value
     */
    static GreenfootSound bg = new GreenfootSound("bg0.wav");
    static Counter score = new Counter("Score: ");
    static Counter hp = new Counter("HP: ");
    static Counter A = new Counter("A: ");
    static Counter A1 = new Counter("A1: ");
    static Counter A2 = new Counter("A2: ");
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(400, 600, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        for(int i= 1;i<=10;i++)
        {
            addObject(new Alien(),Greenfoot.getRandomNumber(getWidth()),0);
        }
        /*for(int i=1;i<=5;i++)
        {
        addObject(new Alien1(),Greenfoot.getRandomNumber(getWidth()),0);
        }
        for(int i=1;i<=5;i++)
        {
        addObject(new Alien2(),Greenfoot.getRandomNumber(getWidth()),0);
        }
        /*Alien alien = new Alien(); //membuat object dari class Alien
        addObject(alien,60,30); //memposisikan object di koordinat pada screen / canvas
        Alien alien2 = new Alien();
        addObject(alien2,159,80);
        Alien alien3 = new Alien();
        addObject(alien3,243,23);
        Alien alien4 = new Alien();
        addObject(alien4,333,74);
        Alien alien5 = new Alien();
        addObject(alien5,63,106);
        Alien1 alien1 = new Alien1();
        addObject(alien1,141,32);
        Alien1 alien12 = new Alien1();
        addObject(alien12,243,97);
        Alien2 alien22 = new Alien2();
        addObject(alien22,240,157);
        Alien2 alien23 = new Alien2();
        addObject(alien23,108,126);
        Alien2 alien24 = new Alien2();
        addObject(alien24,303,32);
        Hero hero = new Hero();
        addObject(hero,186,547);
        Alien alien6 = new Alien();
        addObject(alien6,304,112);
        Alien alien7 = new Alien();
        addObject(alien7,186,59);*/
        Hero hero = new Hero();
        addObject(hero,184,518);

        addObject(score,63,26);
        score.setValue(0);

        addObject(hp,345,24);
        hp.setValue(5);

        addObject(A,63,100);
        A.setValue(0);

        addObject(A1,63,150);
        A1.setValue(0);

        addObject(A2,63,200);
        A2.setValue(0);

        Alien1 alien1 = new Alien1();
        addObject(alien1,114,55);
        Alien1 alien12 = new Alien1();
        addObject(alien12,274,61);
        Alien1 alien13 = new Alien1();
        addObject(alien13,209,41);
        Alien1 alien14 = new Alien1();
        addObject(alien14,334,82);
        Alien1 alien15 = new Alien1();
        addObject(alien15,38,68);
        Alien2 alien22 = new Alien2();
        addObject(alien22,161,107);
        Alien2 alien23 = new Alien2();
        addObject(alien23,330,114);
        Alien2 alien24 = new Alien2();
        addObject(alien24,242,151);
        Alien2 alien25 = new Alien2();
        addObject(alien25,125,93);
        Alien2 alien26 = new Alien2();
        addObject(alien26,75,123);
        Alien2 alien27 = new Alien2();
        addObject(alien27,246,103);
    }

    public void started()
    {
        bg.playLoop();
    }
}
