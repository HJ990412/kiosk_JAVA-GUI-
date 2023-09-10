package func;

import javax.swing.*;
import java.awt.*;

public class functions3 extends JFrame{
    //resize method
    public static ImageIcon resize3(String path){
        ImageIcon icon = new ImageIcon(path);
        Image img = icon.getImage();
        Image reSizeImg = img.getScaledInstance(500, 1000,Image.SCALE_SMOOTH);
        ImageIcon changeIcon = new ImageIcon(reSizeImg);

        return changeIcon;

    }

}