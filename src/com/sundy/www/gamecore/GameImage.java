package com.sundy.www.gamecore;

import java.awt.Dimension;
import java.awt.Point;

import com.rupeng.game.GameCore;

public class GameImage extends GameRect
{

	// 图片的编号
	private int ImageNum;

	/**
	 * 构造函数
	 * 
	 * @param imgName
	 *            图片名称
	 */
	public GameImage(String imgName)
	{
		this.ImageNum = NumberManager.instance.getNum();
		GameCore.createImage(this.ImageNum, imgName);
	}

	/**
	 * 缺省构造函数
	 */
	public GameImage()
	{
		this("");
	}

	/**
	 * 显示图片
	 */
	@Override
	public void show()
	{
		GameCore.showImage(this.ImageNum);
	}

	/**
	 * 隐藏图片
	 */
	@Override
	public void hide()
	{
		GameCore.hideImage(ImageNum);
	}

	/**
	 * 获得坐标
	 */
	@Override
	public Point getPosition()
	{
		return GameCore.getImagePosition(ImageNum);
	}

	/**
	 * 设置坐标
	 */
	@Override
	public void setPosition(Point pos)
	{
		GameCore.setImagePosition(ImageNum, pos.x, pos.y);
	}

	/**
	 * 设置坐标
	 */
	@Override
	public void setPosition(int x, int y)
	{
		GameCore.setImagePosition(ImageNum, x, y);
	}

	/**
	 * 获得x
	 */
	@Override
	public int getX()
	{
		return GameCore.getImageX(ImageNum);
	}

	/**
	 * 获得y
	 */
	@Override
	public int getY()
	{
		return GameCore.getImageY(ImageNum);
	}

	/**
	 * 设置图片名称
	 * 
	 * @param imgName
	 *            图片名称
	 */
	public void setImgName(String imgName)
	{
		GameCore.setImageSource(this.ImageNum, imgName);
	}

	/**
	 * 移除图片
	 */
	public void remove()
	{
		GameCore.removeImage(this.ImageNum);
	}

	@Override
	public Dimension getSize()
	{
		return GameCore.getImageSize(ImageNum);
	}

	@Override
	public int getHeight()
	{
		return GameCore.getImageHeight(ImageNum);
	}

	@Override
	public int getWidth()
	{
		return GameCore.getImageWidth(ImageNum);
	}

}
