package hieu.keycloakservice.utils;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

@Configuration
@RequiredArgsConstructor
public class KeycloakUtils {

    private final Environment env;

}
