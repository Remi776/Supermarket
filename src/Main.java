import Classes.*;
import Interfaces.iActorBehaviuor;

public class Main {
    public static void main(String[] args) throws Exception {
        Market magnit = new Market();
        iActorBehaviuor client1 = new OrdinaryClient("Boris");
        iActorBehaviuor client2 = new SpecialClient("president",1001);
        iActorBehaviuor p = new PensionerClient("Sergey Nikolay",1111);
        iActorBehaviuor promClient1 = new PromotionalClient("Dima", "Акция 1+1", 2001);
        iActorBehaviuor promClient2 = new PromotionalClient("Sasha", "Акция 40% на молочные продукты", 2011);

        iActorBehaviuor tax = new TaxService();

        magnit.acceptToMarket(client1);
        magnit.acceptToMarket(client2);
        magnit.acceptToMarket(p);
        magnit.acceptToMarket(tax);
        magnit.acceptToMarket(promClient1);
        magnit.acceptToMarket(promClient2);

        magnit.update();
    }
}