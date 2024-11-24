package africa.semicolon.packageApplication.data.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class Receiver {
    private String phoneNumber;
    private String address;
    @Id
    private String id;
    private String fullName;
}
