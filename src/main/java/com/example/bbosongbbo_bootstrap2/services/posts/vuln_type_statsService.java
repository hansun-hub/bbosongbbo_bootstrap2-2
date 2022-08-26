package com.example.bbosongbbo_bootstrap2.services.posts;

import com.example.bbosongbbo_bootstrap2.domain.posts.vuln_type_stats;
import com.example.bbosongbbo_bootstrap2.domain.posts.vuln_type_statsRepository;
import com.example.bbosongbbo_bootstrap2.web.dto.PostsListResponseDto;
import com.example.bbosongbbo_bootstrap2.web.dto.vuln_type_statsResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class vuln_type_statsService {

    private final vuln_type_statsRepository vulnTypeStatsRepository;

}
