package design.state;

public class ReceivedState implements PackageState {

  @Override
  public void prev(Package pkg) {
    pkg.setState(new DeliveredState());
  }

  @Override
  public void next(Package pkg) {
    System.out.println("The package is in it's bottom level.");
  }

  @Override
  public void printStatus() {
    System.out.println("The package has reaches to the client.");
  }
}
