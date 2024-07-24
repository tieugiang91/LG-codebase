package isp;

public interface Loan extends Payment {
    //Loan related methods
    void initiateLoanSettlement();
    void initiateRePayment();
}
