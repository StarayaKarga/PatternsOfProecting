package strategy;

public class MonobankMoney implements PaymentMethod {

  private String billNumber;

  public MonobankMoney(String billNumber) {
    this.billNumber = billNumber;
  }

  @Override
  public boolean pay(int amount) {
    if (MonobankMoneyOperator.charge(this, amount)) {
      System.out.println("Charge successful!");
      return true;
    }
    System.out.println("Error while charge YandexMoney");
    return false;
  }
}