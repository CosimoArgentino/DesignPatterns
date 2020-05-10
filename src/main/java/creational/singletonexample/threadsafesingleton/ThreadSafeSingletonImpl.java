package creational.singletonexample.threadsafesingleton;

import creational.singletonexample.abstractsingleton.AbstractSingleton;
import creational.singletonexample.interfaces.ICreateSingleton;

public class ThreadSafeSingletonImpl implements ICreateSingleton {

    @Override
    public AbstractSingleton getSingletonInstance() {
        return ThreadSafeSingleton.getInstance();
    }
}
