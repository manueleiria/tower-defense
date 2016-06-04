package org.academiadecodigo.towerdefense;

import org.academiadecodigo.towerdefense.object.gameobject.GameObjectType;
import org.academiadecodigo.towerdefense.object.gameobject.Menu;
import org.academiadecodigo.towerdefense.object.gameobject.ObjectFactory;
import org.academiadecodigo.towerdefense.object.interfaces.Representable;
import org.academiadecodigo.towerdefense.object.interfaces.RepresentableFactory;
import org.academiadecodigo.towerdefense.object.simplegfx.SimpleGfxMenu;
import org.academiadecodigo.towerdefense.object.simplegfx.SimpleGfxRepresentableFactory;

/**
 * Created by codecadet on 23/05/16.
 */
public class Main {

    public static void main(String[] args) throws InterruptedException {
        RepresentableFactory factory = new SimpleGfxRepresentableFactory();

        Menu menu = ((Menu) factory.createRepresentableObject(GameObjectType.MENU, 10, 10));

        menu.init();

        try {
            do {

                Thread.sleep(20);

            } while (!menu.isPlay());

            menu.clear();
        }
        catch (InterruptedException o) {
            o.getMessage();
        }

        Game g = new Game(new ObjectFactory(factory), menu.getLevel());
        g.start();

    }
}
