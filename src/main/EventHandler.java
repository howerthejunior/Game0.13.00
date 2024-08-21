package main;

import java.awt.*;

public class EventHandler {
    Gamepanel gp;  // Assuming the class name is GamePanel, ensure it matches your actual class name
    Rectangle eventRect;
    int eventRectDefaultX, eventRectDefaultY;

    public EventHandler(Gamepanel gp) {
        this.gp = gp;
        eventRect = new Rectangle(23, 23, 2, 2);
        eventRectDefaultX = eventRect.x;
        eventRectDefaultY = eventRect.y;
    }

    public void checkEvent() {
        if (hit(27, 14, "right")) {damagePit(gp.dialougeState);}
        if (hit(23, 12, "up")) {healingpool(gp.dialougeState);}
    }

    public boolean hit(int eventCol, int eventRow, String reqDirection) {
        boolean hit = false;

        // Adjust the solidArea position relative to the world coordinates
        gp.player.solidArea.x = gp.player.wordlx + gp.player.solidArea.x;
        gp.player.solidArea.y = gp.player.worldy + gp.player.solidArea.y;

        // Set eventRect's position based on eventCol and eventRow
        eventRect.x = eventCol * gp.tileSize + eventRectDefaultX;
        eventRect.y = eventRow * gp.tileSize + eventRectDefaultY;

        // Check if the player's solidArea intersects with the eventRect
        if (gp.player.solidArea.intersects(eventRect)) {
            if (gp.player.direction.equals(reqDirection) || reqDirection.equals("any")) {
                hit = true;
            }
        }

        // Reset the solidArea and eventRect positions
        gp.player.solidArea.x = gp.player.solidAreaDefaultX;
        gp.player.solidArea.y = gp.player.solidAreaDefaultY;
        eventRect.x = eventRectDefaultX;
        eventRect.y = eventRectDefaultY;

        return hit;
    }

    public void damagePit(int gameState) {
        gp.gameState = gameState;
        gp.ui.currentDialogue = "You fall in a pit";  // Assuming "ui" and "currentDialogue" are defined correctly
        gp.player.life -= 1;
    }
    public void healingpool(int gamestate){
        if (gp.keyH.enterPressed==true){
            gp.gameState=gamestate;
            gp.ui.currentDialogue="Angel will heal your wounds !";
            gp.player.life+=2;
        }
        gp.keyH.enterPressed=false;

    }
}
