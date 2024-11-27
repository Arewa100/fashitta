package africa.semicolon.packageApplication.data.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Data
@Document
public class Package {
    private String packageName;
    private String description;
    @DBRef
    private Receiver receiverId;
    @DBRef
    private Sender senderId;
    private LocalDateTime createdAt = LocalDateTime.now();
    @Id
    private String id;
    private BigDecimal deliveryFee = new BigDecimal(0);
    private int quantity;
}
