package com.example.bbosongbbo_bootstrap2.web;

import com.example.bbosongbbo_bootstrap2.services.posts.PostsService;
import com.example.bbosongbbo_bootstrap2.web.dto.PostsListResponseDto;
import com.example.bbosongbbo_bootstrap2.web.dto.PostsResponseDto;
import com.example.bbosongbbo_bootstrap2.web.dto.PostsSaveRequestDto;
import com.example.bbosongbbo_bootstrap2.web.dto.PostsUpdateRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class PostsApiController {

    private final PostsService postsService;

    @PostMapping("/posts")
    public Long save(@RequestBody PostsSaveRequestDto
                     requestDto) {
        return postsService.save(requestDto);
    }

    @PutMapping("/posts/{id}")
    public Long update(@PathVariable Long id, @RequestBody PostsUpdateRequestDto requestDto) {
        return postsService.update(id, requestDto);
    }

    @DeleteMapping("/posts/{id}")
    public Long delete(@PathVariable Long id) {
        postsService.delete(id);
        return id;
    }



    @GetMapping("/posts/list")
    public List<PostsListResponseDto> findAll() {
        return postsService.findAllDesc();
    }


}
