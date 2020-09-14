package com.arun.urlShortener.interactors;

import org.springframework.stereotype.Service;

@Service
public interface IURLInteractor {

    String getTinyURL(String url);

    String updateTinyURL(int id);

    String deleteTinyURL(int id);

    String getRedirector(String tinyUrl);

}
