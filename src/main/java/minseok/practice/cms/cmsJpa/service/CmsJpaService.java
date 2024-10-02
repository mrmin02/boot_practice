package minseok.practice.cms.cmsJpa.service;

import minseok.practice.cms.cmsJpa.entity.CmsJpaDto;

import java.util.List;

public interface CmsJpaService {

    List<CmsJpaDto> getList() throws Exception;

    CmsJpaDto getByJpaSeq(Long jpaSeq) throws Exception;
}
