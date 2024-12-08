package spring.firstRestApi1.Service.YandexAiService;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import spring.firstRestApi1.Service.YandexAiService.ForJsonForYandex.YandexJson;
import spring.firstRestApi1.Service.YandexAiService.ForJsonForYandex.YandexRole;

@Service
public class YandexGPTApi {
    @Autowired
    private spring.firstRestApi1.Service.YandexAiService.ForJsonForYandex.completionOptions completionOptions;
    public String getRequest(String request,String text) throws JsonProcessingException {

        String url = "https://llm.api.cloud.yandex.net/foundationModels/v1/completion";
        RestTemplate restTemplate = new RestTemplate();

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.add("Authorization", "Api-Key AQVN0aKZPUoqzcrp4FMZOPBrspczq0IYm81xi-ie");
        headers.add("x-folder-id","b1g2kobehfrm0kt9dn4t");

        YandexRole[] messages = new YandexRole[]{new YandexRole("system",request),new YandexRole("user",text)};
        YandexJson yandexJson = new YandexJson("gpt://b1g2kobehfrm0kt9dn4t/yandexgpt-lite",completionOptions,messages);

        ObjectMapper objectMapper = new ObjectMapper();
        String jsonForYandex = objectMapper.writeValueAsString(yandexJson);
        HttpEntity<String> httpEntityForYandex = new HttpEntity<>(jsonForYandex,headers);



        String ans = restTemplate.postForObject(url,httpEntityForYandex,String.class);
        JsonNode obj = objectMapper.readTree(ans);


        return obj.get("result").get("alternatives").get(0).get("message").get("text").toString();
    }


}
