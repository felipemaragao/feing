package br.com.qualify.feign.client;

import br.com.qualify.feign.response.ComicsResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name="marvel", url="${url.marvel}/v1/public")
public interface MarvelComicsClient {
    @GetMapping("/comics")
    public ComicsResponse findAll(@RequestParam(value = "ts") Long timeStamp,
                                  @RequestParam(value = "apikey") String publicKey,
                                  @RequestParam(value = "hash") String hashMD5);

}
