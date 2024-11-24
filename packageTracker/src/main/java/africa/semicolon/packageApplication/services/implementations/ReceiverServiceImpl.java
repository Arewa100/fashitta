package africa.semicolon.packageApplication.services.implementations;

import africa.semicolon.packageApplication.data.models.Receiver;
import africa.semicolon.packageApplication.data.repositories.ReceiverRepository;
import africa.semicolon.packageApplication.dtos.requests.CreateReceiverRequest;
import africa.semicolon.packageApplication.dtos.responses.CreateReceiverResponse;
import africa.semicolon.packageApplication.services.interfaces.ReceiverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static africa.semicolon.packageApplication.utils.mappers.mapper.*;

@Service
public class ReceiverServiceImpl implements ReceiverService {
    @Autowired
    private ReceiverRepository receiverRepository;

    @Override
    public CreateReceiverResponse createReceiver(CreateReceiverRequest createReceiverRequest) {
        Receiver receiver = new Receiver();
        receiverRequestMap(receiver, createReceiverRequest);
        receiverRepository.save(receiver);
        CreateReceiverResponse createReceiverResponse = new CreateReceiverResponse();
        receiverResponseMapper(receiver, createReceiverResponse);
        return createReceiverResponse;
    }

}
