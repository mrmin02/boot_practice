package minseok.practice.cms.cmsJpa.repository;

import minseok.practice.cms.cmsJpa.entity.CmsJpaEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CmsJpaDslRepository {

    List<CmsJpaEntity> findAll() throws Exception;
}
