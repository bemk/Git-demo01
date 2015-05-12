/*
 *  Git-demo01
 *  Copyright (C) 2013  Bart Kuivenhoven
 *
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
 //mauauauauauauauauauaq
 // ik f je code

import java.util.Random;


public class Dice {
	int dice_max;
	private Random d;
	private int a;
	
	public Dice(int max)
	{
		d = new Random();
		this.dice_max = max;
	}
	
	public Dice()
	{
		this(8);
	}
	
	public int throwDice()
	{
		return d.nextInt(dice_max)+1;
	}
	
	public void watMoetIkHiermee()
	{	
		System.out.println("Ik weet het niet");)
	}
}
