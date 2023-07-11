package file.upload.service.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Data
public class SendNotificationCommand {

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private String notificationMessage;
}
