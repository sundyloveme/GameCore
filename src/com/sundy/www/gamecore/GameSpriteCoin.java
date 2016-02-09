package com.sundy.www.gamecore;

import java.awt.Dimension;
import java.awt.Point;

import com.rupeng.game.GameCore;

/**
 * 一个金币类，继承与精灵类
 * @author Sundy
 *
 */
public class GameSpriteCoin 
{
	//是否被吃了 false没吃 true吃了
	private boolean book;
	private GameSprite spCoin;
	
	/**
	 * 构造函数
	 */
	public GameSpriteCoin(int x,int y)
	{
		spCoin =new GameSprite("coin", x, y);
		spCoin.playSpriteAnimate("rotate");
	}

	/**
	 * 返回金币对象
	 * @return
	 */
	public GameSprite getSpcoin()
	{
		return spCoin;
	}
	
	/**
	 * 是否被吃了
	 * true 吃了
	 * false 没吃呢
	 * @return book
	 */
	public boolean getBook()
	{
		return book;
	}

	/**
	 * 该金币被吃了 
	 */
	public void eat()
	{
		this.book = true;
	}
}
