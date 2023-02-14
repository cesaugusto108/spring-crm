package ces.augusto108.springcrm.services;

import ces.augusto108.springcrm.dao.CustomerDAO;
import ces.augusto108.springcrm.entities.Customer;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Service
@AllArgsConstructor
public class CustomerServiceImpl implements CustomerService {
    private final CustomerDAO customerDAO;

    @Override
    public Customer getCustomer(int id) {
        return customerDAO.getCustomer(id);
    }

    @Override
    public List<Customer> getCustomers() {
        return customerDAO.getCustomers();
    }

    @Override
    public void saveOrUpdate(Customer customer) {
        customerDAO.saveOrUpdate(customer);
    }

    @Override
    public void deleteCustomer(Customer customer) {
        customerDAO.deleteCustomer(customer);
    }
}
