package com.bexperr.dash;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.bexperr.dash.auth.service.JWTService;
import com.bexperr.dash.models.service.MyUserDetailsService;
import com.bexperr.dash.auth.handler.LoginSuccesHandler;
import com.bexperr.dash.auth.filter.JWTAuthenticationFilter;
import com.bexperr.dash.auth.filter.JWTAuthorizationFilter;

@Configuration
@EnableGlobalMethodSecurity(securedEnabled = true, prePostEnabled = true)
public class SpringSecurityConfigure extends WebSecurityConfigurerAdapter {
	
	@Autowired
	private BCryptPasswordEncoder passwordEncoder;
	
	@Autowired
	private MyUserDetailsService userDetailsService;
	
	/*@Autowired
	private JWTService jwtService;*/
	
	@Autowired
	private LoginSuccesHandler successHandler;
	
	/*@Override
	@Bean
	public AuthenticationManager authenticationManagerBean() throws Exception{
		return super.authenticationManagerBean();
	}
	*/
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.//csrf().disable()
			authorizeRequests()
			.antMatchers("/jwt")
			.hasAnyRole("ADMIN", "USER")
			.antMatchers("/", "/css/**", "/js/**", "/img/**", "/index", "/plugins/**", "/api/login", "/error_403").permitAll()
			.antMatchers("/forms/**", "/charts/**").hasAnyRole("ADMIN")
			.antMatchers("/examples/**", "/tables/**").hasAnyRole("USER")
			.anyRequest()
			.authenticated()
			.and()
			.formLogin()
			.successHandler(successHandler)
			.loginPage("/login").permitAll()
			.and()
			.logout().permitAll()
			.and()
			.exceptionHandling().accessDeniedPage("/error_403");
			/*.and()
			.addFilter(new JWTAuthenticationFilter(authenticationManager(), jwtService))
			.addFilter(new JWTAuthorizationFilter(authenticationManager(), jwtService))
			.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);*/
	}
	
	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder builder) throws Exception {

		builder.userDetailsService(userDetailsService)
		.passwordEncoder(passwordEncoder);

	}
}
