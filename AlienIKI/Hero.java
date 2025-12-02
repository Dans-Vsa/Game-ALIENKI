import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Hero here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hero extends Actor
{
    /**
     * Act - do whatever the Hero wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int delay=15;
    public void act()
    {
        // Add your action code here.
        move(5);
        shooting(15);
        if(isTouching(Alien.class))
        {
            MyWorld.hp.add(-1);
            removeTouching(Alien.class);
            if(MyWorld.hp.getValue()==0)
            {
                MyWorld.bg.stop();
                MyWorld.bg = new GreenfootSound("bg3.wav");
                MyWorld.bg.playLoop();
                getWorld().addObject(new GameOver(),getWorld().getWidth()/2,getWorld().getHeight()/2);
                getWorld().removeObject(this);
            }
        }
        
    }

    public void shooting(int x)
    {
        delay--;
        if(delay==0)
        {
            Greenfoot.playSound("ammo.wav");
            getWorld().addObject(new Bullet(),getX(),getY());
            if(MyWorld.score.getValue()>=200){
            getWorld().addObject(new Bullet(),getX()-10,getY());
            getWorld().addObject(new Bullet(),getX()+10,getY());}
            delay=x;
        
            
        }
        
    }

    public void move(int x)
    {
        if(Greenfoot.isKeyDown("up"))
        {
            setLocation(getX(),getY()-x);
        }
        if(Greenfoot.isKeyDown("down"))
        {
            setLocation(getX(),getY()+x);
        }
        if(Greenfoot.isKeyDown("left"))
        {
            setLocation(getX()-x,getY());
        }
        if(Greenfoot.isKeyDown("right"))
        {
            setLocation(getX()+x,getY());
        }
    }
}    

