package africa.semicolon.packageApplication.dtos.responses;

import lombok.Data;

@Data
public class CreateTrackLogResponse {
    private String trackingDescription;
    private String trackingDate;
    private String trackingNumber;
}
