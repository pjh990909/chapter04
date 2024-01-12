package com.javaex.ex02;

import java.util.Arrays;

import com.javaex.ex01.Point;

public class MyList {
	
	private Object[] oArray;
	private int crtPos;
	
	public MyList() {
		//원래 만들지않음 편의상 가정
		oArray = new Object[3];
		crtPos = 0;
	}
	
	public void add(Object o) {
		//현재 배열개수+1 배열을 새로 만든다
		//이전배열의 값을 새배열에 옮긴다
		//마지막방에 새주소를 추가한다
		//배열새로만들고 이전거 복사하고 받은거 추가하고
		oArray[crtPos] = o;
		crtPos +=1;
	}
	public int size() {
		return crtPos;
	}
	
	public Object get(int index) {
		
		return oArray[index];//index방 안에 있는 Point주소
	}

	@Override
	public String toString() {
		return "MyList [oArray=" + Arrays.toString(oArray) + ", crtPos=" + crtPos + "]";
	}
	
	
	

}
