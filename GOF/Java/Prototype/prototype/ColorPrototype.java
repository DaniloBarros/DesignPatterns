package prototype;

import java.awt.Color;

public class ColorPrototype implements Prototype {
  private Color color;

  public ColorPrototype (int red, int green, int blue) {
    this.color = new Color(red, green, blue);
  }

  @Override
  public Prototype clone() {
    int red = this.color.getRed();
    int green = this.color.getGreen();
    int blue = this.color.getBlue();
    ColorPrototype color = new ColorPrototype(red, green, blue);

    return color;
  }

  @Override
  public boolean equals(Object obj) {
    boolean result = false;

    if (obj instanceof Color) {
      Color checkColor = (Color) obj;
      result = this.color.equals(checkColor);
    }

    return result;
  }

  @Override
  public void execute() {
    String rgb = String.format("(%d, %d, %d)", this.color.getRed(),
        this.color.getGreen(), this.color.getBlue());
    System.out.println(rgb + " is painting something!");
  }

  public Color getColor() {
    return this.color;
  }

}
