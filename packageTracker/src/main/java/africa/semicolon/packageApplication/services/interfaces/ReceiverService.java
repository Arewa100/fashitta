package africa.semicolon.packageApplication.services.interfaces;

import africa.semicolon.packageApplication.dtos.requests.CreateReceiverRequest;
import africa.semicolon.packageApplication.dtos.responses.CreateReceiverResponse;

public interface ReceiverService {
    CreateReceiverResponse createReceiver(CreateReceiverRequest createReceiverRequest);
}
