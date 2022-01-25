package br.com.qualify.feign.response;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@AllArgsConstructor
@EqualsAndHashCode
public class ResultsResponse {
    private Long id;
    private String title;

}
