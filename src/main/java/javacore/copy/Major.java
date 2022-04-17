package javacore.copy;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class Major implements Cloneable{
  private String majorName;
  private long majorId;

  @Override
  protected Object clone() throws CloneNotSupportedException {
    return super.clone();
  }
}
