package com.example.SpringBootCRUD.controler;

import com.example.SpringBootCRUD.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class HomePage {

    @GetMapping("/")
    public String welcome(@RequestParam(value = "name", defaultValue = "World", required = true) String name, Model model){
        model.addAttribute("name", name);
        return "home-page";
    }
}
