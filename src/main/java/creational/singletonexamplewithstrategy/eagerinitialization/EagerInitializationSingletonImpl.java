package creational.singletonexamplewithstrategy.eagerinitialization;

import creational.singletonexamplewithstrategy.abstractsingleton.AbstractSingleton;
import creational.singletonexamplewithstrategy.interfaces.ICreateSingleton;

public class EagerInitializationSingletonImpl implements ICreateSingleton {

    public AbstractSingleton getSingletonInstance() {
        return EagerInitializationSingleton.getInstance();
    }
}
