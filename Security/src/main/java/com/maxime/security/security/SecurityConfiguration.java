 package com.maxime.security.security;

import com.maxime.security.service.IUserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;

@Configuration
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
    
    private IUserService userService;
    private BCryptPasswordEncoder passwordEncoder;

    public SecurityConfiguration(IUserService userService, BCryptPasswordEncoder passwordEncoder) {
        this.userService = userService;
        this.passwordEncoder = passwordEncoder;
    }
    
    

//    Méthode pour configurer la protection des url
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .authorizeHttpRequests()
                .antMatchers("/login", "/register") // pour les requets qui matchent cette URI 
                .permitAll() // Autoriser toutes les reqêtes ==> pas besoin d'être connecté
                .anyRequest().authenticated() // pour toutes les autres requetes on demande une authentification
                .and()
                .formLogin() // on active le formulaire de login
                .loginPage("/login"); // On configure notre propre page de login plutôt qu'utiliser la page par défaut de Spring
                //.successForwardUrl("/"); redirige vers la page en paramètre
        http.csrf().disable();
        http.headers().frameOptions().disable();
    }
//    Méthode pour config le mode d'authentification
//    @Override
//    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        auth
//                .inMemoryAuthentication()// Authentification en mémoire 
//                .passwordEncoder(NoOpPasswordEncoder.getInstance())// on ne veut pas que le mot de passe soit crypté
//                .withUser("admin").password("admin") // on créer l'utilisateur admin ==> Authentification
//                .roles("USER", "ADMIN") // on lui assigne les roles USER et ADMIN ==> Authorization
//                .and()
//                .withUser("maxime").password("admin")
//                .roles("MANAGER");            
//    }
//       
//    @Bean
//    public BCryptPasswordEncoder passwordEncoder(){
//        return new BCryptPasswordEncoder();
//    }
    
    @Bean
    public DaoAuthenticationProvider authenticationProvider(){
        DaoAuthenticationProvider auth= new DaoAuthenticationProvider();
        auth.setUserDetailsService(userService);
        auth.setPasswordEncoder(passwordEncoder);
        return auth;
        
    }
    
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.authenticationProvider(authenticationProvider());
    }
    
}
