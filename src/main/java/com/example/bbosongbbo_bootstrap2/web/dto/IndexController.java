package com.example.bbosongbbo_bootstrap2.web.dto;

import com.example.bbosongbbo_bootstrap2.domain.posts.Posts;
import com.example.bbosongbbo_bootstrap2.services.posts.PostsService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@RequiredArgsConstructor
@Controller
public class IndexController {

    private final PostsService postsService;
    private final com.example.bbosongbbo_bootstrap2.services.posts.vuln_type_statsService vuln_type_statsService;


    @GetMapping("/")
    public String index(Model model)
    {
        model.addAttribute("vuln_type_stats",vuln_type_statsService.findAllDesc());
        return "index.html";
    }

    @GetMapping("/tables.html")
    public String tables(Model model) {
        model.addAttribute("posts",postsService.findAllDesc());
        return "tables.html";
    }

    @GetMapping("/posts-save.html")
    public String postsSaveForm(Model model) {

        return "posts-save.html";
    }


    @GetMapping("/posts/update/{id}")
    public String postsUpdate(@PathVariable("id") Long id, Model model) {
        PostsResponseDto dto = postsService.findById(id);
        model.addAttribute("post", dto);

        return "posts-update.html";
    }



}
