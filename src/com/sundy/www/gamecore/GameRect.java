package com.sundy.www.gamecore;

import java.awt.Dimension;
import java.awt.Point;

public abstract class GameRect extends GameObject
{

	public abstract Dimension getSize();

	public abstract int getHeight();

	public abstract int getWidth();

	/**
	 * 判断精灵与rect是否相交
	 * 
	 * @param rect
	 *            另一个精灵
	 * @return true交 false不相交
	 */
	public Boolean xiangJiao(GameRect rect)
	{
		int a, b,h,ry;

		
		h=rect.getHeight();
		ry=rect.getY();
		a = rect.getY() + rect.getHeight();
		b = getY();
		// 上矩形
		if (rect.getY() + rect.getHeight() < getY())
		{
			return false;
		}

		a = rect.getY();
		b = getY() + getHeight();
		// 下矩形
		if (rect.getY() > getY() + getHeight())
		{
			return false;
		}
		
		a = rect.getX() + rect.getWidth();
		b = getX();
		// 左矩形
		if (rect.getX() + rect.getWidth() < getX())
		{
			return false;
		}
		
		a = getX() + getWidth();
		b = rect.getX();
		// 右矩形
		if (getX() + getWidth() < rect.getX())
		{
			return false;
		}

		return true;
	}

}
