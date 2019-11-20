package mighty.config;


import lombok.Data;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Data
@ToString
public class DatabaseConfiguration {

  /**
   * Hostname of db
   */
  private String hostname;

  ;
  /**
   * port of db
   */
  private int port;
  /**
   * DB user
   */
  private String username;
  /**
   * DB Password
   */
  private String password;
  /**
   * Type of database
   */

  private DBType type;


  public enum DBType {mysql, oracle}

}
