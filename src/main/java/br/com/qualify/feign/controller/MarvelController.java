package br.com.qualify.feign.controller;

import br.com.qualify.feign.response.ComicsResponse;
import br.com.qualify.feign.service.MarvelComicsServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.HttpStatus.OK;

@AllArgsConstructor
@RestController
@RequestMapping(value= "/marvel")
public class MarvelController {
    private MarvelComicsServiceImpl service;

    @ResponseStatus(OK)
    @GetMapping(value= "/comics")
    public ComicsResponse findAll(){
        return service.findAll();
    }
}
