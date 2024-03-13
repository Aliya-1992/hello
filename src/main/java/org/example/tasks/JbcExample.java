package org.example.tasks;

import java.sql.*;
import java.util.Scanner;

public class JbcExample {

        static final String DB_URL = "jdbc:postgresql://localhost:5432/shop";
        static final String USER = "postgres";
        static final String PASS = "Samsung2023!";
        public static void main(String[] args) {
           // System.out.println("Testing connection to PostgreSQL JDBC");
           // String sqlCommand = "CREATE TABLE if not exists newproducts (Id serial PRIMARY KEY , ProductName VARCHAR(20), Price INT)";
            try {
                Scanner scanner = new Scanner(System.in);
                Class.forName("org.postgresql.Driver");
                System.out.println("Выберите операцию: ");
                System.out.println("1. Вставить данные в таблицу");
                System.out.println("2. Изменить данные в таблице: ");
                System.out.println("3. Удалить данные из таблицы ");
                System.out.println("4. Укажите произвольный запрос");
                int operation = scanner.nextInt();
                switch (operation){
                    case 1:
                    System.out.println("Укажите имя товара: ");
                    String name = scanner.next();
                    System.out.println("Веедите стоимость товара: ");
                    int price = scanner.nextInt();
                    try (Connection connection = DriverManager.getConnection(DB_URL, USER, PASS)){
                        String sql = "insert into newproducts (productname, price) values(?,?)";
                        PreparedStatement preparedStatement = connection.prepareStatement(sql);
                        preparedStatement.setString(1, name);
                        preparedStatement.setInt(2, price);
                        int rows = preparedStatement.executeUpdate();
                        System.out.println(rows);
                    } catch (SQLException e){
                        throw new RuntimeException(e);
                    }
                    break;
                    case 2:
                        System.out.println("Укажите id товара: ");
                        int id = scanner.nextInt();
                        System.out.println("Веедите наценку товара: ");
                        int priсe1 = scanner.nextInt();
                        try (Connection connection = DriverManager.getConnection(DB_URL, USER, PASS)){
                            String sql = "update newproducts set price = price + (?) where id = (?)";
                            PreparedStatement preparedStatement = connection.prepareStatement(sql);
                            preparedStatement.setInt(1, priсe1);
                            preparedStatement.setInt(2, id);
                            int rows = preparedStatement.executeUpdate();
                            System.out.println(rows);
                        } catch (SQLException e){
                            throw new RuntimeException(e);
                        }
                        break;
                    case 3:
                        System.out.println("Укажите id товара: ");
                        int id1 = scanner.nextInt();
                        try (Connection connection = DriverManager.getConnection(DB_URL, USER, PASS)){
                            String sql = "delete from newproducts where id = (?)";
                            PreparedStatement preparedStatement = connection.prepareStatement(sql);
                            preparedStatement.setInt(1, id1);
                            int rows = preparedStatement.executeUpdate();
                            System.out.println(rows);
                        } catch (SQLException e){
                            throw new RuntimeException(e);
                        }
                        break;
                    case 4:
                        System.out.println("ведите запрос: ");

                        scanner.nextLine();
                        String str= scanner.nextLine();
                        try (Connection connection = DriverManager.getConnection(DB_URL, USER, PASS)){
                            //String sql = "delete from newproducts where id = (?)";
                            //PreparedStatement preparedStatement = connection.prepareStatement(str);
                           // preparedStatement.setInt(1, id1);
                            Statement statement = connection.createStatement();
                            int rows = statement.executeUpdate(str);
                            System.out.println(rows);
                        } catch (SQLException e){
                            throw new RuntimeException(e);
                        }
                        break;

                    default:
                    System.out.println("выход");
                    break;
                }
            } catch (ClassNotFoundException e) {
                System.out.println("PostgreSQL JDBC Driver is not found. Include it in your library path ");
                e.printStackTrace();
                return;
            }

            System.out.println("PostgreSQL JDBC Driver successfully connected");

        }

    }

