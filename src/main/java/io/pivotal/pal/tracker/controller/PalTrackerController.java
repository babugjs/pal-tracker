package io.pivotal.pal.tracker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PalTrackerController {

    @GetMapping ("/")
        public String sayHello(){
        return "hello";
        }
}
