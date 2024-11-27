package africa.semicolon.packageApplication.services.implementations;

import africa.semicolon.packageApplication.data.repositories.PackageRepository;
import africa.semicolon.packageApplication.dtos.requests.CreatePackageRequest;
import africa.semicolon.packageApplication.services.interfaces.PackageService;
import africa.semicolon.packageApplication.services.interfaces.TrackingLogService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

@SpringBootTest
public class PackageServiceImplTest {
    @Autowired
    private PackageService packageService;

    @Autowired
    private PackageRepository packageRepository;

    @Autowired
    private TrackingLogService trackingLogService;

    @BeforeEach
    public void setUp() {
        packageRepository.deleteAll();
    }
    @Test
    public void testToAddAPackage_PackageRepository_IsOne() {
        CreatePackageRequest request = new CreatePackageRequest();
        request.setPackageName("television");
        request.setPackageDescription("this is a 23 inches lg TV");
        request.setDeliveryFee(new BigDecimal(20000));
        request.setQuantity(20);
        packageService.createPackage(request);
        assertThat(packageRepository.count(), is(1L));
    }


}