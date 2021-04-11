package me.uwahan;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UwahanController {

    @GetMapping("/lol")
    public String lol() {
        return "바텀이 서폿이 8할이다.";
    }
}
