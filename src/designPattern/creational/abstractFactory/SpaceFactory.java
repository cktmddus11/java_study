package designPattern.creational.abstractFactory;

// AbstractFactory
public class SpaceFactory implements SuitAbstractFactory{
    @Override
    public Suit createSuit() {
        return new SpaceSuit();
    }
}
