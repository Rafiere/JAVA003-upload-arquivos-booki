package com.uploadarquivos.uploadarquivos.controllers.responses;

import lombok.Value;

import java.util.Map;

@Value(staticConstructor = "of")
public class FileUploadResponse {

    Map<Long, String> fileIdAndUrl;
}
