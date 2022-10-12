package ru.batov.wbmain.repositories;

import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;

@Repository
public class JDBSProductRepositories {
    public int getCountProductEntity(int id) {
        LocalDateTime now = LocalDateTime.now();
        int count = 0;
        try (Connection connection = DriverManager.getConnection("jdbc:postgresql://192.168.1.65:5432/wbBase", "postgres", "Stalker5452!")) {
            ResultSet resultSet = connection.createStatement().executeQuery("SELECT count(id) FROM public.product where product_id =" + id);
            while (resultSet.next()) {
                count = resultSet.getInt(1);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println(now + "-" + LocalDateTime.now());
        return count;
    }
}
