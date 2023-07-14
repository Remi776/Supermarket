package Interfaces;

public interface iReturnOrder {
    public boolean getRefund();
    void takeRefund(boolean Refund);
    public boolean getRejected();
    void takeRejected(boolean Rejection);
}
