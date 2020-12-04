package sr.unasat.designpatterns.app;

import sr.unasat.designpatterns.patterns.factory.Subscription;
import sr.unasat.designpatterns.patterns.factory.SubscriptionFactory;
import sr.unasat.designpatterns.patterns.strategy.Context;
import sr.unasat.designpatterns.patterns.strategy.OperationAdd;
import sr.unasat.designpatterns.patterns.strategy.OperationMultiply;
import sr.unasat.designpatterns.patterns.strategy.OperationSubstract;

public class Application {
    public static void main(String[] args) {
        Application app = new Application();
        app.factoryDemo();
        app.strategyDemo();
    }

    private void strategyDemo() {

        Context context = new Context(new OperationAdd());
        System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

        context = new Context(new OperationSubstract());
        System.out.println("10 - 5 = " + context.executeStrategy(10, 5));

        context = new Context(new OperationMultiply());
        System.out.println("10 * 5 = " + context.executeStrategy(10, 5));
    }


    private void factoryDemo() {
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


