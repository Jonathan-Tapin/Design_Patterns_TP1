package fr.mds.designpatterns.singleton.launcher;

import fr.mds.designpatterns.singleton.entities.Entity1;
import fr.mds.designpatterns.singleton.entities.EntitySingleton;

import java.util.ArrayList;
import java.util.List;

/**
*
* @author tactfactory
*
* - Modifier le programme pour :
*   - 1 : permettre d'accéder n'importe où dans le projet à la liste d'Entity1
*   - 2 : faire en sorte que les ajouts, suppresions sur la liste d'Entity1 soient préservés durant l'exécution du
*       programme
*   - 3 : que les id des éléments dans la liste ne soient plus saisissables par le développeur et qu'ils deviennent
*       auto-incrémentés
*/
public class SingletonTp1 {
  public static void main(String[] args) {

    System.out.println(String.format("Nombre d'Entity1 %d", EntitySingleton.getInstance().getEntity1List().stream().count()));

    Entity1 e11 = new Entity1();
    e11.setId(15);
    e11.setData("data e1 15");

    EntitySingleton.getInstance().getEntity1List().add(e11);

    Entity1 e12 = new Entity1();
    e12.setId(16);
    e12.setData("data e1 16");

    EntitySingleton.getInstance().getEntity1List().add(e12);

    for (Entity1 item : EntitySingleton.getInstance().getEntity1List()) {
      System.out.println(item);
    }
  }

  //TRANSFERT DANS LE SINGLETON
 /* private static List<Entity1> getEntity1s(){
    List<Entity1> result = new ArrayList<Entity1>();

    for (int i = 0; i < 20; i++) {
      Entity1 e1 = new Entity1();
      e1.setId(i % 15);
      e1.setData("data " + i);
      result.add(e1);
    }

    return result;
  }*/
}
