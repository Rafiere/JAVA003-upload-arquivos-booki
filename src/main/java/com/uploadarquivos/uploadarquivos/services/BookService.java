package com.uploadarquivos.uploadarquivos.services;

import com.uploadarquivos.uploadarquivos.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class BookService {

    private final BookRepository bookRepository;

    public Map<Long, String> saveFile(MultipartFile file){

        return null;
    }

    public Map<Long, String> getFile(Long fileId){

        return null;
    }

    public Map<Long, String> getFiles(List<Long> filesId){

        return null;
    }
}
