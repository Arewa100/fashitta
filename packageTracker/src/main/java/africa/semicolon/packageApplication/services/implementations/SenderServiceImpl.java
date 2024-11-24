package africa.semicolon.packageApplication.services.implementations;

import africa.semicolon.packageApplication.data.repositories.SenderRepository;
import africa.semicolon.packageApplication.dtos.requests.CreateSenderRequest;
import africa.semicolon.packageApplication.dtos.responses.CreateSenderResponse;
import africa.semicolon.packageApplication.services.interfaces.SenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SenderServiceImpl implements SenderService {
    @Autowired
    private SenderRepository senderRepository;

    @Override
    public CreateSenderResponse createReceiver(CreateSenderRequest createSenderRequest) {
        return null;
    }
}
