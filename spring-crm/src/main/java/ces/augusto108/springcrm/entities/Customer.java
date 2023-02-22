package ces.augusto108.springcrm.entities;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "customer")
@Getter
@Setter
@EqualsAndHashCode(callSuper = true, of = {})
public class Customer extends BaseEntity {
    @Valid
    private Name name;

    @NotNull(message = "this is required")
    @Column(unique = true)
    private String email;

    @Override
    public String toString() {
        return name + " (" + email + ")";
    }
}
