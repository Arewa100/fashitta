package africa.semicolon.packageApplication.utils.mappers;

import africa.semicolon.packageApplication.data.models.Receiver;
import africa.semicolon.packageApplication.dtos.requests.CreateReceiverRequest;
import africa.semicolon.packageApplication.dtos.responses.CreateReceiverResponse;

public class mapper {
    public static void receiverResponseMapper(Receiver receiver, CreateReceiverResponse createReceiverResponse) {
        createReceiverResponse.setFullName(receiver.getFullName());
        createReceiverResponse.setAddress(receiver.getAddress());
        createReceiverResponse.setPhoneNumber(receiver.getPhoneNumber());
    }

    public static void receiverRequestMap(Receiver receiver, CreateReceiverRequest createReceiverRequest) {
        receiver.setAddress(createReceiverRequest.getAddress());
        receiver.setFullName(createReceiverRequest.getFullName());
        receiver.setPhoneNumber(createReceiverRequest.getPhoneNumber());
        receiver.setId(createReceiverRequest.getFullName());
    }
}
