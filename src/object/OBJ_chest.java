package object;

import main.Gamepanel;

import javax.imageio.ImageIO;
import java.io.IOException;

public class OBJ_chest extends Superobject{
    public OBJ_chest(Gamepanel gp){
        name="chest";
        try {
            image= ImageIO.read(getClass().getResourceAsStream("/objects/chest.png"));
            Utool.scaleImage(image,gp.tileSize,gp.tileSize);

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
