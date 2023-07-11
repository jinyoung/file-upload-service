package file.upload.service.domain;

import file.upload.service.DashboardApplication;
import file.upload.service.domain.FileUploadStatusDisplayed;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "FileUploadStatus_table")
@Data
public class FileUploadStatus {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String fileName;

    private Integer fileSize;

    private Boolean isIndexed;

    private Boolean isUploaded;

    private String videoUrl;

    @PostPersist
    public void onPostPersist() {
        FileUploadStatusDisplayed fileUploadStatusDisplayed = new FileUploadStatusDisplayed(
            this
        );
        fileUploadStatusDisplayed.publishAfterCommit();
    }

    @PrePersist
    public void onPrePersist() {}

    public static FileUploadStatusRepository repository() {
        FileUploadStatusRepository fileUploadStatusRepository = DashboardApplication.applicationContext.getBean(
            FileUploadStatusRepository.class
        );
        return fileUploadStatusRepository;
    }
}
