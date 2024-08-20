package com.firstProject.Practicing.the.project.req;

import jakarta.validation.constraints.NotBlank;

public record UpdateQuizReq (
        String title,
        String answer,
        String wrong
){
    public static UpdateQuizReq of(String title, String answer, String wrong) {
        return new UpdateQuizReq(title, answer, wrong);
    }
}
