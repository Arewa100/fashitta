package africa.semicolon.packageApplication.dtos.requests;

import africa.semicolon.packageApplication.data.models.Package;
import lombok.Data;

import java.time.LocalDateTime;
@Data
public class CreateTrackLogRequest {
    private String description;
    private String TrackingNumber;
    private Package newPackage;
}
