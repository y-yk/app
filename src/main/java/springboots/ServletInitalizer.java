package springboots;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * @Description:
 * @Author yyk
 * @Date Created in 12:05   2018/4/26
 */
public class ServletInitalizer extends SpringBootServletInitializer {
    @Override
    protected final SpringApplicationBuilder configure(final SpringApplicationBuilder application) {
        return application.sources(AisApplication.class);
    }
}