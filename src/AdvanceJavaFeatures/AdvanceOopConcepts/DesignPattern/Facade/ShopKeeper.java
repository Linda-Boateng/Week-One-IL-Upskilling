package AdvanceJavaFeatures.AdvanceOopConcepts.DesignPattern.Facade;

public class ShopKeeper {
    private final Phones iPhone;
    private final Phones samsung;
    private final Phones techno;
    private final Phones infinix;

    public ShopKeeper() {
        iPhone = new IPhone();
        samsung = new Samsung();
        techno = new Techno();
        infinix = new Infinix();
    }

    public void iPhoneSale() {
        iPhone.modelNo();
        iPhone.price();
    }

    public void samsungSale() {
        samsung.modelNo();
        samsung.price();
    }

    public void technoSale() {
        techno.modelNo();
        techno.price();
    }

    public void infinixSale() {
        infinix.modelNo();
        infinix.price();
    }
}
