package minseok.practice.cms.main.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;
import java.util.Objects;

@RestController
@RequestMapping(value = "/api/main")
public class MainController {

    @RequestMapping(value = "/init" ,method = {RequestMethod.GET})
    public Map<String, ?> init() throws Exception{

        return Map.of("test","main");
    }
}
