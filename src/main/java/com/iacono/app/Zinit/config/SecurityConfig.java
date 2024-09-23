package com.iacono.app.Zinit.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .csrf(csrf -> csrf.disable())
                .authorizeHttpRequests((authorize) -> authorize
                        .requestMatchers("/build/**").authenticated()  // Accesso solo agli utenti autenticati
                        .anyRequest().permitAll()  // Tutto il resto è accessibile senza autenticazione
                )
                .formLogin(form -> form
                        .loginPage("/login")  // Definisci la pagina di login personalizzata
                        .defaultSuccessUrl("/build", true)  // Reindirizzamento dopo il login
                        .permitAll()  // Consentire a chiunque di vedere la pagina di login
                )
                .logout(logout -> logout.permitAll());  // Consentire il logout

        return http.build();
    }
}
