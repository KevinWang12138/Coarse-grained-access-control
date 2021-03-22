package servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
/**
 * 1.获取用户名
 * 2.判断是否含有admin
 * 3.如果有，就是管理员
 * 4.如果没有，就是会员
 * 5.要把用户名称保存到session中
 * 6.转发到index.jsp
 */
public class loginServlet extends HttpServlet{
    public void doPost(HttpServletRequest req,HttpServletResponse rsp)throws ServletException, IOException {
        String username=req.getParameter("username");
        if(username.contains("admin")){
            req.getSession().setAttribute("admin",username);
        }else{
            req.getSession().setAttribute("username",username);
        }
        req.getRequestDispatcher("/index.jsp").forward(req,rsp);
    }

}
