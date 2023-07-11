package file.upload.service.domain;

import file.upload.service.IndexerApplication;
import file.upload.service.domain.FileLocationIndexed;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "FileIndex_table")
@Data
public class FileIndex {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String fileName;

    private String filePath;

    @PostPersist
    public void onPostPersist() {
        FileLocationIndexed fileLocationIndexed = new FileLocationIndexed(this);
        fileLocationIndexed.publishAfterCommit();
    }

    @PrePersist
    public void onPrePersist() {}

    public static FileIndexRepository repository() {
        FileIndexRepository fileIndexRepository = IndexerApplication.applicationContext.getBean(
            FileIndexRepository.class
        );
        return fileIndexRepository;
    }
}
