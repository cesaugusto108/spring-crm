package ces.augusto108.springcrm.dao;

import ces.augusto108.springcrm.entities.Customer;
import lombok.AllArgsConstructor;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@AllArgsConstructor
public class CustomerDAOImpl implements CustomerDAO {
    private final SessionFactory sessionFactory;

    @Override
    public Customer getCustomer(int id) {
        return (Customer) sessionFactory
                .getCurrentSession()
                .createQuery("from Customer c where id = :id")
                .setParameter("id", id)
                .getSingleResult();
    }

    @Override
    public List<Customer> getCustomers() {
        return sessionFactory
                .getCurrentSession()
                .createQuery("from Customer order by first_name", Customer.class)
                .getResultList();
    }

    @Override
    public void saveCustomer(Customer customer) {
        sessionFactory.getCurrentSession().save(customer);
    }
}
