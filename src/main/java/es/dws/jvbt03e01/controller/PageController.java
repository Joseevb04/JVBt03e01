package es.dws.jvbt03e01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

    @GetMapping({"/", "/home"})
    public String showHome() {
        return "indexView";
    }

    @GetMapping("/palmares")
    public String showPalmares() {
        return "palmaresView";
    }

    @GetMapping("/galeria")
    public String showGallery() {
        return "photoGalleryView";
    }

}
