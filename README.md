# QuiltViewLibrary

This is the beautiful QuiltView

![quilt](http://dl.dropbox.com/u/36133003/quilt.png "QuiltView")

# Using This Library

Dependencies
------------
This library depends on gridlayout_v7 (https://github.com/Ponyets/Trifles/tree/master/gridlayout_v7)

Setup
-----

The QuiltView can be defined in XML:

    <FrameLayout xmlns:android="http://schemas.android.com/apk/res/android"
        xmlns:tools="http://schemas.android.com/tools"
        xmlns:app="http://schemas.android.com/apk/res/com.jake.quiltviewsample"
        android:id="@+id/FrameLayout1"
        android:layout_width="match_parent"
        android:layout_height="match_parent">
    
        <com.jake.quiltview.QuiltView
            android:id="@+id/quilt"
            android:layout_width="match_parent"
            android:layout_height="match_parent"
            android:padding="5dip"
            app:scrollOrientation="horizontal|vertical" >
        </com.jake.quiltview.QuiltView>
    
    </FrameLayout>
    
Or in code
    
    boolean isVertical = true|false; //defines which direction the QuiltView will scroll: true = Vertical, false = Horizontal
    
    QuiltView quiltView = new QuiltView(context, isVertical);
    
    
Adding Children
---------------

Children must be added to The QuiltView programmatically as an ArrayList of ImageViews:

    ArrayList<ImageView> images = new ArrayList<ImageView>();
    for(int i = 0; i < num; i++){
    	ImageView image = new ImageView(this.getApplicationContext());
    	image.setScaleType(ScaleType.CENTER_CROP);
    	image.setImageResource(R.drawable.bg);
    	images.add(image);
    }
    quiltView.addPatchImages(images);

Or an ArrayList of Views

    ArrayList<View> views = new ArrayList<View>();
    for(int i = 0; i < num; i++){
      FrameLayout patch = new FrameLayout(this.getApplicationContext());
    	views.add(patch);
    }
    quiltView.addPatchViews(views);


