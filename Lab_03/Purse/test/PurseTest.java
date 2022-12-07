import org.junit.Assert;
import org.junit.Test;

public class PurseTest {

  @Test
  public void findTest() {
    Purse borsetta = new Purse();
    borsetta.add(Purse.DOLLAR);
    borsetta.add(Purse.DIME);
    borsetta.add(Purse.CENT);

    Assert.assertFalse(borsetta.find(Purse.NICKEL));
    Assert.assertTrue(borsetta.find(Purse.DIME));
  }

  @Test
  public void countTest() {
    Purse borsetta = new Purse();
    borsetta.add(Purse.DOLLAR);
    borsetta.add(Purse.DIME);
    borsetta.add(Purse.CENT);

    Assert.assertEquals(1, borsetta.count(Purse.DOLLAR));
    Assert.assertEquals(0, borsetta.count(Purse.NICKEL));
  }

  @Test
  public void minMaxTest() {
    Purse borsetta = new Purse();
    borsetta.add(Purse.DOLLAR);
    borsetta.add(Purse.DIME);
    borsetta.add(Purse.CENT);

    Assert.assertEquals( Purse.CENT, borsetta.getMinimum());
    Assert.assertEquals( Purse.DOLLAR, borsetta.getMaximum());
  }

  @Test
  public void getTotalTest() {
    Purse borsetta = new Purse();
    borsetta.add(Purse.DOLLAR);
    borsetta.add(Purse.DIME);
    borsetta.add(Purse.CENT);

    Assert.assertEquals( 1.11, borsetta.getTotal(), 0);
  }

  @Test
  public void addRemoveTest() {
    Purse borsetta = new Purse();
    borsetta.add(Purse.DOLLAR);
    borsetta.add(Purse.DIME);
    borsetta.add(Purse.DIME);

    Assert.assertEquals(2, borsetta.count(Purse.DIME));
    borsetta.remove(Purse.DIME);
    Assert.assertEquals(1, borsetta.count(Purse.DIME));
  }

  @Test
  public void hasCoinTest() {
    Purse borsetta = new Purse();
    borsetta.add(Purse.DOLLAR);
    borsetta.add(Purse.DIME);
    borsetta.add(Purse.CENT);

    Assert.assertTrue(borsetta.hasCoin(Purse.DIME));
    Assert.assertFalse(borsetta.hasCoin(Purse.QUARTER));
  }

  @Test
  public void toStringTest() {
    /* TODO */
  }

  @Test
  public void equalsTest() {
    /* TODO */
  }
}