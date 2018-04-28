package com.ucmed;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.transaction.annotation.EnableTransactionManagement;



@SpringBootApplication()
@EnableCaching//开启缓存
@EnableTransactionManagement// 开启事务管理
@MapperScan("com.ucmed.dao")// 必须加这个，不加报错，如果不加，也可以在每个mapper上添加@Mapper注释，并且这里还要多填一个注释，那个我忘了，我一直用这个注解
public class SbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbootApplication.class, args);
	}
}
