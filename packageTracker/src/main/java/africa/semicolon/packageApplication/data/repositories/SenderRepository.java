package africa.semicolon.packageApplication.data.repositories;

import africa.semicolon.packageApplication.data.models.Sender;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SenderRepository extends MongoRepository<Sender, String> {
}
