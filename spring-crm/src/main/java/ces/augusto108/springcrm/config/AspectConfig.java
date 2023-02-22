package ces.augusto108.springcrm.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@ComponentScan("ces.augusto108.springcrm")
@EnableAspectJAutoProxy
@Configuration
public class AspectConfig {
}
