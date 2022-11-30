package org.launchcode.codingevents;

import org.launchcode.codingevents.controllers.AuthenticationController;
import org.launchcode.codingevents.data.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.HandlerInterceptor;

public class AuthenticationFilter implements HandlerInterceptor {

    @Autowired
    UserRepository userRepository;

    @Autowired
    AuthenticationController authenticationController;

}
