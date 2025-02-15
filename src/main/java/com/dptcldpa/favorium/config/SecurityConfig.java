package com.dptcldpa.favorium.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

import lombok.RequiredArgsConstructor;

@Configuration
@EnableWebSecurity
@RequiredArgsConstructor
public class SecurityConfig {

    @Bean
    public BCryptPasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    private static final String[] anonymousUserUrl = {"/", "/user/signup-view", "/user/login-view"};

    private static final String[] authenticatedUserUrl = {"/post/**", "/category/**"};
    
	@Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception {
        return httpSecurity
                .csrf().disable()
                .cors().and()
                .authorizeRequests()
                .requestMatchers(anonymousUserUrl).anonymous()
                .requestMatchers(authenticatedUserUrl).permitAll()
                .anyRequest().permitAll()
                .and()
                .exceptionHandling()
                .and()
                .formLogin()
                .loginPage("/user/login-view")
                .usernameParameter("loginId")
                .passwordParameter("password")  
                .failureUrl("/user/signup-view") 
                .defaultSuccessUrl("/user/mypage-view")
                .and()
                .logout()
                .logoutUrl("/user/logout") 
                .invalidateHttpSession(true).deleteCookies("JSESSIONID")
                .and()
                .build();
    }

}
