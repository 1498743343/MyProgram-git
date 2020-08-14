package com.chen.test;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import org.apache.commons.io.IOUtils;

import java.sql.*;

public class JdbcTest {
    static {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        String url = "jdbc:mysql://172.16.19.104:3306/quality_test?useUnicode=true&characterEncoding=UTF-8";
        String username = "springcloud";
        String password = "springcloud";
        String sql = "SELECT * FROM test_user";
        JSONArray array = new JSONArray();
        Connection conn = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            conn = DriverManager.getConnection(url, username, password);
            preparedStatement = conn.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();
            ResultSetMetaData md = resultSet.getMetaData();
            int num = md.getColumnCount();
            while (resultSet.next()) {
                JSONObject mapOfColValues = new JSONObject(true);
                for (int i = 1; i <= num; i++) {
                    String string = resultSet.getString(i);
                    Object object = resultSet.getObject(i);
                    System.out.println("object = "+object);
                    mapOfColValues.put(md.getColumnName(i), object);
                }
                array.add(mapOfColValues);
            }
            String s = JSONObject.toJSONString(array, SerializerFeature.WriteMapNullValue);
            System.out.println(s);
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                resultSet.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                preparedStatement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }



    }
}
