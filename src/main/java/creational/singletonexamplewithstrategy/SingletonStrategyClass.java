package creational.singletonexamplewithstrategy;

import creational.singletonexamplewithstrategy.abstractsingleton.AbstractSingleton;
import creational.singletonexamplewithstrategy.interfaces.ICreateSingleton;

public class SingletonStrategyClass  {

    private final creational.singletonexamplewithstrategy.interfaces.ICreateSingleton ICreateSingleton;

    public SingletonStrategyClass(ICreateSingleton ICreateSingleton){
        this.ICreateSingleton = ICreateSingleton;
    }

    public AbstractSingleton getSingleton(){
        return ICreateSingleton.getSingletonInstance();
    }

}
