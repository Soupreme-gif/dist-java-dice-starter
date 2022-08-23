package edu.wctc.dice;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("edu.wctc.dice")
public class AppConfig {

    @Bean
    public IConsoleInput iConsoleInput()
    {

        return new ConsoleInput();

    }

    @Bean
    public IConsoleOutput iConsoleOutput()
    {

        return new ConsoleOutput();

    }

}
