package cn.chinaflame.park.conf;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix = "spring.datasource.activiti")
@Data
@Component
public class ActivitiDataSourceProperties {
	 	private String url;

	    private String username;

	    private String password;

	    private String driverClassName;

	    private Integer maxActive;

	    private Integer initialSize;

	    private Integer minIdle;

	    private Integer maxWait;

	    private Integer maxPoolPreparedStatementPerConnectionSize;

	    private Integer timeBetweenEvictionRunsMillis;

	    private Integer minEvictableIdleTimeMillis;

	    private Boolean poolPreparedStatements;
}
