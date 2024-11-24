package africa.semicolon.packageApplication.data.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class Sender {
    private String senderName;
    private String senderPhoneNumber;
    @Id
    private String id;
}
