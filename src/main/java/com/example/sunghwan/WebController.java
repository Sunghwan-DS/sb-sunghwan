package com.example.sunghwan;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WebController {
    @GetMapping("/")
    @ResponseBody
    public String main() {
        return "<a href=\"https://infoq.com\">infoq.com</a>";
    }
}
