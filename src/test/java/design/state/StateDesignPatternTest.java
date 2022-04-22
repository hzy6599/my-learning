package design.state;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertInstanceOf;

public class StateDesignPatternTest {

  @Test
  public void testOrderDeliverReceive() {
    Package pkg = new Package();
    assertInstanceOf(OrderedState.class, pkg.getState());

    pkg.nextState();
    assertInstanceOf(DeliveredState.class, pkg.getState());

    pkg.nextState();
    assertInstanceOf(ReceivedState.class, pkg.getState());
  }

  @Test
  public void testReceiveDeliverOrder() {
    Package pkg = new Package();
    pkg.setState(new ReceivedState());
    assertInstanceOf(ReceivedState.class, pkg.getState());

    pkg.previousState();
    assertInstanceOf(DeliveredState.class, pkg.getState());

    pkg.previousState();
    assertInstanceOf(OrderedState.class, pkg.getState());
  }

}
