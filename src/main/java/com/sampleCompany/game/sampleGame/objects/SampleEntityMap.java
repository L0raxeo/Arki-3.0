package com.sampleCompany.game.sampleGame.objects;

import com.sampleCompany.arki.gameEngine.entities.EntityMap;
import com.sampleCompany.game.sampleGame.Reference;

import java.util.Random;

public class SampleEntityMap extends EntityMap
{

    @Override
    public void mapEntities()
    {
        Random r = new Random();

        addEntity(new SampleObjects("Base Creature", "baseCreature1", 400, r.nextInt(Reference.displayHeight - 25), 25, 25));
        addEntity(new SampleObjects("Base Creature", "baseCreature2", Reference.displayWidth - 400, r.nextInt(Reference.displayHeight - 25), 25, 25));
        addEntity(new SampleObjects("Base Creature", "baseCreature3", Reference.displayWidth - 200, r.nextInt(Reference.displayHeight - 25), 25, 25));

        addEntity(new SampleFloor("Sample Floor", "sampleFloor", 0, 700, Reference.displayWidth, 50, true));
    }

}
