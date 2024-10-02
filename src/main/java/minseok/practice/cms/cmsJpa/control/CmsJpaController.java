package minseok.practice.cms.cmsJpa.control;

import jakarta.annotation.Resource;
import minseok.practice.cms.cmsJpa.entity.CmsJpaDto;
import minseok.practice.cms.cmsJpa.service.CmsJpaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * jpa 테스트 용 controller
 * cms
 *
 * @author cms
 * @version 1.0
 * @see <pre>
 *  Modification Information
 *
 * 	수정일     / 수정자   / 수정내용
 * 	------------------------------------------
 * 	2024-10-02 / cms  / 최초 생성
 *
 * </pre>
 * @since 2024-10-02 */
@RestController
@RequestMapping("/api/jpa")
public class CmsJpaController {

    @Resource(name = "cmsJpaService")
    private CmsJpaService cmsJpaService;

    @GetMapping("/main")
    public Map<String,?> main() {
        return Map.of("main","ok");
    }

    /**
     * 간단한 테스트를 위한 JPA find one Mapping
     * @param jpaSeq
     * @return
     * @throws Exception
     */
    @GetMapping("/jpa/find/{jpaSeq}")
    public ResponseEntity<CmsJpaDto> jpafind(@PathVariable("jpaSeq") Long jpaSeq) throws Exception {
        CmsJpaDto cmsJpaDto = cmsJpaService.getByJpaSeq(jpaSeq);

        if(cmsJpaDto != null){
            return ResponseEntity.ok(cmsJpaDto);
        }
        return ResponseEntity.notFound().build();
    }

    /**
     * 간단한 테스트를 위한 QueryDSL find all Mapping
     * @return Map<String,?>
     * @throws Exception
     */
    @GetMapping("/dsl/find")
    public ResponseEntity<List<CmsJpaDto>> dslFind() throws Exception {
        return ResponseEntity.ok(cmsJpaService.getList());
    }
}
