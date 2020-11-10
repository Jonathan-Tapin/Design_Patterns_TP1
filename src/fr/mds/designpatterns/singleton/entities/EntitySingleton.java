package fr.mds.designpatterns.singleton.entities;

import java.util.ArrayList;
import java.util.List;

public class EntitySingleton {

    private List<Entity1> entity1List;

    private EntitySingleton()
    {
        entity1List = new ArrayList<Entity1>();

        for (int i = 0; i < 20; i++) {
            Entity1 e1 = new Entity1();
            e1.setId(autoIncrem());
            e1.setData("data " + i);
            entity1List.add(e1);
        }
    }


    private static EntitySingleton INSTANCE = null;

    public static synchronized EntitySingleton getInstance()
    {
        if (INSTANCE == null)
        {   INSTANCE = new EntitySingleton();
        }
        return INSTANCE;
    }

    public List<Entity1> getEntity1List() {
        return entity1List;
    }

    //Il faut vraiement que je bosse l'algo....
    private int  autoIncrem() {
        int id = 0;
       return  id ++;

    }
}

