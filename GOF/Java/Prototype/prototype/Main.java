package prototype;

import prototype.ColorModule;
import prototype.ColorPrototype;
import prototype.ColorPrototype;

public class Main {
  public static void main (String[] args) {
    ColorModule colorMod = new ColorModule();

    ColorPrototype red = new ColorPrototype(255, 0, 0);
    ColorPrototype green = new ColorPrototype(0, 255, 0);
    ColorPrototype blue = new ColorPrototype(0, 0, 255);

    colorMod.addColor("red", red);
    colorMod.addColor("green", green);
    colorMod.addColor("blue", blue);

    ColorPrototype newColor = (ColorPrototype) colorMod.createColor("red");
    ColorPrototype newColor1 = (ColorPrototype) colorMod.createColor("cyan");
  }
}
