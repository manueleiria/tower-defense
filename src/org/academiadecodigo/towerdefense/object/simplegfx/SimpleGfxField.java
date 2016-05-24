package org.academiadecodigo.towerdefense.object.simplegfx;

import org.academiadecodigo.simplegraphics.graphics.Rectangle;

/**
 * Created by codecadet on 23/05/16.
 */
public class SimpleGfxField extends SimpleGfxRepresentation {
    private static final double MARGIN_LEFT = 10;
    private static final double MARGIN_TOP = 10;


    public SimpleGfxField(int height, int width) {

        super(new Rectangle(MARGIN_LEFT, MARGIN_TOP, width, height));
    }
}
