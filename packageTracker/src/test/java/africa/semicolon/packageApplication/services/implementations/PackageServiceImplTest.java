package africa.semicolon.packageApplication.services.implementations;

import africa.semicolon.packageApplication.data.models.TrackingLog;
import africa.semicolon.packageApplication.data.repositories.PackageRepository;
import africa.semicolon.packageApplication.dtos.requests.CreatePackageRequest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

@SpringBootTest
public class PackageServiceImplTest {
    @Autowired
    private PackageServiceImpl packageService;

    @Autowired
    private PackageRepository packageRepository;

    @BeforeEach
    public void setUp() {
        packageRepository.deleteAll();
    }
    @Test
    public void testToCreateAPackage_PackageRepository_IsOne() {
        CreatePackageRequest request = new CreatePackageRequest();
        request.setPackageName("television");
        request.setDescription("this is a 23inches lg TV");
        request.setDeliveryFee(new BigDecimal(20000));
        request.setQuantity(20);
        request.setTrackingLog(new TrackingLog());
        packageService.createPackage(request);
        assertThat(packageRepository.count(), is(1L));
    }

}