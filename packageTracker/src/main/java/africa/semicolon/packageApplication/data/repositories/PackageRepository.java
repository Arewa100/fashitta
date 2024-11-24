package africa.semicolon.packageApplication.data.repositories;

import africa.semicolon.packageApplication.data.models.Package;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PackageRepository extends MongoRepository<Package, String> {
}
