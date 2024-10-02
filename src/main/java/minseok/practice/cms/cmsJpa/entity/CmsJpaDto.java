package minseok.practice.cms.cmsJpa.entity;

import lombok.*;

@ToString
@Getter
@Setter
@Builder
@AllArgsConstructor
public class CmsJpaDto {
    private Long jpaSeq;
    private String title;

    public CmsJpaDto(){}

}
