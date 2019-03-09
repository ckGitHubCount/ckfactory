package ck_factory.abstract_factory;

import ck_factory.ProductLineA;
import ck_factory.ProductLineB;

public interface AbstractFactory {
    ProductLineA createLineA();
    ProductLineB createLineB();
}
