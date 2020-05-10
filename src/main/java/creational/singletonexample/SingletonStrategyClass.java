package creational.singletonexample;

import creational.singletonexample.abstractsingleton.AbstractSingleton;
import creational.singletonexample.interfaces.ICreateSingleton;

public class SingletonStrategyClass  {

    private final creational.singletonexample.interfaces.ICreateSingleton ICreateSingleton;

    public SingletonStrategyClass(ICreateSingleton ICreateSingleton){
        this.ICreateSingleton = ICreateSingleton;
    }

    public AbstractSingleton getSingleton(){
        return ICreateSingleton.getSingletonInstance();
    }

}
