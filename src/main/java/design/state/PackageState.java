package design.state;

public interface PackageState {

  void prev(Package pkg);
  void next(Package pkg);
  void printStatus();

}
