package minseok.practice.cms.cmsJpa.repository;

import minseok.practice.cms.cmsJpa.entity.CmsJpaEntity;

import java.util.List;

public interface CmsJpaRepository extends org.springframework.data.jpa.repository.JpaRepository<CmsJpaEntity,Long> {

    CmsJpaEntity findByJpaSeq(Long jpaSeq);
}
