package com.fastcampus.boardserver.service;


import com.fastcampus.boardserver.dto.CategoryDTO;
import com.fastcampus.boardserver.dto.PostDTO;
import com.fastcampus.boardserver.dto.request.PostSearchRequest;

import java.util.List;

public interface PostSearchService {
    List<PostDTO> getPosts(PostSearchRequest postSearchRequest);

    List<PostDTO> getProducts(PostDTO productDTO, CategoryDTO categoryDTO);
}
