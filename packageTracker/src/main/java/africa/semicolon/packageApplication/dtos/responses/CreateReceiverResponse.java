package africa.semicolon.packageApplication.dtos.responses;

import lombok.Data;

@Data
public class CreateReceiverResponse {
    private String address;
    private String phoneNumber;
    private String fullName;
}
