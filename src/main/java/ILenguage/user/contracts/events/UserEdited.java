package ILenguage.user.contracts.events;

import lombok.Value;

import java.math.BigDecimal;
import java.time.Instant;

@Value
public class UserEdited {
    private String userId;
    private String firstName;
    private String lastName;
    private String dni;
    private Instant occurredOn;
}