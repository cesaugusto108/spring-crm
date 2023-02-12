package ces.augusto108.springcrm.services;

import ces.augusto108.springcrm.entities.Customer;

import java.util.List;

public interface CustomerService {
    Customer getCustomer(int id);

    List<Customer> getCustomers();
}
