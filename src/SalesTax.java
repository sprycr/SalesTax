public class SalesTax {
  public static void main(String[] args){
    final double taxRate = 0.05;
    double itemPrice = 8.0;
    double salesTax = itemPrice * taxRate;
    System.out.println("The sales tax for the item is: "+salesTax);
    System.out.println(System.getProperties());
  }
}
