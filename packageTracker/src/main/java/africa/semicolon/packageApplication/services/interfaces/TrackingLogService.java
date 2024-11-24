package africa.semicolon.packageApplication.services.interfaces;

import africa.semicolon.packageApplication.dtos.requests.CreateTrackLogRequest;
import africa.semicolon.packageApplication.dtos.responses.CreateTrackLogResponse;

public interface TrackingLogService {
    CreateTrackLogResponse createTrackingLog(CreateTrackLogRequest createTrackLogRequest);
}
