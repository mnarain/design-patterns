package sr.unasat.designpatterns.patterns.factory;

public class Basic implements Subscription {

   @Override
   public void loadSubscriptionPackage() {
      System.out.println("Welcome to your basic subscription.");
   }
}