package object;

import main.Gamepanel;

import javax.imageio.ImageIO;
import java.io.IOException;

public class OBJ_boots extends Superobject{
    public OBJ_boots(Gamepanel gp){


        name="boots";
        try {
            image= ImageIO.read(getClass().getResourceAsStream("/objects/boots.png"));
            Utool.scaleImage(image,gp.tileSize,gp.tileSize);

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
