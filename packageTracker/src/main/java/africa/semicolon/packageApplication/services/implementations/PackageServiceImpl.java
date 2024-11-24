package africa.semicolon.packageApplication.services.implementations;

import africa.semicolon.packageApplication.data.models.Package;
import africa.semicolon.packageApplication.data.models.Receiver;
import africa.semicolon.packageApplication.data.repositories.PackageRepository;
import africa.semicolon.packageApplication.dtos.requests.CreatePackageRequest;
import africa.semicolon.packageApplication.dtos.responses.CreatePackageResponse;
import africa.semicolon.packageApplication.services.interfaces.PackageService;
import africa.semicolon.packageApplication.services.interfaces.ReceiverService;
import africa.semicolon.packageApplication.services.interfaces.SenderService;
import com.sun.jdi.connect.spi.TransportService;
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
    private TrackingLogServicesImpl trackingLogServices;


    @Override
    public CreatePackageResponse createPackage(CreatePackageRequest createPackageRequest) {
        Package newPackage = new Package();

        newPackage.setPackageName(createPackageRequest.getPackageName());
        newPackage.setDescription(createPackageRequest.getDescription());
        newPackage.setQuantity(createPackageRequest.getQuantity());
        newPackage.setDeliveryFee(createPackageRequest.getDeliveryFee());
//        newPackage.setTrackingLogList(createPackageRequest.getTrackingLog());
//        newPackage.setReceiverId(createPackageRequest.getReceiverId());
//        newPackage.setSenderId(createPackageRequest.getSenderId());

        packageRepository.save(newPackage);
        CreatePackageResponse response = new CreatePackageResponse();
        return response;
    }
}
