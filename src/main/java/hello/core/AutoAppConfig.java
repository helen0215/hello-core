package hello.core;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(
        // 기존 예제를 최대한 유지하기 위해서
        // @Configuration 도 @Component이기 때문에 스캔 대상이 되기 때문에 AppConfig를 필터로 제외힌다
        excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Configuration.class)
)
public class AutoAppConfig {
}
