package object;

import main.Gamepanel;
import main.UI;

import javax.imageio.ImageIO;
import java.io.IOException;

public class OBJ_key extends Superobject {
    public OBJ_key(Gamepanel gp){
     name="key";
     try {
    image= ImageIO.read(getClass().getResourceAsStream("/objects/Key.png"));
         Utool.scaleImage(image,gp.tileSize,gp.tileSize);

     }catch (IOException e){
         e.printStackTrace();
     }
    }
}
