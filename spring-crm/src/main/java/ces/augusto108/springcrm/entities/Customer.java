package ces.augusto108.springcrm.entities;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
@Getter
@Setter
@EqualsAndHashCode(callSuper = true, of = {})
public class Customer extends BaseEntity {
    private Name name;

    @Column(unique = true)
    private String email;

    @Override
    public String toString() {
        return name + " (" + email + ")";
    }
}
