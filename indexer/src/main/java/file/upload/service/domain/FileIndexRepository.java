package file.upload.service.domain;

import file.upload.service.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(
    collectionResourceRel = "fileIndices",
    path = "fileIndices"
)
public interface FileIndexRepository
    extends PagingAndSortingRepository<FileIndex, String> {}
