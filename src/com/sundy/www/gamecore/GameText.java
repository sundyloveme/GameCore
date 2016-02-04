package com.sundy.www.gamecore;

import java.awt.Color;
import java.awt.Point;

import com.rupeng.game.GameCore;

public class GameText extends GameObject
{
	// 文本的编号
	private int textNum;

	/**
	 * 构造函数
	 * 
	 * @param text
	 *            文本内容
	 */
	public GameText(String text)
	{
		this.textNum = NumberManager.instance.getNum();
		GameCore.createText(this.textNum, text);
	}

	/**
	 * 缺省构造函数
	 */
	public GameText()
	{
		this("");
	}

	/**
	 * 显示文本
	 */
	@Override
	public void show()
	{
		GameCore.showText(textNum);
	}

	/**
	 * 隐藏文本
	 */
	@Override
	public void hide()
	{
		GameCore.hideText(textNum);
	}

	/**
	 * 获得坐标
	 */
	@Override
	public Point getPosition()
	{
		return GameCore.getTextPosition(textNum);
	}

	/**
	 * 设置坐标
	 */
	@Override
	public void setPosition(Point pos)
	{
		GameCore.setTextPosition(textNum, pos.x, pos.y);
	}

	/**
	 * 设置坐标
	 */
	@Override
	public void setPosition(int x, int y)
	{
		GameCore.setTextPosition(textNum, x, y);
	}

	/**
	 * 获得x
	 */
	@Override
	public int getX()
	{
		return GameCore.getTextX(textNum);
	}

	/**
	 * 获得y
	 */
	@Override
	public int getY()
	{
		return GameCore.getTextY(textNum);
	}
	
	/**
	 * 设置文字
	 * @param text
	 */
	public void setText(String text)
	{
		GameCore.setText(this.textNum, text);
	}

	/**
	 * 设置颜色
	 * @param color
	 */
	public void setTextColor(Color color)
	{
		GameCore.setTextColor(this.textNum, color);
	}
	
	/**
	 * 设置文本大小
	 * @param size
	 */
	public void setTextFontSize(int size)
	{
		GameCore.setTextFontSize(this.textNum, size);
	}
	
	/**
	 * 移除文字
	 */
	public void remove()
	{
		GameCore.removeText(textNum);
	}
}
