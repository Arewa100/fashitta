package africa.semicolon.packageApplication.utils.mappers;

import africa.semicolon.packageApplication.data.models.Receiver;
import africa.semicolon.packageApplication.data.models.Sender;
import africa.semicolon.packageApplication.data.models.TrackingLog;
import africa.semicolon.packageApplication.dtos.requests.CreateReceiverRequest;
import africa.semicolon.packageApplication.dtos.requests.CreateSenderRequest;
import africa.semicolon.packageApplication.dtos.requests.CreateTrackLogRequest;
import africa.semicolon.packageApplication.dtos.responses.CreateReceiverResponse;
import africa.semicolon.packageApplication.dtos.responses.CreateSenderResponse;
import africa.semicolon.packageApplication.dtos.responses.CreateTrackLogResponse;

public class mapper {
    public static CreateReceiverResponse map(Receiver receiver) {
        CreateReceiverResponse createReceiverResponse = new CreateReceiverResponse();
        createReceiverResponse.setFullName(receiver.getFullName());
        createReceiverResponse.setAddress(receiver.getAddress());
        createReceiverResponse.setPhoneNumber(receiver.getPhoneNumber());
        return createReceiverResponse;
    }

    public static Receiver  map(CreateReceiverRequest createReceiverRequest) {
        Receiver receiver = new Receiver();
        receiver.setAddress(createReceiverRequest.getAddress());
        receiver.setFullName(createReceiverRequest.getFullName());
        receiver.setPhoneNumber(createReceiverRequest.getPhoneNumber());
        receiver.setId(createReceiverRequest.getFullName());
        return receiver;
    }

    public static Sender map(CreateSenderRequest createSenderRequest) {
        Sender newSender = new Sender();
        newSender.setSenderName(createSenderRequest.getSenderName());
        newSender.setSenderPhoneNumber(createSenderRequest.getSenderPhoneNumber());
        return newSender;
    }

    public static CreateSenderResponse map(Sender sender) {
        CreateSenderResponse createSenderResponse = new CreateSenderResponse();
        createSenderResponse.setSenderFullName(sender.getSenderName());
        createSenderResponse.setSenderPhoneNumber(sender.getSenderPhoneNumber());
        return createSenderResponse;
    }

    public static TrackingLog map(CreateTrackLogRequest createTrackLogRequest) {
        TrackingLog trackingLog = new TrackingLog();
        trackingLog.setTrackingNumber(createTrackLogRequest.getTrackingNumber());
        trackingLog.setDescription(createTrackLogRequest.getDescription());
        trackingLog.setThePackage(createTrackLogRequest.getNewPackage());;
        return trackingLog;
    }

    public static CreateTrackLogResponse map(TrackingLog trackingLog) {
        CreateTrackLogResponse createTrackLogResponse = new CreateTrackLogResponse();
        createTrackLogResponse.setTrackingNumber(trackingLog.getTrackingNumber());
        createTrackLogResponse.setTrackingDescription(trackingLog.getDescription());
        createTrackLogResponse.setTrackingDate(String.valueOf(trackingLog.getTrackingDate()));
        return createTrackLogResponse;
    }
}
