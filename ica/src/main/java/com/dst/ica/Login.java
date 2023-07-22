package com.dst.ica;

import com.dst.Entity.Users;
import com.dst.Mapper.UserMapper;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import lombok.SneakyThrows;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.util.*;

@SuppressWarnings("ALL")
@WebServlet(name = "Login", value = "/Login")
public class Login extends HttpServlet {

    SqlSessionFactory factory;
    @SneakyThrows
    @Override
    public void init() throws ServletException {
        factory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsReader("mybatis-config.xml"));
    }



    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
//获取POST请求携带的表单数据
        Map<String,String[]> map = req.getParameterMap();
//判断表单是否完整
        if(map.containsKey( "username") && map.containsKey( "password")) {
            String username = req.getParameter( "username");
            String password = req.getParameter( "password");

            try(SqlSession sqlSession = factory.openSession(true)){
                UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
                Users user = userMapper.getUser(username,password);


                if (user != null){
                    resp.getWriter().write("User"+username+"login successful");
                    req.getRequestDispatcher("/success.jsp").forward(req, resp);
                }

                else{
                    resp.getWriter().write("the user is not exist or password wrong");
                }
            }
        }
//权限校验 (待完善)
            else{
            resp.getWriter().write( "错误，您的表单数据不完整!");
            }

    }
}