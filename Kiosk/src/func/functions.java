package func;
import javax.swing.*;
import java.awt.*;

public class functions extends JFrame{
    //resize method
    public static ImageIcon resize(String path){
        ImageIcon icon = new ImageIcon(path);
        Image img = icon.getImage();
        Image reSizeImg = img.getScaledInstance(70, 80,Image.SCALE_SMOOTH);
        ImageIcon changeIcon = new ImageIcon(reSizeImg);

        return changeIcon;

    }

}