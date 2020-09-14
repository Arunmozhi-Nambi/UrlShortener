package com.arun.urlShortener.controller;

import com.arun.urlShortener.interactors.IURLInteractor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController("/")
public class UrlController {

    IURLInteractor urlInteractor;

    @GetMapping(value = "/url")
    public String getTinyUrl(){
//        String tinyUrl = urlInteractor.getTinyURL(url);
        return "Hello Arun";
    }

    @GetMapping(value = "/redirect")
    public String redirector(@RequestParam(name = "tinyUrl") String tinyUrl){
        String fullUrl = urlInteractor.getRedirector(tinyUrl);
        return fullUrl;
    }

}
