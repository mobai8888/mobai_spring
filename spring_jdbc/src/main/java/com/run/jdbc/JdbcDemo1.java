package com.run.jdbc;

import java.sql.*;

/**
 * @program: spring_01
 * @ClassName JdbcDemo1
 * @description:
 * @author: lk
 * @create: 2020-03-25 15:41
 * @Version 1.0
 **/
/**
 * 程序的耦合
 *      耦合：程序间的依赖关系
 *          包括：
 *              类之间的依赖
 *              方法间的依赖
 *      解耦：
 *          降低程序间的依赖关系
 *      实际开发中：
 *          应该做到：编译期不依赖，运行时才依赖。
 *      解耦的思路：
 *          第一步：使用反射来创建对象，而避免使用new关键字。
 *          第二步：通过读取配置文件来获取要创建的对象全限定类名
 *
 */
public class JdbcDemo1 {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        DriverManager.registerDriver(new com.mysql.jdbc.Driver());
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/spring", "root", "123456");
        PreparedStatement preparedStatement = conn.prepareStatement("select * from account");
        ResultSet rs = preparedStatement.executeQuery();
        while (rs.next()){
            System.out.println(rs.getString("name"));
        }
        rs.close();
        preparedStatement.close();
        conn.close();
    }


}
