package africa.semicolon.packageApplication.dtos.requests;

import africa.semicolon.packageApplication.data.models.Receiver;
import africa.semicolon.packageApplication.data.models.Sender;
import africa.semicolon.packageApplication.data.models.TrackingLog;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Data
public class CreatePackageRequest {
    private String packageName;
    private String description;
    private Receiver receiverId;
    private TrackingLog trackingLog;
    private Sender senderId;
    private String id;
    private BigDecimal deliveryFee = new BigDecimal(0);
    private int quantity;
}
