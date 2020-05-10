package creational.singletonexamplewithstrategy.threadsafesingleton;

import creational.singletonexamplewithstrategy.abstractsingleton.AbstractSingleton;
import creational.singletonexamplewithstrategy.interfaces.ICreateSingleton;

public class ThreadSafeSingletonImpl implements ICreateSingleton {

    @Override
    public AbstractSingleton getSingletonInstance() {
        return ThreadSafeSingleton.getInstance();
    }
}
