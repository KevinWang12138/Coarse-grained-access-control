package filter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

public class AdminFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        /**
         * 1.得到session
         * 2.判断session中是否存在admin，存在则放行
         * 3.判断session中是否存在username，存在则放行
         */
        HttpServletRequest req=(HttpServletRequest) servletRequest;
        String name=(String) req.getSession().getAttribute("admin");
        System.out.println(name);
        if(name!=null)
        {
            filterChain.doFilter(servletRequest,servletResponse);
            return;
        }else{
            req.setAttribute("msg","您无权访问");
            req.getRequestDispatcher("/login.jsp").forward(servletRequest,servletResponse);
        }
    }

    @Override
    public void destroy() {

    }
}
