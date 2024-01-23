package com.olvera.reservationbus.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    SecurityFilterChain defaultSecurityFilterChain(HttpSecurity httpSecurity) throws Exception {

        httpSecurity.authorizeHttpRequests()
                .requestMatchers(HttpMethod.GET)
                .permitAll()
                .anyRequest()
                .authenticated()
                .and()
                .httpBasic(Customizer.withDefaults());

        return httpSecurity.build();
    }

}
