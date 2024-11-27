package africa.semicolon.packageApplication.dtos.requests;

import lombok.Data;

@Data
public class CreateSenderRequest {
    private String senderName;
    private String senderPhoneNumber;
}
