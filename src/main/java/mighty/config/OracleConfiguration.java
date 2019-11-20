package mighty.config;


import lombok.Data;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration
@ConfigurationProperties(prefix = "db")
@ConditionalOnProperty(name = "db.type", havingValue = "oracle")
public class OracleConfiguration extends DatabaseConfiguration {
    boolean batchPerformanceWorkaround;
    int connectionRetryDelay;
}
