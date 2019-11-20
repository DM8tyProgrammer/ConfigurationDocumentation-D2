package mighty;


import mighty.config.DatabaseConfiguration;
import mighty.config.MysqlConfiguration;
import mighty.config.OracleConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class DBPoolLoader {

  @Autowired
  private DatabaseConfiguration databaseConfiguration;

  @PostConstruct
  public void init() {
    DatabaseConfiguration.DBType type = databaseConfiguration.getType();

    if (type == DatabaseConfiguration.DBType.mysql) {
      MysqlConfiguration additionalProperties = (MysqlConfiguration) databaseConfiguration;
      System.out.println(additionalProperties.getCallableStmtCacheSize());
      System.out.println(additionalProperties.isDumpQueriesOnException());
    } else {

      OracleConfiguration additionalProperties = (OracleConfiguration) databaseConfiguration;
      System.out.println(additionalProperties.getConnectionRetryDelay());
      System.out.println(additionalProperties.isBatchPerformanceWorkaround());
    }
  }
}
