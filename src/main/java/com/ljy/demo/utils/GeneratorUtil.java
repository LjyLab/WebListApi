package com.ljy.demo.utils;


import java.io.File;
import java.util.*;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;
/**
 * @Author admin
 * @Create 2022-02-17 14:03
 * @Desc 逆向工程
 * @Application
 **/
public class GeneratorUtil {

    public void generator() throws Exception {
        List<String> warnings = new ArrayList<String>();
        boolean overwrite = true;
        // 指定配置文件
        File configFile = new File("./src/main/resources/generator.xml");
        ConfigurationParser cp = new ConfigurationParser(warnings);
        Configuration config = cp.parseConfiguration(configFile);
        DefaultShellCallback callback = new DefaultShellCallback(overwrite);
        MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
        myBatisGenerator.generate(null);
        System.out.println("成功!!!");
    }

    // 执行main方法以生成代码
    public static void main(String[] args) {
        try {
            GeneratorUtil generatorSqlmap = new GeneratorUtil();
            generatorSqlmap.generator();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
