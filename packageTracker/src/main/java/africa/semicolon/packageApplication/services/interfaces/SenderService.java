package africa.semicolon.packageApplication.services.interfaces;

import africa.semicolon.packageApplication.dtos.requests.CreateSenderRequest;
import africa.semicolon.packageApplication.dtos.responses.CreateSenderResponse;

public interface SenderService {
    CreateSenderResponse createSender(CreateSenderRequest createSenderRequest);
}
