package com.examples.yashmvc.ProductsProject.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.examples.yashmvc.ProductsProject.model.Products;
import com.examples.yashmvc.ProductsProject.util.Dbutils;

@Controller
public class HomeController {

	@RequestMapping(value="/")
	public ModelAndView test(HttpServletResponse response) throws IOException{
		return new ModelAndView("home");
	}
	@RequestMapping(value="/login")
	public ModelAndView login(HttpServletResponse response) throws IOException{
		return new ModelAndView("login");
	}
	@RequestMapping(value="/addProduct")
	public ModelAndView addProduct(HttpServletResponse response) throws IOException{
		return new ModelAndView("addProduct");
	}
	@RequestMapping(value="/Search")
	public ModelAndView searchProduct(HttpServletResponse response) throws IOException{
		
		return new ModelAndView("searchProduct");
	}
	@RequestMapping(value="/actionAddProduct")
	public ModelAndView actionaddProduct(HttpServletResponse response, HttpServletRequest request,
			@RequestParam("pid") int pid, @RequestParam("pname") String pname,
			@RequestParam("quantity") int quantity,@RequestParam("price") int price) throws IOException, SQLException{
		    Connection con = Dbutils.getDatabaseConnection();
		    String query = "insert into products values (?,?,?,?)";
		    PreparedStatement pst = con.prepareStatement(query);
		    pst.setInt(1, pid);
		    pst.setString(2,pname);
		    pst.setInt(3, quantity);
		    pst.setInt(4, price);
		    int k = pst.executeUpdate();
		    if (k>0) {
		    	return new ModelAndView("display");
		    }
		    else {
		    	return new ModelAndView("failed");
		    }
	}
	@RequestMapping(value="/Register")
	public ModelAndView register(HttpServletResponse response) throws IOException{
		return new ModelAndView("register");
	}
	@RequestMapping(value="/Display")
	public ModelAndView display(HttpServletResponse response,HttpServletRequest request) throws IOException, SQLException{
		List<Products> ps = new ArrayList<Products>();
	    String query = "select * from products";
	    Connection con = Dbutils.getDatabaseConnection();
	    Statement st = con.createStatement();
	    ResultSet rs = st.executeQuery(query);
	    
	    while(rs.next()) {
	    	ps.add(new Products(rs.getInt(1),rs.getString(2), rs.getInt(3), rs.getInt(4)));
	    }
	    
	    request.setAttribute("products", ps);
		return new ModelAndView("display");
	}
	@RequestMapping(value="/actionlogin")
	public ModelAndView loginaction(HttpServletResponse response,
			@RequestParam("lid") String username,@RequestParam("pwd") String password) throws IOException{
		if (username.equals("yaswanth") && password.equals("yash")) {	
			return new ModelAndView("dashboard");
		}
		else {
			return new ModelAndView("failed");
		}
	}
	@RequestMapping(value="/test/{name}")
	public String getName(HttpServletResponse response,HttpServletRequest request, 
			@PathVariable String name) throws IOException{
		request.setAttribute("name",name);
		return "index1";
	}
}
