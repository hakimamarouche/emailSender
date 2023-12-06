import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.oauth2.core.user.OAuth2UserAuthority;
import java.util.Collection;

public class OAuth2UserAuthorityMapper extends DefaultOAuth2UserAuthorityConverter {

    @Override
    public Collection<? extends GrantedAuthority> convert(OAuth2UserAuthority authority) {
        return super.convert(authority);
    }
}
