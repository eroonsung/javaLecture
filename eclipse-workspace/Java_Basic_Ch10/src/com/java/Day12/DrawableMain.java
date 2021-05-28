package com.java.Day12;

public class DrawableMain {

	public static void main(String[] args) {
		Drawable[] drawables = new Drawable[] {
				new Rectangle(5,8,8,9)
		};
		
		for(Drawable d: drawables) {
			d.draw(Drawable.RED);
		}

		// 밑의 방법으로도 사용 가능
//		new Drawable() {
//			public void draw(int color) {
//				
//			}
//		}

	}

}
