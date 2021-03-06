package com.example.sscsis.mappybird;

import android.graphics.Bitmap;
import android.graphics.Canvas;

public class Background {
	private Bitmap bitmap;	// the actual bitmap
	private int x;			// the X coordinate
	private int y;			// the Y coordinate
	
	public Background(Bitmap bitmap, int x, int y) {
		this.bitmap = bitmap;
		this.x = x;
		this.y = y;
	}
	public Bitmap getBitmap() {
		return bitmap;
	}
	public void setBitmap(Bitmap bitmap) {
		this.bitmap = bitmap;
	}
	public void draw(Canvas canvas) {
		canvas.drawBitmap(bitmap, x, y, null);
	}
}
