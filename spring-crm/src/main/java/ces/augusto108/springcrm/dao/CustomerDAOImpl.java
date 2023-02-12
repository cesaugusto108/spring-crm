package ces.augusto108.springcrm.dao;

import ces.augusto108.springcrm.entities.Customer;
import lombok.AllArgsConstructor;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@AllArgsConstructor
public class CustomerDAOImpl implements CustomerDAO {
    private final SessionFactory sessionFactory;

    @Transactional
    @Override
    public Customer getCustomer(int id) {
        return (Customer) sessionFactory
                .getCurrentSession()
                .createQuery("from Customer c where id = :id")
                .setParameter("id", id)
                .getSingleResult();
    }

    @Transactional
    @Override
    public List<Customer> getCustomers() {
        return sessionFactory
                .getCurrentSession()
                .createQuery("from Customer", Customer.class)
                .getResultList();
    }
}
