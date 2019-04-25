package snow;

import java.awt.Color;
import java.awt.Graphics;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author XingLu
 */
public class StormySnowFlake extends AbstractShape {
    
    private SimpleSnowFlake simpSnowflake;
    private FancySnowFlake fancySnowflake;
    
    public StormySnowFlake(){
        super(0, 0, 10, 10, Color.WHITE, 20, 2);
        simpSnowflake = new SimpleSnowFlake(0, 0, 10, 10);
        fancySnowflake = new FancySnowFlake(0, 0, 10, 10);
    }
    
    public StormySnowFlake(int x, int y) {
        super(x, y, 10, 10, Color.WHITE, 20, 2);
        simpSnowflake = new SimpleSnowFlake(x, y, 10, 10);
        fancySnowflake = new FancySnowFlake(x, y, 40, 40);
    }
    
    public StormySnowFlake(int x, int y, int w, int h) {
        super(x, y, w, h, Color.WHITE, 20, 2);
        simpSnowflake = new SimpleSnowFlake(x, y, w, h);
        fancySnowflake = new FancySnowFlake(x, y, w, h);
    }
    
    public StormySnowFlake(int x, int y, int w, int h, int xs, int ys) {
        super(x, y, w, h, Color.WHITE, xs, ys);
        simpSnowflake = new SimpleSnowFlake(x, y, w, h);
        fancySnowflake = new FancySnowFlake(x, y, w, h);
    }
    
    
    public void draw(Graphics window) {
        simpSnowflake.draw(window);
        fancySnowflake.draw(window);
    }

    public void moveAndDraw(Graphics window) {
        window.setColor(Color.BLUE);
        draw(window);
        simpSnowflake.setXPos(getXPos() + getXSpeed());
        fancySnowflake.setXPos(getXPos() + getXSpeed());
        super.setXPos(getXPos() + getXSpeed());
        simpSnowflake.setYPos(getYPos() + getYSpeed());
        fancySnowflake.setYPos(getYPos() + getYSpeed());
        super.setYPos(getYPos() + getYSpeed());
        window.setColor(Color.WHITE);
        draw(window);
    }
    
}
