package minseok.practice.cms.cmsJpa.entity;

import jakarta.persistence.*;
import lombok.Getter;

@Getter
@Entity
@Table(name = "tb_jpa")
public class CmsJpaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "jpa_seq")
    private Long jpaSeq;

    @Column(length = 50)
    private String title;
}
