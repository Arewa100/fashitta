package africa.semicolon.packageApplication.data.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;


@Data
@Document
public class TrackingLog {
    @Id
    private String id;
    private String description;
    private String TrackingNumber;
    private LocalDateTime TrackingDate = LocalDateTime.now();
    @DBRef
    private Package thePackage;
}
