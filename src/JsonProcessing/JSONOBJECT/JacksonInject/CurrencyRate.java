package JsonProcessing.JSONOBJECT.JacksonInject;


import com.fasterxml.jackson.annotation.JacksonInject;

import java.time.LocalDateTime;

public class CurrencyRate {
    private String pair;
    private double rate;
    @JacksonInject("lastUpdated")
    private LocalDateTime lastUpdated;

    public String getPair() {
        return pair;
    }

    public void setPair(String pair) {
        this.pair = pair;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public LocalDateTime getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(LocalDateTime lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    @Override
    public String toString() {
        return "CurrencyRate{" +
                "pair='" + pair + '\'' +
                ", rate=" + rate +
                ", lastUpdated=" + lastUpdated +
                '}';
    }
}