package com.visualization.security.core.authentication;

import com.visualization.security.core.properties.SecurityConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

public class AbstractChannelSecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    protected AuthenticationSuccessHandler visualizationAuthenticationSuccessHandler;

    @Autowired
    protected AuthenticationFailureHandler visualizationAuthenticationFailureHandler;

    protected void applyPasswordAuthenticationConfig(HttpSecurity http) throws Exception {
        http.formLogin().loginPage(SecurityConstants.DEFAULT_UNAUTHENTICATION_URL).loginProcessingUrl(SecurityConstants.DEFAULT_LOGIN_PROCESSING_URL_FORM).successHandler(visualizationAuthenticationSuccessHandler).failureHandler(visualizationAuthenticationFailureHandler);
    }

}
