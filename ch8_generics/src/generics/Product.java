package generics;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Product<T, M> {

  private T kind;
  private M model;
}
