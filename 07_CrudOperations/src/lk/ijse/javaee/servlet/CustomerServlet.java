package lk.ijse.javaee.servlet;

import javax.annotation.Resource;
import javax.json.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@WebServlet(urlPatterns = "/customer")
public class CustomerServlet extends HttpServlet {

    @Resource(name = "java:comp/env/jdbc/pool")
    private DataSource ds;


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            PrintWriter writer = resp.getWriter();
            Connection connection = ds.getConnection();
            PreparedStatement pstm = connection.prepareStatement("select * from Customer");
            ResultSet rst = pstm.executeQuery();

//            01 json array-> for all customers
//            02 customer json objects
            JsonArrayBuilder customerArray = Json.createArrayBuilder();//[]
            //[{id:'C001','name':"Kasun",'Address':"Galle",'salary':1000}]

            while (rst.next()) {
                String id = rst.getString(1);
                String name = rst.getString(2);
                String address = rst.getString(3);
                double salary = rst.getDouble(4);

                JsonObjectBuilder customer = Json.createObjectBuilder();
                customer.add("id", id);
                customer.add("name", name);
                customer.add("address", address);
                customer.add("salary", salary);
                customerArray.add(customer.build());
            }

            resp.setContentType("application/json");
            writer.print(customerArray.build());
            writer.close();
            connection.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }


//        String json = "{\"id\":\"C001\",\"name\":\"Kasun\"}";
//        resp.setContentType("application/json");
//        resp.getWriter().print(json);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
//        String id = req.getParameter("id"); url // x-www-form-urlencoded
//        String name = req.getParameter("name");
//        String address = req.getParameter("address");
//        String salary = req.getParameter("salary");


            //how to get the json data from a request
            JsonReader reader = Json.createReader(req.getInputStream());
            JsonObject customer = reader.readObject();
            String id = customer.getString("id");
            String name = customer.getString("name");
            String address = customer.getString("address");
            double salary = Double.parseDouble(customer.get("salary").toString());

            Connection connection = ds.getConnection();
            PreparedStatement pstm = connection.prepareStatement("insert into Customer values(?,?,?,?)");
            pstm.setObject(1, id);
            pstm.setObject(2, name);
            pstm.setObject(3, address);
            pstm.setObject(4, salary);
            boolean b = pstm.executeUpdate() > 0;
            resp.getWriter().print(b);
            connection.close();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
