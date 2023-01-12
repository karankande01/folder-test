package com.shoes.controller;

import com.shoes.model.Contact;
import com.shoes.model.NewsLetter;
import com.shoes.service.CommonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ShoeLaceController {

    @Autowired
    private CommonService commonService;

    @GetMapping("/")
    public String homepage(Model model){
        model.addAttribute("contact",new Contact());
        model.addAttribute("news",new NewsLetter());
        return "index";
    }

    @GetMapping("/contact")
    public String contactPage(Model model){
        model.addAttribute("contact",new Contact());
        model.addAttribute("news",new NewsLetter());
        return "contact";
    }

    @GetMapping("/shoes")
    public String shoesPage(Model model){
        model.addAttribute("news",new NewsLetter());
        return "shoes";
    }

    @GetMapping("/racing_boots")
    public String racingBootsPage(Model model){
        model.addAttribute("news",new NewsLetter());
        return "racing_boots";
    }

    @GetMapping("/collection")
    public String collectionPage(Model model){
        model.addAttribute("news",new NewsLetter());
        return "collection";
    }

    @GetMapping("/dashboard")
    public String dashboarad(Model model){
        model.addAttribute("ContactList",commonService.getAllContact());
        return "dashboard";
    }

    @PostMapping("/saveContact")
    public String saveContact(@ModelAttribute Contact contact){
        commonService.saveContact(contact);
        return "redirect:/";
    }

    @PostMapping("/saveNews")
    public String saveNews(@ModelAttribute NewsLetter newsLetter){
        commonService.saveNews(newsLetter);
        return "redirect:/";
    }

    @GetMapping("/deleteContact/{id}")
    public String deleteContact(@PathVariable("id") Long id){
        commonService.deleteContact(id);
        return "redirect:/dashboard";
    }
}
