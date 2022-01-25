package br.com.qualify.feign.service;

import br.com.qualify.feign.client.MarvelComicsClient;
import br.com.qualify.feign.response.ComicsResponse;
import lombok.AllArgsConstructor;
import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.stereotype.Service;


import java.util.Date;

@Service@AllArgsConstructor
public class MarvelComicsServiceImpl {
    private static final String PUBLIC_KEY= "7e1c7176f87040552a39d789f54e251b";
    private static final String PRIVATE_KEY= "5a76759712bbf53ebf3417dfa2809ce143309354";

    private MarvelComicsClient client;

    public ComicsResponse findAll(){
        Long timeStamp = new Date().getTime();
        return client.findAll(timeStamp, PRIVATE_KEY, buildHash(timeStamp));
    }
    private String buildHash(Long timeStamp){
        return DigestUtils.md5Hex(timeStamp + PRIVATE_KEY + PRIVATE_KEY);
    }
}
