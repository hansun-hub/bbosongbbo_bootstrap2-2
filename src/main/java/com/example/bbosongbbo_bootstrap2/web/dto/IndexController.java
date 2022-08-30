package com.example.bbosongbbo_bootstrap2.web.dto;

import com.example.bbosongbbo_bootstrap2.services.posts.PostsService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@Controller
public class IndexController {

    private final PostsService postsService;


    @GetMapping("/")
    public String index(Model model) {
        return "index";
    }

    @GetMapping("/tables")
    public String tables(Model model) {
        model.addAttribute("posts",postsService.findAllDesc());
        return "tables";
    }

    @GetMapping("/posts/save")
    public String postsSave() {
        return "posts-save";
    }


}
