package ck_factory.abstract_factory;

import ck_factory.ProductLineA;
import ck_factory.ProductLineA_B;
import ck_factory.ProductLineB;
import ck_factory.ProductLineB_B;

public class FactoryLineB implements AbstractFactory {
    @Override
    public ProductLineA createLineA() {
        return new ProductLineA_B();
    }

    @Override
    public ProductLineB createLineB() {
        return new ProductLineB_B();
    }
}
