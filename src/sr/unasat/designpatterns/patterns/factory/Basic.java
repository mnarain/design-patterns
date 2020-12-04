package sr.unasat.designpatterns.patterns.factory;

import java.util.List;

public class Basic implements Subscription {
  // private List<Movies> filmLijst;
  // private Integer devicesAllowed;

   @Override
   public void loadSubscriptionPackage() {
      System.out.println("Welcome to your basic subscription.");

    //  filmLijst = getAllowedMoviesServices;
     // devicesAllowed = getregisteredDevices;
   }
}