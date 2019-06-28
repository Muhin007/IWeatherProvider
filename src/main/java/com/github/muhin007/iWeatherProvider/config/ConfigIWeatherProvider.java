package com.github.muhin007.iWeatherProvider.config;

import com.github.muhin007.iWeatherProvider.weatherAdaptor.aerisapi.WeatherAdaptorAerisapi;
import com.github.muhin007.iWeatherProvider.weatherAdaptor.apixu.WeatherAdaptorApixu;
import com.github.muhin007.iWeatherProvider.weatherAdaptor.worldweatheronline.WeatherAdaptorWorldweatheronline;
import com.github.muhin007.iWeatherProvider.weatherAdaptor.yandex.WeatherAdaptorYandex;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.github.muhin007.iWeatherProvider")
public class ConfigIWeatherProvider {
    @Bean
    public WeatherAdaptorAerisapi getWeatherAdaptorAerisapi(){
        return new WeatherAdaptorAerisapi();
    }
    @Bean
    public WeatherAdaptorApixu getWeatherAdaptorApixu() {
        return new WeatherAdaptorApixu();
    }
    @Bean
    public WeatherAdaptorYandex getWeatherAdaptorYandex(){
        return new WeatherAdaptorYandex();
    }
    @Bean
    public WeatherAdaptorWorldweatheronline getWeatherWorldweatheronline(){
        return new WeatherAdaptorWorldweatheronline();
    }
}
