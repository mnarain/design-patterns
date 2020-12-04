package sr.unasat.designpatterns.app;

import sr.unasat.designpatterns.patterns.factory.Subscription;
import sr.unasat.designpatterns.patterns.factory.SubscriptionFactory;

public class Application {
    public static void main(String[] args) {
        SubscriptionFactory subscriptionFactory = new SubscriptionFactory();

        //get an object of Circle and call its draw method.
        Subscription subscription1 = subscriptionFactory.getShape("trial");

        //call draw method of Circle
        subscription1.loadSubscriptionPackage();

        //get an object of Rectangle and call its draw method.
        Subscription subscription2 = subscriptionFactory.getShape("basic");

        //call draw method of Rectangle
        subscription2.loadSubscriptionPackage();

        //get an object of Square and call its draw method.
        Subscription subscription3 = subscriptionFactory.getShape("premium");

        //call draw method of square
        subscription3.loadSubscriptionPackage();
    }
}
