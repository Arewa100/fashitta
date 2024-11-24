package africa.semicolon.packageApplication.services.implementations;

import africa.semicolon.packageApplication.data.repositories.ReceiverRepository;
import africa.semicolon.packageApplication.dtos.requests.CreateReceiverRequest;
import africa.semicolon.packageApplication.dtos.responses.CreateReceiverResponse;
import africa.semicolon.packageApplication.services.interfaces.ReceiverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReceiverServiceImpl implements ReceiverService {
    @Autowired
    private ReceiverRepository receiverRepository;

    @Override
    public CreateReceiverResponse createReceiver(CreateReceiverRequest createReceiverRequest) {
        return null;
    }
}
