package ILenguage.user.contracts.commands;
import lombok.Value;
import org.axonframework.modelling.command.TargetAggregateIdentifier;

@Value
public class RegisterUser {
    @TargetAggregateIdentifier
    private String userId;
    private String firstName;
    private String lastName;
    private String dni;
    private Instant occurredOn;
}
