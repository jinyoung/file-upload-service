package file.upload.service.domain;

import file.upload.service.domain.*;
import file.upload.service.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class FileUploadStatusDisplayed extends AbstractEvent {

    private String fileName;
    private Integer fileSize;
    private Boolean isIndexed;
    private Boolean isUploaded;
    private String videoUrl;

    public FileUploadStatusDisplayed(FileUploadStatus aggregate) {
        super(aggregate);
    }

    public FileUploadStatusDisplayed() {
        super();
    }
}
