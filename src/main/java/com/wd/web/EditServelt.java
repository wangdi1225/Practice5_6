package com.wd.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.wd.bean.Clothes;
import com.wd.service.ClothesService;

@WebServlet("/edit_do")
public class EditServelt extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public EditServelt() {
        super();
        // TODO Auto-generated constructor stub
    }

    private ClothesService cs;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//ServletContextListener 可以通过配置监听器来达到我们的需求，在web项目创建时候创建spring容器，销毁时候关闭spring容器
				WebApplicationContext wac = WebApplicationContextUtils.getWebApplicationContext(getServletContext());
				cs = (ClothesService) wac.getBean("clothesService");
				request.setCharacterEncoding("utf-8");
				String id=request.getParameter("id");
				Clothes clothes=cs.selectById(id);
				
				request.setAttribute("clothes",clothes);
				request.getRequestDispatcher("/update.jsp").forward(request, response);
		
	}

	
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
