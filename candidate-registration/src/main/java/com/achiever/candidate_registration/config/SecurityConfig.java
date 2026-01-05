package com.achiever.candidate_registration.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {

        http
            .csrf(csrf -> csrf.disable())
            .authorizeHttpRequests(auth -> auth
                .requestMatchers(
                        "/", "/home",
                        "/admin/login", "/admin/login/process",
                        "/user/login", "/user/login/process",
                        "/css/**", "/js/**"
                ).permitAll()
                .anyRequest().permitAll() // allow everything for now
            )
            .formLogin(form -> form.disable()) // disable default spring login
            .logout(logout -> logout.disable()); // disable logout for now

        return http.build();
    }
}
