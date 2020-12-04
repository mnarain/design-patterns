package sr.unasat.designpatterns.patterns.factory;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Trial implements Subscription {


    @Override
    public void loadSubscriptionPackage() {
        System.out.println("Welcome to your trial version.");
        System.out.println("You have only " + ChronoUnit.DAYS.between(LocalDate.now(), LocalDate.of(2020,12,10)) + " days left in your free trial.");
        System.out.println("if you sign up before your trial ends we will give you 20% off");
    }
}