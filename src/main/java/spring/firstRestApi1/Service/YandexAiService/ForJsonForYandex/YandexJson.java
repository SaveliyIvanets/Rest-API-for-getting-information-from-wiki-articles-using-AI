package spring.firstRestApi1.Service.YandexAiService.ForJsonForYandex;

import spring.firstRestApi1.Service.YandexAiService.ForJsonForYandex.YandexRole;
import spring.firstRestApi1.Service.YandexAiService.ForJsonForYandex.completionOptions;

public class YandexJson {
    private String modelUri;
    private spring.firstRestApi1.Service.YandexAiService.ForJsonForYandex.completionOptions completionOptions;
    private YandexRole[] messages;

    public YandexJson(String modelUri,completionOptions completionOptions,YandexRole[] messages) {
        this.modelUri = modelUri;
        this.completionOptions = completionOptions;
        this.messages = messages;
    }

    public String getModelUri() {
        return modelUri;
    }

    public completionOptions getCompletionOptions() {
        return completionOptions;
    }

    public void setCompletionOptions(completionOptions completionOptions) {
        this.completionOptions = completionOptions;
    }

    public void setModelUri(String modelUri) {
        this.modelUri = modelUri;
    }

    public YandexRole[] getMessages() {
        return messages;
    }

    public void setMessages(YandexRole[] messages) {
        this.messages = messages;
    }
}
