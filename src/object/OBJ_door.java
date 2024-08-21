package object;

import main.Gamepanel;

import javax.imageio.ImageIO;
import java.io.IOException;

public class OBJ_door extends Superobject {
    public OBJ_door(Gamepanel gp) {
        name = "door";  // Set the name of the object to "door"
        try {
            // Attempt to read the image file for the door object
            image = ImageIO.read(getClass().getResourceAsStream("/objects/door.png"));
            Utool.scaleImage(image,gp.tileSize,gp.tileSize);

        } catch (IOException e) {

            e.printStackTrace();
        }
     //   solidArea.x=5;  solidArea.y=5;
        collision=true;
    }
}
