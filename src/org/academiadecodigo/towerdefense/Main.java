package org.academiadecodigo.towerdefense;

import org.academiadecodigo.towerdefense.object.gameobject.Menu;
import org.academiadecodigo.towerdefense.object.gameobject.ObjectFactory;
import org.academiadecodigo.towerdefense.object.interfaces.RepresentableFactory;
import org.academiadecodigo.towerdefense.object.simplegfx.SimpleGfxMenu;
import org.academiadecodigo.towerdefense.object.simplegfx.SimpleGfxRepresentableFactory;

/**
 * Created by codecadet on 23/05/16.
 */
public class Main {

    public static void main(String[] args) throws InterruptedException {

        RepresentableFactory factory = new SimpleGfxRepresentableFactory();

        while (true) {

            Menu menu = new Menu(new SimpleGfxMenu(10, 10), 10, 10, new ObjectFactory(factory));

            menu.init();

            try {
                do {

                    Thread.sleep(20);

                } while (!menu.isPlay());

                menu.clear();
            } catch (InterruptedException o) {
                o.getMessage();
            }

            Game g = new Game(new ObjectFactory(factory), menu.getLevel());
            g.start();

        }

    }
}
