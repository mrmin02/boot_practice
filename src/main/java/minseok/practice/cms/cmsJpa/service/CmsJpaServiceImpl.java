package minseok.practice.cms.cmsJpa.service;

import minseok.practice.cms.cmsJpa.entity.CmsJpaDto;
import minseok.practice.cms.cmsJpa.entity.CmsJpaEntity;
import minseok.practice.cms.cmsJpa.repository.CmsJpaDslRepository;
import minseok.practice.cms.cmsJpa.repository.CmsJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service("cmsJpaService")
public class CmsJpaServiceImpl implements CmsJpaService {

    @Autowired
    CmsJpaDslRepository cmsJpaDslRepository;

    @Autowired
    CmsJpaRepository cmsJpaRepository;

    /**
     * QueryDSL get List ( 전체 )
     * @return List<CmsJpaDto>
     * @throws Exception
     */
    @Override
    public List<CmsJpaDto> getList() throws Exception{
        // 데이터 가공이 필요없어 VO 말고 DTO 로 형변환 하여 전달
        return cmsJpaDslRepository.findAll().stream()
                .map(entity -> CmsJpaDto.builder()
                        .jpaSeq(entity.getJpaSeq())
                        .title(entity.getTitle())
                        .build())
                .collect(Collectors.toList());
    }

    /**
     * jpa 를 사용한 단일 row select
     * @param jpaSeq
     * @return
     * @throws Exception
     */
    @Override
    public CmsJpaDto getByJpaSeq(Long jpaSeq) throws Exception {
        CmsJpaEntity entity = cmsJpaRepository.findByJpaSeq(jpaSeq);

        if(entity != null){
            return CmsJpaDto.builder().jpaSeq(entity.getJpaSeq()).title(entity.getTitle()).build();
        }

        return null;
    }
}
