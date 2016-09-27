/**
* @Title: User.java
* @Package com.demo.springboot.template.po
* @Description: TODO(用一句话描述该文件做什么)
* @author decamincow
* @date 2016年9月17日
* @version V1.0
*/
package com.demo.springboot.template.po;

import java.io.Serializable;

/**
 * @ClassName: User
 * @Description: 建立User对象
 * @author decamincow
 * @date 2016年9月17日
 *
 */
public class User implements Serializable {

	private static final long serialVersionUID = 1L;
	private int id;
	private String userName;
	private int userAge;
	
	/**
	* 创建一个新的实例 User.
	*
	* @param id
	* @param userName
	* @param userAge
	*/
	public User(int id, String userName, int userAge) {
		super();
		this.id = id;
		this.userName = userName;
		this.userAge = userAge;
	}
	
	/**
	* 创建一个新的实例 User.
	*
	*/
	public User() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getUserAge() {
		return userAge;
	}

	public void setUserAge(int userAge) {
		this.userAge = userAge;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", userAge=" + userAge + "]";
	}

}
