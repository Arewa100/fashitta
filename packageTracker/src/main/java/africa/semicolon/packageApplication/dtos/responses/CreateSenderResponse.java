package africa.semicolon.packageApplication.dtos.responses;


import lombok.Data;

@Data
public class CreateSenderResponse {
    private String senderFullName;
    private String senderPhoneNumber;
}
