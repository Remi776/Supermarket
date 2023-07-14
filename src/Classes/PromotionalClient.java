package Classes;

public class PromotionalClient extends Actor{
    public String promName;
    private int idProm;
    public static int maxPromClients;

    public PromotionalClient(String name, String promName, Integer id) {
        super(name);
        this.promName = promName;
        idProm = id;
        maxPromClients = 20;
    }

    @Override
    public String getName() {
        return super.name;
    }

    public boolean isTakeOrder() {
        return super.isTakeOrder;
    }

    public boolean isMakeOrder() {
        return super.isMakeOrder;
    }

    public void setTakeOrder(boolean makeOder) {
        super.isMakeOrder = makeOder;
    }

    public void setMakeOrder(boolean pikUpOrder) {
        super.isTakeOrder = pikUpOrder;
    }

    @Override
    public Actor getActor() {
        return this;
    }

    @Override
    public boolean getRefund() {
        return super.getRefund;
    }

    @Override
    public void takeRefund(boolean Refund) {
        super.getRefund = Refund;
    }

    @Override
    public boolean getRejected() {
        return super.getRejected;
    }

    @Override
    public void takeRejected(boolean Rejection) {
        super.getRejected = Rejection;
    }
}
