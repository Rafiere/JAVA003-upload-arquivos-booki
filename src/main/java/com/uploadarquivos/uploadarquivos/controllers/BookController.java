package com.uploadarquivos.uploadarquivos.controllers;

import com.uploadarquivos.uploadarquivos.controllers.responses.FileUploadResponse;
import com.uploadarquivos.uploadarquivos.controllers.responses.GetFileResponse;
import com.uploadarquivos.uploadarquivos.services.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/files")
@RequiredArgsConstructor
public class BookController {

    private final BookService bookService;

    @PostMapping("/upload")
    public ResponseEntity<FileUploadResponse> execute(@RequestParam(name = "file") MultipartFile file) {

        Map<Long, String> fileIdAndUrl = bookService.saveFile(file);

        return ResponseEntity.status(201).body(FileUploadResponse.of(fileIdAndUrl));
    }

    @GetMapping("/get-one")
    public ResponseEntity<GetFileResponse> execute(@RequestParam(name = "id") Long fileId) {

        Map<Long, String> fileUrlAndId = bookService.getFile(fileId);

        return ResponseEntity.status(200).body(GetFileResponse.of(fileUrlAndId));
    }

    @GetMapping("/get-many")
    public ResponseEntity<GetFileResponse> execute(@RequestParam(name = "ids") List<Long> filesIds) {

        Map<Long, String> fileUrlAndId = bookService.getFiles(filesIds);

        return ResponseEntity.status(200).body(GetFileResponse.of(fileUrlAndId));
    }
}