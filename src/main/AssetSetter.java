package main;

import entity.NPC_Old_Man;
import object.*;


public class AssetSetter {
    Gamepanel gp;
    public  AssetSetter(Gamepanel gp) {
        this.gp=gp;}
    public void setObject(){
        // where to place on map

    }
    public  void setNPC(){
        gp.NPC[0]=new NPC_Old_Man(gp);
        gp.NPC[0].wordlx=gp.tileSize*21;
        gp.NPC[0].worldy=gp.tileSize*21;
    }
}
