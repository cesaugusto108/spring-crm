package ces.augusto108.springcrm.dao;

import ces.augusto108.springcrm.entities.Customer;

import java.util.List;

public interface CustomerDAO {
    Customer getCustomer(int id);

    List<Customer> getCustomers();
}
