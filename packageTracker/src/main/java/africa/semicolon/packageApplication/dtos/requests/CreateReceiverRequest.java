package africa.semicolon.packageApplication.dtos.requests;

import lombok.Data;

@Data
public class CreateReceiverRequest {
    private String phoneNumber;
    private String address;
    private String id;
    private String fullName;
}
