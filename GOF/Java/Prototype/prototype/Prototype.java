package prototype;

import java.lang.*;

public interface Prototype {
  Prototype clone();
  boolean equals(Object obj);
  void execute();
}
