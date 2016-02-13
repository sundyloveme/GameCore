package com.sundy.www.gamecore;

import java.awt.Dimension;
import java.awt.Point;

import com.rupeng.game.GameCore;

/**
 * 游戏图片的类
 * 
 * @author Sundy
 * (moveRight和moveLeft在image类中不可使用)
 */
public class GameImage extends GameRect
{

	// 图片的编号
	private int ImageNum;

	/**
	 * 构造函数
	 * 
	 * @param imgName
	 *            图片名称（.jpg结尾）
	 * @param x
	 *            坐标x
	 * @param y
	 *            坐标y （如果没有设置坐标，则图片不会显示）
	 */
	public GameImage(String imgName, int x, int y)
	{
		// 通过编号器获得编号
		this.ImageNum = NumberManager.instance.getNum();
		GameCore.createImage(this.ImageNum, imgName);
		GameCore.setImagePosition(ImageNum, x, y);
	}

	/**
	 * 显示
	 */
	@Override
	public void show()
	{
		GameCore.showImage(this.ImageNum);
	}

	/**
	 * 隐藏
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
	 * 获得坐标x
	 */
	@Override
	public int getX()
	{
		return GameCore.getImageX(ImageNum);
	}

	/**
	 * 获得坐标y
	 */
	@Override
	public int getY()
	{
		return GameCore.getImageY(ImageNum);
	}

	/**
	 * 设置名称
	 * 
	 * @param imgName
	 *            图片名称
	 */
	public void setImgName(String imgName)
	{
		GameCore.setImageSource(this.ImageNum, imgName);
	}

	/**
	 * 移除
	 */
	public void remove()
	{
		GameCore.removeImage(this.ImageNum);
	}

	/**
	 * 获得尺寸
	 */
	@Override
	public Dimension getSize()
	{
		return GameCore.getImageSize(ImageNum);
	}

	/**
	 * 获得高度
	 */
	@Override
	public int getHeight()
	{
		return GameCore.getImageHeight(ImageNum);
	}

	/**
	 * 获得宽度
	 */
	@Override
	public int getWidth()
	{
		return GameCore.getImageWidth(ImageNum);
	}

}
