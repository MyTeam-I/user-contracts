package ILenguage.user.contracts.events;

import lombok.Value;
import java.time.Instant;

@Value
public class UserRegistered {
    private String userId;
    private String firstName;
    private String lastName;
    private String dni;
    private Instant occurredOn;
}
