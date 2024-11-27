package africa.semicolon.packageApplication.services.implementations;

import africa.semicolon.packageApplication.data.models.TrackingLog;
import africa.semicolon.packageApplication.data.repositories.TrackingLogRepo;
import africa.semicolon.packageApplication.dtos.requests.CreateTrackLogRequest;
import africa.semicolon.packageApplication.dtos.responses.CreateTrackLogResponse;
import africa.semicolon.packageApplication.services.interfaces.TrackingLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static africa.semicolon.packageApplication.utils.mappers.mapper.map;

@Service
public class TrackingLogServicesImpl implements TrackingLogService {
    @Autowired
    private TrackingLogRepo trackingLogRepo;

    @Override
    public CreateTrackLogResponse createTrackingLog(CreateTrackLogRequest createTrackLogRequest) {
        TrackingLog trackingLog = map(createTrackLogRequest);
        trackingLogRepo.save(trackingLog);
        return map(trackingLog);
    }

}
