package object;

import main.Gamepanel;

import javax.imageio.ImageIO;
import java.io.IOException;

public class OBJ_Heart extends Superobject{
    public OBJ_Heart(Gamepanel gp){


        name="heart";
        try {
            image3= ImageIO.read(getClass().getResourceAsStream("/objects/heart_blank.png"));
            image3=Utool.scaleImage(image3,gp.tileSize,gp.tileSize);
            image= ImageIO.read(getClass().getResourceAsStream("/objects/heart_full.png"));
            image=Utool.scaleImage(image,gp.tileSize,gp.tileSize);
            image2= ImageIO.read(getClass().getResourceAsStream("/objects/heart_half.png"));
            image2= Utool.scaleImage(image2,gp.tileSize,gp.tileSize);

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
