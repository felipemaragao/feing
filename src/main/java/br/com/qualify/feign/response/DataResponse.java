package br.com.qualify.feign.response;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;

import java.util.List;

@Getter
@AllArgsConstructor
@EqualsAndHashCode
public class DataResponse {
    private List<ResultsResponse> retults;
}
