package ILenguage.user.contracts.commands;
import lombok.Value;
import org.axonframework.modelling.command.TargetAggregateIdentifier;

import java.time.Instant;

@Value
public class RegisterUser {
    @TargetAggregateIdentifier
    private String userId;
    private String firstName;
    private String lastName;
    private String dni;
    private Instant occurredOn;
}
