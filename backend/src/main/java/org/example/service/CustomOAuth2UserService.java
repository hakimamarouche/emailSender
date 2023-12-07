package org.example.service;

import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.oauth2.client.registration.ClientRegistrationRepository;
import org.springframework.security.oauth2.client.userinfo.DefaultOAuth2UserService;
import org.springframework.security.oauth2.client.userinfo.OAuth2UserRequest;
import org.springframework.security.oauth2.core.OAuth2AuthenticationException;
import org.springframework.security.oauth2.core.user.DefaultOAuth2User;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestOperations;

@Service
public class CustomOAuth2UserService extends DefaultOAuth2UserService {

    public CustomOAuth2UserService(
    ) {
        super.setRestOperations((RestOperations) new OAuth2UserAuthorityMapper());
    }

    @Override
    public OAuth2User loadUser(OAuth2UserRequest userRequest) throws OAuth2AuthenticationException {
        OAuth2User oAuth2User = super.loadUser(userRequest);
        return new DefaultOAuth2User(oAuth2User.getAuthorities(), oAuth2User.getAttributes(), "sub");
    }
}
