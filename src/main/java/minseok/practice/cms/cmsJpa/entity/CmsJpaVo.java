package minseok.practice.cms.cmsJpa.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
@AllArgsConstructor
public class CmsJpaVo {
    private Long jpaSeq;
    private String title;

    public CmsJpaVo(){}
}
