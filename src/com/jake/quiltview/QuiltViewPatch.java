package com.jake.quiltview;

public class QuiltViewPatch {
	public int width_ratio;
	public int height_ratio;
	
	public QuiltViewPatch(int width_ratio, int height_ratio){
		this.width_ratio = width_ratio;
		this.height_ratio = height_ratio;
	}
	
	public int getHeightRatio(){return this.height_ratio;}
	public int getWidthRatio(){return this.width_ratio;}
	
	public static QuiltViewPatch init(int view_count){
		/*if(view_count == 0)
			return new QuiltViewItem(2,2);
		else if((view_count % 7) == 0 && getRandomBoolean())
			return new QuiltViewItem(2,2);
		else if((view_count % 4) == 0 && getRandomBoolean())
			return new QuiltViewItem(1,2);
		else 
			return new QuiltViewItem(1,1);*/
		
		if(view_count == 0)
			return new QuiltViewPatch(2,2);
		else if((view_count % 11) == 0)
			return new QuiltViewPatch(2,2);
		else if((view_count % 4) == 0)
			return new QuiltViewPatch(1,2);
		else 
			return new QuiltViewPatch(1,1);
		
	}
	
	public static boolean getRandomBoolean(){
		return (Math.random() < 0.5);
	}
}
