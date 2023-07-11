package file.upload.service.domain;

import file.upload.service.domain.*;
import file.upload.service.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class VideoFileUploaded extends AbstractEvent {

    private String fileName;
    private String streamUrl;

    public VideoFileUploaded(Video aggregate) {
        super(aggregate);
    }

    public VideoFileUploaded() {
        super();
    }
}
