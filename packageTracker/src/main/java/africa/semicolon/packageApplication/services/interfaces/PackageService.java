package africa.semicolon.packageApplication.services.interfaces;

import africa.semicolon.packageApplication.dtos.requests.CreatePackageRequest;
import africa.semicolon.packageApplication.dtos.responses.CreatePackageResponse;

public interface PackageService {
    CreatePackageResponse createPackage(CreatePackageRequest createPackageRequest);
}
