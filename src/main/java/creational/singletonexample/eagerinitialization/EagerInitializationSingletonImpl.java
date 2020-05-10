package creational.singletonexample.eagerinitialization;

import creational.singletonexample.abstractsingleton.AbstractSingleton;
import creational.singletonexample.interfaces.ICreateSingleton;

public class EagerInitializationSingletonImpl implements ICreateSingleton {

    public AbstractSingleton getSingletonInstance() {
        return EagerInitializationSingleton.getInstance();
    }
}
