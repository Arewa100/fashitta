package africa.semicolon.packageApplication.dtos.requests;

import lombok.Data;

@Data
public class CreateTrackingLogRequest {
    private String id;
    private String description;
    private String TrackingNumber;
}
