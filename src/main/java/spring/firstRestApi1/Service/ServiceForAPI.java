package spring.firstRestApi1.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spring.firstRestApi1.Service.YandexAiService.YandexGPTApi;

import java.io.IOException;

@Service
public class ServiceForAPI {
    @Autowired
    private Parser parser;
    @Autowired
    private YandexGPTApi yandexGPTApi;
    public String goAnswer(String link,String text) throws JsonProcessingException {
        return yandexGPTApi.getRequest(text,parser.goParcing(link));
    }
}
