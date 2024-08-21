package object;

import main.Gamepanel;
import main.UtilityTool;

import java.awt.*;
import java.awt.image.BufferedImage;

public class Superobject {
    public BufferedImage image,image2,image3;
    public String name;
    public Rectangle solidArea=new Rectangle(0,0,48,48);
    public  int solidAreaDefaultX =0;
    public  int solidAreaDefaultY =0;
    public boolean collision=false;
    public int worldX,worldY;
    UtilityTool Utool=new UtilityTool();
    public void draw(Graphics2D g2, Gamepanel gp){
        int screenX = worldX - gp.player.wordlx + gp.player.screenX;
        int screenY = worldY - gp.player.worldy + gp.player.screenY;
        if(worldX+gp.tileSize>gp.player.wordlx-gp.player.screenX &&
                worldX-gp.tileSize<gp.player.wordlx+gp.player.screenX&&
                worldY+gp.tileSize>gp.player.worldy-gp.player.screenY &&
                worldY-gp.tileSize<gp.player.worldy+gp.player.screenY){
            g2.drawImage(image, screenX, screenY, gp.tileSize, gp.tileSize, null);
        }
    }
}
