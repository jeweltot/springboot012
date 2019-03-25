package me.jeweltot.springboot012.work;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WorkController
{
    @Autowired
    WorkService workService;

    @GetMapping("/work")
    public String getNow() {
        String now = workService.getNow();
        return workService.getNow();
    }
}
