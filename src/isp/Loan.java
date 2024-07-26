package isp;

public interface Loan extends Payment {
    void intiateLoanSettlement();

    void initiateRePayment();
}