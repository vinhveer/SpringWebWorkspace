package org.vinhveer.productcruddemo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test")
public class ProductAppController {
    public String index() {
        return "index";
    }
}
