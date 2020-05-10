package creational.singletonexamplewithstrategy.singletones.eagerinitializationsingleton;

import creational.singletonexamplewithstrategy.abstractsingleton.AbstractSingleton;

public class EagerInitializationSingleton extends AbstractSingleton {

    private static final EagerInitializationSingleton instance = new EagerInitializationSingleton();

    private EagerInitializationSingleton() {

    }

    public static EagerInitializationSingleton getInstance(){
        return instance;
    }

    public String getSingletonType() {
        return "Eager initialization selected!";
    }
}
