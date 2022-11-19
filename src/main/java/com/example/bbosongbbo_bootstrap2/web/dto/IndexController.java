package com.example.bbosongbbo_bootstrap2.web.dto;

import com.example.bbosongbbo_bootstrap2.entity.Member;
import com.example.bbosongbbo_bootstrap2.repository.MemberRepository;
import com.example.bbosongbbo_bootstrap2.services.posts.PostsService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@Controller
public class IndexController {

    @Autowired
    private MemberRepository memberRepository;

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

    @ResponseBody
    @GetMapping("posts")

    public List<PostsListResponseDto> findAll() {
        return postsService.findAllDesc();
    }

    @ResponseBody
    @GetMapping("posts/{id}")
    public PostsResponseDto findById (@PathVariable Long id){
        return postsService.findById(id);
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
