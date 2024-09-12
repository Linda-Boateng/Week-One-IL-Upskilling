package AdvanceJavaFeatures.AdvanceOopConcepts.DesignPattern.Facade;
/*
A Facade Pattern says that just
"just provide a unified and simplified interface to a set of interfaces in a subsystem,
therefore it hides the complexities of the subsystem from the client".
Practically, every Abstract Factory is a type of Facade.
 */
public class Shop {
    public static void main(String[] args) {
        ShopKeeper shopKeeper = new ShopKeeper();
        shopKeeper.infinixSale();
        shopKeeper.technoSale();
        shopKeeper.samsungSale();
        shopKeeper.iPhoneSale();
    }
}
