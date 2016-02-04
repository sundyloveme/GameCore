package com.sundy.www.gamecore;

//单例模式
public class NumberManager
{
	private int i;
	// 建立一个单例对象
	public static NumberManager instance = new NumberManager();

	/**
	 * 获得一个新的编号
	 * 
	 * @return 编号
	 */
	public int getNum()
	{
		return i++;
	}

	// 私有的构造函数
	private NumberManager()
	{
	}
}
