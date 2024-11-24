package africa.semicolon.packageApplication.data.repositories;

import africa.semicolon.packageApplication.data.models.Receiver;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReceiverRepository extends MongoRepository<Receiver, String> {
}
