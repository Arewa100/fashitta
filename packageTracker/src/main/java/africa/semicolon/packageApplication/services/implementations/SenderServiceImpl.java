package africa.semicolon.packageApplication.services.implementations;

import africa.semicolon.packageApplication.data.models.Sender;
import africa.semicolon.packageApplication.data.repositories.SenderRepository;
import africa.semicolon.packageApplication.dtos.requests.CreateSenderRequest;
import africa.semicolon.packageApplication.dtos.responses.CreateSenderResponse;
import africa.semicolon.packageApplication.services.interfaces.SenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static africa.semicolon.packageApplication.utils.mappers.mapper.map;

@Service
public class SenderServiceImpl implements SenderService {
    @Autowired
    private SenderRepository senderRepository;

    @Override
    public CreateSenderResponse createSender(CreateSenderRequest createSenderRequest) {
        Sender sender = map(createSenderRequest);
        senderRepository.save(sender);
        return map(sender);
    }

}
