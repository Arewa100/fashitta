package africa.semicolon.packageApplication.dtos.requests;

import lombok.Data;

import java.time.LocalDateTime;
@Data
public class CreateTrackLogRequest {
    private String description;
    private String TrackingNumber;
//    private LocalDateTime TrackingDate = LocalDateTime.now();
}
