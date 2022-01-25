package br.com.qualify.feign.response;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@AllArgsConstructor
@EqualsAndHashCode
public class ComicsResponse {
    private String copyright;
    private String attributionHTML;

    private DataResponse data;
}
