# QuiltViewLibrary

QuiltView displays **views of different sizes** in a **scrollable grid**.

![quilt](https://raw.github.com/jacobmoncur/QuiltViewLibrary/master/nexus7.png "QuiltView") ![quilt](https://raw.github.com/jacobmoncur/QuiltViewLibrary/master/nexus7_mayer.png "QuiltView")

Dependencies
------------
This library depends on gridlayout_v7 (git@github.com:jacobmoncur/gridlayout_v7.git)

Setup
-----

The QuiltView can be defined by XML:

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
    
Or programmatically
    
    boolean isVertical = true|false; //defines which direction the QuiltView will scroll: true = Vertical, false = Horizontal
    QuiltView quiltView = new QuiltView(context, isVertical); //(QuiltView) findViewById(R.id.quilt);
    
    
Adding Children
---------------

Children must be added to the QuiltView programmatically as an ArrayList of ImageViews:

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

Goals for this view
-------------------
* Have no _empty_ patches
* Be sudo-random (lays out the children differently each time)
* Looks awesome!

TODO
----
* Custom Adapter to allow view recycling
* Be able to define children in XML
* Adapt better to different screen sizes


