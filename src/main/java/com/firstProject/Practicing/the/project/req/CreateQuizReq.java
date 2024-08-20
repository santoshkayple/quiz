package com.firstProject.Practicing.the.project.req;

import jakarta.validation.constraints.NotBlank;

public record CreateQuizReq(
        @NotBlank String title,
        @NotBlank String answer,
        @NotBlank String wrong
) {
    public static CreateQuizReq of(String title, String answer, String wrong) {
        return new CreateQuizReq(title, answer, wrong);
    }
}
