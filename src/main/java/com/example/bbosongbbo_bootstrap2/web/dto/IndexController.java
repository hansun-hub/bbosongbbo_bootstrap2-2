package com.example.bbosongbbo_bootstrap2.web.dto;

import com.example.bbosongbbo_bootstrap2.services.posts.PostsService;
import com.example.bbosongbbo_bootstrap2.services.posts.vuln_type_statsService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@Controller
public class IndexController {

    private final PostsService postsService;
    private final com.example.bbosongbbo_bootstrap2.services.posts.vuln_type_statsService vuln_type_statsService;


    @GetMapping("/")
    public String index(Model model)
    {
        model.addAttribute("vuln_type_stats",vuln_type_statsService.findAllDesc());
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

    @GetMapping("/posts/update/{id}")
    public String postsUpdate(@PathVariable Long id, Model model) {
        PostsResponseDto dto = postsService.findById(id);
        model.addAttribute("post", dto);

        return "posts-update";
    }


}
