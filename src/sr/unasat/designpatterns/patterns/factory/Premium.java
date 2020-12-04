package sr.unasat.designpatterns.patterns.factory;

public class Premium implements Subscription {


   @Override
   public void loadSubscriptionPackage() {
      System.out.println("Welcome to your premium subscription Champ!!!");
   }
}