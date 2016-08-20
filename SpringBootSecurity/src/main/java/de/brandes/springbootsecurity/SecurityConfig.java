/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.brandes.springbootsecurity;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.servlet.configuration.EnableWebMvcSecurity;
/**
 * Security configuration.
 *
 * @author Udo Brandes2
 * Das ist ein Kommentar von Udo Brandes2
 * Das ist ein Kommentar von Udo Brandes2
 * Das ist ein Kommentar von Udo Brandes2
 * Das ist ein Kommentar von Udo Brandes2
 * Das ist ein Kommentar von Udo Brandes2
 * @author Udo Brandes1
 * Das ist ein Kommentar von Udo Brandes1
 * Das ist ein Kommentar von Udo Brandes1
 * Das ist ein Kommentar von Udo Brandes1
 * Das ist ein Kommentar von Udo Brandes1
 * Das ist ein Kommentar von Udo Brandes1
 * 
 * 
 * Das ist ein Kommentar von Udo Brandes4
 * Das ist ein Kommentar von Udo Brandes4
 * Das ist ein Kommentar von Udo Brandes4
 * Das ist ein Kommentar von Udo Brandes4
 * Das ist ein Kommentar von Udo Brandes4
 * 
 * Das ist ein Kommentar von Udo Brandes3
 * Das ist ein Kommentar von Udo Brandes3
 * Das ist ein Kommentar von Udo Brandes3
 * Das ist ein Kommentar von Udo Brandes3
 * Das ist ein Kommentar von Udo Brandes3
 * 
 * Das ist ein Kommentar von Udo Brandes6
 * Das ist ein Kommentar von Udo Brandes6
 * Das ist ein Kommentar von Udo Brandes6
 * Das ist ein Kommentar von Udo Brandes6
 * Das ist ein Kommentar von Udo Brandes6
 * 
 * Das ist ein Kommentar von Udo Brandes5
 * Das ist ein Kommentar von Udo Brandes5
 * Das ist ein Kommentar von Udo Brandes5
 * Das ist ein Kommentar von Udo Brandes5
 * Das ist ein Kommentar von Udo Brandes5
 * 
 * Das ist ein Kommentar von Udo Brandes8
 * Das ist ein Kommentar von Udo Brandes8
 * Das ist ein Kommentar von Udo Brandes8
 * Das ist ein Kommentar von Udo Brandes8
 * Das ist ein Kommentar von Udo Brandes8
 * 
 */
@Configuration
@EnableWebMvcSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication()
                .withUser("user1").password("secret1").roles("USER")
                .and()
                .withUser("user2").password("secret2").roles("USER");
    }
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests().anyRequest().fullyAuthenticated();
        http.httpBasic();
        http.csrf().disable();
    }
}