package africa.semicolon.packageApplication.data.repositories;

import africa.semicolon.packageApplication.data.models.TrackingLog;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrackingLogRepo extends MongoRepository<TrackingLog, String> {
}
