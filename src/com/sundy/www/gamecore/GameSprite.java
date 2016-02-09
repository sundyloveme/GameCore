package com.sundy.www.gamecore;

import java.awt.Dimension;
import java.awt.Point;

import com.rupeng.game.GameCore;

public class GameSprite extends GameRect
{
	//精灵的编号
	private int spriteNum;
	
	/**
	 * 构造函数
	 * @param spriteName 精灵名字
	 */
	public GameSprite(String spriteName)
	{
		this.spriteNum=NumberManager.instance.getNum();
		GameCore.createSprite(this.spriteNum, spriteName);
	}
	
	/**
	 * 构造函数
	 * @param spriteName 精灵名字
	 * @param x x坐标
	 * @param y y坐标
	 */
	public GameSprite(String spriteName,int x,int y)
	{
		this(spriteName);
		GameCore.setSpritePosition(this.spriteNum, x, y);
	}
	
	/**
	 * 显示精灵
	 */
	@Override
	public void show()
	{
		GameCore.showSprite(this.spriteNum);
	}

	/**
	 * 隐藏精灵
	 */
	@Override
	public void hide()
	{
		GameCore.hideSprite(this.spriteNum);
	}

	/**
	 * 得到坐标
	 */
	@Override
	public Point getPosition()
	{
		return GameCore.getSpritePosition(this.spriteNum);
	}

	/**
	 * 设置坐标
	 */
	@Override
	public void setPosition(Point pos)
	{
		GameCore.setSpritePosition(this.spriteNum, pos.x, pos.y);
	}

	/**
	 * 设置坐标
	 */
	@Override
	public void setPosition(int x, int y)
	{
		GameCore.setSpritePosition(this.spriteNum, x, y);
	}

	/**
	 * 获得x
	 */
	@Override
	public int getX()
	{
		return GameCore.getSpriteX(this.spriteNum);
	}

	/**
	 * 获得y
	 */
	@Override
	public int getY()
	{
		return GameCore.getSpriteY(this.spriteNum);
	}
	
	/**
	 * 播放动作
	 * @param animateName 动作名称
	 */
	public void playSpriteAnimate(String animateName)
	{
		GameCore.playSpriteAnimate(this.spriteNum, animateName, true);
	}
	
	/**
	 * 获得高度
	 * @return
	 */
	@Override
	public int getHeight()
	{
		return GameCore.getSpriteHeight(spriteNum);
	}
	
	/**
	 * 获得宽度
	 * @return
	 */
	@Override
	public int getWidth()
	{
		return GameCore.getSpriteWidth(spriteNum);
	}
	
	/**
	 * 移除精灵
	 */
	public void remove()
	{
		GameCore.removeSprite(spriteNum);
	}
	
	/**
	 * 沿x轴反转
	 * @param flipX
	 */
	public void setFlipX(boolean flipX)
	{
		GameCore.setSpriteFlipX(spriteNum, flipX);
	}
	
	/**
	 * 沿y轴反转
	 * @param flipY
	 */
	public void setFlipY(boolean flipY)
	{
		GameCore.setSpriteFlipY(spriteNum, flipY);
	}
	

	@Override
	public Dimension getSize()
	{
		return GameCore.getSpriteSize(spriteNum);
	}

	
}
