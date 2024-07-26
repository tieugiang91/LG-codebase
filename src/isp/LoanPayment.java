package isp;

import java.util.List;

public class LoanPayment implements Loan {
    public LoanPayment() {
    }

    public Object status() {
        return null;
    }

    public List<Object> getPayments() {
        return null;
    }

    public void intiateLoanSettlement() {
        throw new UnsupportedOperationException("This is not a loan payment");
    }

    public void initiateRePayment() {
        throw new UnsupportedOperationException("This is not a loan payment");
    }
}
