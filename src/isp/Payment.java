package isp;

import java.util.List;

public interface Payment {
    Object status();

    List<Object> getPayments();
}