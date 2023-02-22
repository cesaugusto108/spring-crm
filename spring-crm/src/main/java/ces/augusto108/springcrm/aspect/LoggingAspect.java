package ces.augusto108.springcrm.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Aspect
@Component
public class LoggingAspect {
    private final static Logger LOGGER = Logger.getLogger(LoggingAspect.class.getName());

    @Pointcut("execution(* ces.augusto108.springcrm.dao.*.*(..))")
    private void dao() {

    }

    @Pointcut("execution(* ces.augusto108.springcrm.services.*.*(..))")
    private void service() {

    }

    @Pointcut("execution(* ces.augusto108.springcrm.controller.*.*(..))")
    private void controller() {

    }

    @Pointcut("dao() || service() || controller()")
    private void app() {

    }

    @Before("app()")
    public void beforeExecution(JoinPoint joinPoint) {
        LOGGER.info("Method call: " + joinPoint.getSignature().toShortString());
    }

    @AfterReturning(pointcut = "app()")
    public void afterReturningFromExecution(JoinPoint joinPoint) {
        for (Object arg : joinPoint.getArgs()) {
            LOGGER.info(
                    "Returned from method call: " +
                            arg +
                            " from: " +
                            joinPoint.getSignature().toShortString()
            );
        }
    }
}
