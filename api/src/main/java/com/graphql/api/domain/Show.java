package com.graphql.api.domain;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Builder
public class Show {
    private String title;
    private Integer releaseYear;
}
