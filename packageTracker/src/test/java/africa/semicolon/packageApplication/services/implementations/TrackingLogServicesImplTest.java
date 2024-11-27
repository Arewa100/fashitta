package africa.semicolon.packageApplication.services.implementations;


import africa.semicolon.packageApplication.data.models.Package;
import africa.semicolon.packageApplication.data.repositories.PackageRepository;
import africa.semicolon.packageApplication.data.repositories.TrackingLogRepo;
import africa.semicolon.packageApplication.dtos.requests.CreateTrackLogRequest;
import africa.semicolon.packageApplication.services.interfaces.TrackingLogService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

@SpringBootTest
public class TrackingLogServicesImplTest {
    @Autowired
    private TrackingLogService trackingLogService;

    @Autowired
    private TrackingLogRepo trackingLogRepo;

    @Autowired
    private PackageRepository packageRepo;

    @Test
    public void testToCreateATrackingLog_CountIsOne() {
        CreateTrackLogRequest createTrackLogRequest = new CreateTrackLogRequest();
        Package newPackage = new Package();
        packageRepo.save(newPackage);
        createTrackLogRequest.setNewPackage(newPackage);
        createTrackLogRequest.setTrackingNumber("2222");
        createTrackLogRequest.setDescription("currently in our warehouse, Sabo, Lagos");
        trackingLogService.createTrackingLog(createTrackLogRequest);
        assertThat(trackingLogRepo.count(), is(1L));

    }
}