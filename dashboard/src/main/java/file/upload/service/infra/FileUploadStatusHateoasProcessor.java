package file.upload.service.infra;

import file.upload.service.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class FileUploadStatusHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<FileUploadStatus>> {

    @Override
    public EntityModel<FileUploadStatus> process(
        EntityModel<FileUploadStatus> model
    ) {
        return model;
    }
}
