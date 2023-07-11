package file.upload.service.domain;

import file.upload.service.domain.*;
import file.upload.service.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class FileLocationIndexed extends AbstractEvent {

    private String fileName;
    private String filePath;

    public FileLocationIndexed(FileIndex aggregate) {
        super(aggregate);
    }

    public FileLocationIndexed() {
        super();
    }
}
