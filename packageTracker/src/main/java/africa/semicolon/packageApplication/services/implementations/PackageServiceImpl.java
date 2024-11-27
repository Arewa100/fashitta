package africa.semicolon.packageApplication.services.implementations;

import africa.semicolon.packageApplication.data.models.Package;
import africa.semicolon.packageApplication.data.repositories.PackageRepository;
import africa.semicolon.packageApplication.dtos.requests.CreatePackageRequest;
import africa.semicolon.packageApplication.dtos.responses.CreatePackageResponse;
import africa.semicolon.packageApplication.services.interfaces.PackageService;
import africa.semicolon.packageApplication.services.interfaces.ReceiverService;
import africa.semicolon.packageApplication.services.interfaces.SenderService;
import africa.semicolon.packageApplication.services.interfaces.TrackingLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PackageServiceImpl implements PackageService {
    @Autowired
    private PackageRepository packageRepository;
    @Autowired
    private ReceiverService receiverService;
    @Autowired
    private SenderService senderService;
    @Autowired
    private TrackingLogService trackingLogServices;


    @Override
    public CreatePackageResponse createPackage(CreatePackageRequest createPackageRequest) {
        Package newPackage = new Package();
        createPackageRequest.setPackageName(newPackage.getPackageName());
        packageRepository.save(newPackage);
        return new CreatePackageResponse();
    }
}
