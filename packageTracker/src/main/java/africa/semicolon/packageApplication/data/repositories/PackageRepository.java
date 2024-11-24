package africa.semicolon.packageApplication.data.repositories;

import africa.semicolon.packageApplication.data.models.Package;
import africa.semicolon.packageApplication.data.models.TrackingLog;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public interface PackageRepository extends MongoRepository<Package, String> {
}
