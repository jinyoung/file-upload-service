package file.upload.service.domain;

import file.upload.service.VideoProcessingApplication;
import file.upload.service.domain.VideoFileUploaded;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Video_table")
@Data
public class Video {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String fileName;

    private String streamUrl;

    @PostPersist
    public void onPostPersist() {
        VideoFileUploaded videoFileUploaded = new VideoFileUploaded(this);
        videoFileUploaded.publishAfterCommit();
    }

    @PrePersist
    public void onPrePersist() {}

    public static VideoRepository repository() {
        VideoRepository videoRepository = VideoProcessingApplication.applicationContext.getBean(
            VideoRepository.class
        );
        return videoRepository;
    }
}
