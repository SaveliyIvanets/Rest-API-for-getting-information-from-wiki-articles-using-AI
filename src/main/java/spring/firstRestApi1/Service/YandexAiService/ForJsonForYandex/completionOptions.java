package spring.firstRestApi1.Service.YandexAiService.ForJsonForYandex;

import org.springframework.stereotype.Component;

@Component
public class completionOptions {
    private boolean stream = false;
    private double temperature = 0.6;
    private String maxTokens = "2000";

    public void setStream(boolean stream) {
        this.stream = stream;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public void setMaxTokens(String maxTokens) {
        this.maxTokens = maxTokens;
    }

    public boolean isStream() {
        return stream;
    }

    public double getTemperature() {
        return temperature;
    }

    public String getMaxTokens() {
        return maxTokens;
    }
}
