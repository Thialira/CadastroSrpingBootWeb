package com.appcadastro.cadastro;

import org.apache.catalina.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

    @GetMapping("/cadastro")
    public String showForm() {
        return "cadastro";
    }

    @PostMapping("/cadastro")
    public String submitForm(@ModelAttribute User user, Model model) {
        model.addAttribute("user", user);
        return "resultado";
    }

}
