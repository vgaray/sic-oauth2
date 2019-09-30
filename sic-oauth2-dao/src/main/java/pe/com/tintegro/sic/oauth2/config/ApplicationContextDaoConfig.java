package pe.com.tintegro.sic.oauth2.config;

import javax.sql.DataSource;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

//import org.springframework.jndi.JndiTemplate;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@ComponentScan({ "pe.com.tintegro.sic.oauth2" })
@PropertySource(value = { "classpath:jdbc.properties" })
@MapperScan("pe.com.tintegro.sic.oauth2.mapper")
public class ApplicationContextDaoConfig
{
	@Autowired
	private Environment env;

	@Bean
	public DataSource dataSource()
	{
		DriverManagerDataSource dataSource = new DriverManagerDataSource();

		dataSource.setDriverClassName(env.getProperty("jdbc.driverClassName"));
		dataSource.setUrl(env.getProperty("jdbc.url"));
		dataSource.setUsername(env.getProperty("jdbc.username"));
		dataSource.setPassword(env.getProperty("jdbc.password"));

		return dataSource;
	}

	/*
	 * @Bean public DataSource dataSource() {
	 * 
	 * DataSource dataSource = null; JndiTemplate jndiTemplate = new
	 * JndiTemplate(); try { dataSource = (DataSource)
	 * jndiTemplate.lookup("java:comp/env/jdbc/SicDB"); } catch (Exception e) {
	 * // TODO Auto-generated catch block System.out.println(e.getMessage());
	 * e.printStackTrace(); } return dataSource; }
	 */

	@Bean
	public DataSourceTransactionManager transactionManager()
	{
		return new DataSourceTransactionManager(dataSource());
	}

	@Bean
	public SqlSessionFactoryBean sqlSessionFactory() throws Exception
	{
		SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
		sessionFactory.setDataSource(dataSource());
		sessionFactory.setTypeAliasesPackage("pe.com.tintegro.sic.oauth2.dominio");
		return sessionFactory;
	}
}
