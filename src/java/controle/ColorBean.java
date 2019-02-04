package controle;



 import java.awt.Color;
import javax.faces.bean.ManagedBean;

 @ManagedBean(name="ColorBean")
 public class ColorBean {

private Color color;

private String rgbColor;

public String getRgbColor() {
  return rgbColor;
    }

     public void setRgbColor(String rgbColor) {
        this.rgbColor = rgbColor;
    }

     public Color getColor() {
        return color;
    }

     public void setColor(Color color) {
         this.color = color;
     }
 }