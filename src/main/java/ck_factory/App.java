package ck_factory;

import ck_factory.abstract_factory.AbstractFactory;
import ck_factory.abstract_factory.FactoryLineA;
import ck_factory.abstract_factory.FactoryLineB;
import ck_factory.methodf_actory.Method_factory;
import ck_factory.methodf_actory.ProductAFactory;
import ck_factory.methodf_actory.ProductBFactory;
import ck_factory.simple_factory.SimpleFactory;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        teatSimpleMethod()
//        teatMethodFactory();
        teatAbstractFactory();
    }

    public static void  teatSimpleMethod(){
        ProductLineA productLineA =SimpleFactory.create(ProductLineA_A.class);
        ProductLineA productLineA2 =SimpleFactory.create(ProductLineA_B.class);
    }
    public static void  teatMethodFactory(){
        Method_factory method_factory=new ProductAFactory();
        ProductLineA productLineA =method_factory.create();
        Method_factory productBFactory = new ProductBFactory();
        ProductLineA productLineA1 =productBFactory.create();
    }
    public static void  teatAbstractFactory(){
        AbstractFactory method_factory=new FactoryLineA();
        method_factory.createLineA();
        method_factory.createLineB();
        AbstractFactory factoryLineB=new FactoryLineB();
        factoryLineB.createLineA();
        factoryLineB.createLineB();
    }
}
