package prototype;

import java.util.Map;
import java.util.HashMap;

class ColorModule {
  private static Map<String, Prototype> colors = new HashMap<String, Prototype>();

  public Prototype addColor(String name, Prototype color) {
    if (this.colors.containsKey(name)) {
      System.out.println("This color already exists");
      return this.colors.get(color).clone();
    } else {
      this.colors.put(name, color);
    }

    return color;
  }

  public Prototype createColor(String name) {
    Prototype resultColor = this.colors.get(name); // Returns null if not exists

    if (this.colors.containsKey(name)) {
      System.out.println("Cloning color " + name);
      resultColor.execute();
      resultColor = resultColor.clone();
    } else {
      System.out.println("Color " + name + " does not exist yet.");
    }

    return resultColor;
  }

  public Map getColors() {
    return this.colors;
  }
}
