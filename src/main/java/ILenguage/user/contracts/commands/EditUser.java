package ILenguage.user.contracts.commands;

import lombok.Value;
import org.axonframework.modelling.command.TargetAggregateIdentifier;

import java.math.BigDecimal;

@Value
public class EditUser {
    @TargetAggregateIdentifier
    private String userId;
    private String firstName;
    private String lastName;
    private String dni;
}