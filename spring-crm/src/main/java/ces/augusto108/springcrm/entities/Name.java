package ces.augusto108.springcrm.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

@Embeddable
@Getter
@Setter
public class Name {
    @NotNull(message = "this is required")
    @Column(name = "first_name")
    private String firstName;

    @NotNull(message = "this is required")
    @Column(name = "last_name")
    private String lastName;

    @Override
    public String toString() {
        return firstName + " " + lastName;
    }
}
