package org.yearup;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.yearup.data.mysql.MySqlCategoryDao;

@SpringBootApplication
public class EasyshopApplication implements CommandLineRunner
{
    @Autowired
    public MySqlCategoryDao mySqlCategoryDao;

    public static void main(String[] args) {
        SpringApplication.run(EasyshopApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println(mySqlCategoryDao.getAllCategories());
    }
}
