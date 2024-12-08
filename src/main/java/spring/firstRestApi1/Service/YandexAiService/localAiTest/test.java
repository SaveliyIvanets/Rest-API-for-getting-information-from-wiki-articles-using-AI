package spring.firstRestApi1.Service.YandexAiService.localAiTest;

import com.fasterxml.jackson.core.JsonProcessingException;
import spring.firstRestApi1.Service.Parser;
import spring.firstRestApi1.Service.YandexAiService.YandexGPTApi;

public class test {
    public static void main(String[] args) throws JsonProcessingException {
        YandexGPTApi yandexGPTApi = new YandexGPTApi();
        System.out.println(yandexGPTApi.getRequest("исправь этот текст", "нармальна"));
        System.out.println(yandexGPTApi.getRequest("исправь этот текст", "кок дила?"));
    }
}
