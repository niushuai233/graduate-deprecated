package cc.niushuai.graduate.config;

import com.github.pagehelper.PageHelper;

import java.util.Properties;

/**
 * @author niushuai
 * @date 2018/2/4.
 * @email 1225803134@qq.com
 * <p>
 * 此方案可替代 application.yml中 pagehelper配置
 */
//@Configuration
public class PageHelperConfig {


    //@Bean
    public PageHelper getPageHelper() {
        PageHelper pageHelper = new PageHelper();
        Properties properties = new Properties();
        properties.setProperty("helperDialect", "mysql");
        properties.setProperty("reasonable", "true");
        properties.setProperty("supportMethodsArguments", "true");
        properties.setProperty("params", "count=countSql");
        pageHelper.setProperties(properties);
        return pageHelper;
    }

}
