/**
* @Title: Decamincow.java
* @Package com.demo.springboot.configuration.properties
* @Description: TODO(用一句话描述该文件做什么)
* @author decamincow
* @date 2016年9月30日
* @version V1.0
*/
package com.demo.springboot.configuration.properties;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @ClassName: Decamincow
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author decamincow
 * @date 2016年9月30日
 *
 */
@Component
@ConfigurationProperties(prefix="decamincow", locations="classpath:config/decamincow.yml")
public class Decamincow {

	private String name;
	private int gender;
	private Integer[] arrayInt;
	private Map<String, String> mapProps = new HashMap<>();
	private List<Map<String, String>> mapList = new ArrayList<>();
	private List<String> stringList = new ArrayList<>();
	private String randomString;
	private int randomInt;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getGender() {
		return gender;
	}

	public void setGender(int gender) {
		this.gender = gender;
	}

	public Integer[] getArrayInt() {
		return arrayInt;
	}

	public void setArrayInt(Integer[] arrayInt) {
		this.arrayInt = arrayInt;
	}

	public Map<String, String> getMapProps() {
		return mapProps;
	}

	public void setMapProps(Map<String, String> mapProps) {
		this.mapProps = mapProps;
	}

	public List<Map<String, String>> getMapList() {
		return mapList;
	}

	public void setMapList(List<Map<String, String>> mapList) {
		this.mapList = mapList;
	}

	public List<String> getStringList() {
		return stringList;
	}

	public void setStringList(List<String> stringList) {
		this.stringList = stringList;
	}

	public String getRandomString() {
		return randomString;
	}

	public void setRandomString(String randomString) {
		this.randomString = randomString;
	}

	public int getRandomInt() {
		return randomInt;
	}

	public void setRandomInt(int randomInt) {
		this.randomInt = randomInt;
	}

	@Override
	public String toString() {
		return "Decamincow [name=" + name + ", gender=" + gender + ", arrayInt=" + Arrays.toString(arrayInt)
				+ ", mapProps=" + mapProps + ", mapList=" + mapList + ", stringList=" + stringList + ", randomString="
				+ randomString + ", randomInt=" + randomInt + "]";
	}

}
