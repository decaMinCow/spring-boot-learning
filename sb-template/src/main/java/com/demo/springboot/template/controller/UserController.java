/**
* @Title: UserController.java 
* @Package com.demo.springboot.template.controller
* @Description: 控制器
* @author decamincow
* @date 2016年9月17日
* @version V1.0
*/
package com.demo.springboot.template.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.demo.springboot.template.po.User;

/**
 * @ClassName: UserController
 * @Description: 测试所用控制器
 * @author decamincow
 * @date 2016年9月17日
 *
 */
@Controller
@RequestMapping("decamincow")
public class UserController {
	
	static User user = new User(0, "decamincow", 10);
	static int[] score = {1, 2, 3, 4, 5}; 
	static Map<String, String> map = new HashMap<>();
	static List<User> userList = new ArrayList<User>();
	
	static{
		userList.add(new User(1, "decamincow1", 20));
		userList.add(new User(2, "decamincow2", 30));
		userList.add(new User(3, "decamincow3", 40));
		map.put("key1", "val1");
		map.put("key2", "val2");
		map.put("key3", "val3");
	}

	/************************************** 页面跳转 **************************************/

	// 根目录
	@RequestMapping(value = { "/", "/index" })
	public String index() {
		return "index";
	}

	// 返回非 html 内容
	@RequestMapping("responsebody")
	@ResponseBody
	public String responseBody() {
		return "{id:12,content:'hello world'}";
	}

	// 传入参数
	@RequestMapping("pathVariable/{id}/{content}")
	@ResponseBody
	public String testPathVariable(@PathVariable int id, @PathVariable String content) {
		return "{id:" + id + ",content: " + content + "}";
	}

	// 传入与变量名称不同的参数
	@RequestMapping("pathVariable2/{id}")
	@ResponseBody
	public String testPathVariable2(@PathVariable("id") String num) {
		System.out.println("num: " + num);
		return "{num:" + num + "}";
	}

	// 请求被重定向到 index 页面
	@RequestMapping("redirect")
	public String testRedirect() {
		return "redirect:/decamincow/index";
	}

	// 请求被转发到 index 页面
	@RequestMapping("forward")
	public String testForward() {
		return "forward:/decamincow/index";
	}

	/************************************** 传参返回View **************************************/

	// 返回 html 页面
	@GetMapping("/page1")
	public ModelAndView mav() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("page1");
		return mav;
	}

	// 返回 html 页面
	@GetMapping("/page2")
	public ModelAndView session(HttpSession httpSession, HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("page2");
		return mav;
	}

	// 返回 html 并获取参数
	// http://localhost:8080/decamincow/page2?testVale=1
	@GetMapping("/page3")
	public ModelAndView request(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("page3");
		System.out.println(request.getParameter("testVale"));
		return mav;
	}

	@GetMapping("/page4")
	public String page4(Model model) {
		model.addAttribute("name", "Decamincow");
		model.addAttribute("age", 12);
		model.addAttribute("time", new Date());
		return "page4";
	}

	@GetMapping("/page5")
	public String page5(Map<String, Object> map) {
		map.put("name", "Decamincow2");
		map.put("age", 21);
		map.put("time", new Date());
		return "page4";
	}

	@GetMapping("/page6")
	public ModelAndView page6() {
		ModelAndView mav = new ModelAndView("page4");
		mav.addObject("name", "Decamincow3");
		mav.addObject("age", 23);
		mav.addObject("time", new Date());
		return mav;
	}
	
	@GetMapping("/page")
	public String page(Model model) {
//		System.out.println("user:" + user.toString());
//		System.out.println("score:" + score.toString());
//		System.out.println("map:" + map.toString());
//		System.out.println("userList:" + userList.toString());
		model.addAttribute("userModel", user);
		model.addAttribute("score", score);
		model.addAttribute("map", map);
		model.addAttribute("userList", userList);
		return "page";
	}
	
    @PostMapping("/delete")
    public String delete(@ModelAttribute User userModel, Model model) {
    	userList.add(userModel);
		model.addAttribute("userModel", user);
		model.addAttribute("score", score);
		model.addAttribute("map", map);
		model.addAttribute("userList", userList);
        return "page";
    }
	

}
