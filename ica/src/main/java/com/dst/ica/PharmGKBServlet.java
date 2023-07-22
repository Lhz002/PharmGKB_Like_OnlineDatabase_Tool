package com.dst.ica;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.Part;

@WebServlet("/PharmGKBServlet")
public class PharmGKBServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
@Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        Part filePart = (Part) request.getAttribute("filePart");
        Scanner scanner = new Scanner(filePart.getInputStream());

        String apiKey = "API_KEY_HERE";

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] values = line.split("\t");
            String variantId = values[0];

            URL url = new URL("https://api.pharmgkb.org/v1/site/variants/" + variantId);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setRequestProperty("Authorization", "Bearer " + apiKey);

            Scanner apiScanner = new Scanner(conn.getInputStream());
            while (apiScanner.hasNextLine()) {
                out.println(apiScanner.nextLine());
            }
            apiScanner.close();
        }

        scanner.close();
    }
}