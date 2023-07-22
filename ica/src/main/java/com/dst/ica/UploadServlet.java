package com.dst.ica;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.Part;

@WebServlet("/UploadServlet")
public class UploadServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
@Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Part filePart = request.getPart("file");
        Scanner scanner = new Scanner(filePart.getInputStream());

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ica", "root", "Lhz021209");

            String query = "INSERT INTO your_table_name (column1, column2, column3) VALUES (?, ?, ?)";
            PreparedStatement pstmt = conn.prepareStatement(query);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] values = line.split("\t");

                pstmt.setString(1, values[0]);
                pstmt.setString(2, values[1]);
                pstmt.setString(3, values[2]);
                pstmt.executeUpdate();
            }

            scanner.close();
            pstmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        request.setAttribute("filePart", filePart);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/PharmGKBServlet");
        dispatcher.forward(request, response);
    }
}