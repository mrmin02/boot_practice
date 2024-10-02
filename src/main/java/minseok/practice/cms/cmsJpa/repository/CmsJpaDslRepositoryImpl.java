package minseok.practice.cms.cmsJpa.repository;

import com.querydsl.jpa.impl.JPAQueryFactory;
import minseok.practice.cms.cmsJpa.entity.CmsJpaEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

import static minseok.practice.cms.cmsJpa.entity.QCmsJpaEntity.cmsJpaEntity;

@Repository
public class CmsJpaDslRepositoryImpl implements CmsJpaDslRepository {

    @Autowired
    private JPAQueryFactory factory;

    @Override
    public List<CmsJpaEntity> findAll() throws Exception {
        return factory.select(cmsJpaEntity).from(cmsJpaEntity).fetch();
    }
}
