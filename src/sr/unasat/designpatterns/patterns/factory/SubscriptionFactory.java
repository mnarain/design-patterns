package sr.unasat.designpatterns.patterns.factory;

public class SubscriptionFactory {

    //use getShape method to get object of type shape
    public Subscription getShape(String subscriptionPackage) {
        if (subscriptionPackage == null) {
            return null;
        }
        if (subscriptionPackage.equalsIgnoreCase("trial")) {
            return new Trial();

        } else if (subscriptionPackage.equalsIgnoreCase("basic")) {
            return new Basic();

        } else if (subscriptionPackage.equalsIgnoreCase("premium")) {
            return new Premium();
        }

        return null;
    }
}