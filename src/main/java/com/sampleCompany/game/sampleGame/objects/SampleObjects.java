package com.sampleCompany.game.sampleGame.objects;

import com.sampleCompany.arki.gameEngine.entities.objects.GameObject;
import com.sampleCompany.arki.gameEngine.entities.objects.Physics;
import com.sampleCompany.arki.gameEngine.gfx.Animation;
import com.sampleCompany.arki.gameEngine.utils.FileLoader;

import java.awt.*;

@Physics(GRAVITATIONAL_ACCELERATION = 1, TERMINAL_VELOCITY = 300, mass = 5)
public class SampleObjects extends GameObject
{

    private Animation animation;

    public SampleObjects(String name, String unlocalizedName, float x, float y, int width, int height)
    {
        super(name, unlocalizedName, x, y, width, height, true);
    }

    @Override
    public void awake()
    {
        animation = new Animation(150, FileLoader.loadImage("/assets/missing_texture_0.png"), FileLoader.loadImage("/assets/missing_texture_1.png"));
    }

    @Override
    protected void start()
    {

    }

    @Override
    public void tick()
    {
        super.checkCollision();
        animation.tick();
    }

    @Override
    public void render(Graphics g)
    {
        g.drawImage(animation.getCurrentFrame(), getDisplayX(), getDisplayY(), width, height, null);
    }

    @Override
    public void onCollision(GameObject collider)
    {
        System.out.println("colliding");
    }

    @Override
    public void onCollisionExit(GameObject collider)
    {
        System.out.println("exiting");
    }

    @Override
    public void onCollisionStay(GameObject collider)
    {

    }

}