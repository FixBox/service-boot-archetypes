package ${package}.configuration;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigurationAppl{
    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }
}