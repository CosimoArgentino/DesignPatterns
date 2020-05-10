package creational.singletonexamplewithstrategy.singletones.eagerinitializationsingleton;

import creational.singletonexamplewithstrategy.abstractsingleton.AbstractSingleton;
import creational.singletonexamplewithstrategy.interfaces.ICreateSingleton;

public class EagerInitializationSingletonImpl implements ICreateSingleton {

    public AbstractSingleton getSingletonInstance() {
        return EagerInitializationSingleton.getInstance();
    }
}
