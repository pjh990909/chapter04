package com.javaex.ex01;

import java.util.Arrays;

public class PointList {
	
	private Point[] pArray;
	private int crtPos;
	
	public PointList() {
		//원래 만들지 않음 펀의상 가정
		pArray = new Point[3];
		crtPos = 0;
	}
	
	public void add(Point p) {
		//현재 배열개수+1 배열을 새로 만든다
		//이전배열의 값을 새배열에 옮긴다
		//마지막방에 새주소를 추가한다
		//배열새로만들고 이전거 복사하고 받은거 추가하고
		pArray[crtPos] = p;
		crtPos +=1;
	}
	
	public int size() {
		return crtPos;
	}
	
	public Point get(int index) {
		
		return pArray[index];//index방 안에 있는 Point주소
	}

	@Override
	public String toString() {
		return "PointList [pArray=" + Arrays.toString(pArray) + ", crtPos=" + crtPos + "]";
	}
	
	

}
