package com.zhihu.matisse.engine.impl;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;

import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import com.nostra13.universalimageloader.core.DisplayImageOptions;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.assist.ImageScaleType;
import com.zhihu.matisse.engine.ImageEngine;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/**
 * ImageLoader's engine
 *
 * @author act262@gmail.com
 */
public class UILEngine implements ImageEngine {

    private DisplayImageOptions thumbOptions = new DisplayImageOptions.Builder()
            .cacheOnDisk(false)
            .cacheInMemory(false)
            .bitmapConfig(Bitmap.Config.RGB_565)
            .imageScaleType(ImageScaleType.IN_SAMPLE_INT)
            .considerExifParams(true)
//            .showImageForEmptyUri(R.drawable.default_holder)
//            .showImageOnFail(R.drawable.default_holder)
//            .showImageOnLoading(R.drawable.default_holder)
            .build();

    private DisplayImageOptions imageOptions = new DisplayImageOptions.Builder()
            .cacheOnDisk(false)
            .cacheInMemory(false)
            .bitmapConfig(Bitmap.Config.RGB_565)
            .imageScaleType(ImageScaleType.IN_SAMPLE_POWER_OF_2)
            .considerExifParams(true)
//            .showImageForEmptyUri(R.drawable.default_holder)
//            .showImageOnFail(R.drawable.default_holder)
//            .showImageOnLoading(R.drawable.default_holder)
            .build();

    @Override
    public void loadThumbnail(Context context, int resize, Drawable drawable, ImageView imageView, Uri uri) {
        ImageLoader.getInstance().displayImage(uri.toString(), imageView, thumbOptions);
    }

    @Override
    public void loadGifThumbnail(Context context, int resize, Drawable placeholder, ImageView imageView, Uri uri) {
        ImageLoader.getInstance().displayImage(uri.toString(), imageView, thumbOptions);
    }

    @Override
    public void loadImage(Context context, int resizeX, int resizeY, ImageView imageView, Uri uri) {
        ImageLoader.getInstance().displayImage(uri.toString(), imageView, imageOptions);
    }

    @Override
    public void loadGifImage(Context context, int resizeX, int resizeY, ImageView imageView, Uri uri) {
        ImageLoader.getInstance().displayImage(uri.toString(), imageView, imageOptions);
    }

    @Override
    public boolean supportAnimatedGif() {
        // ImageLoader not support gif
        return false;
    }

    @Override
    public void loadLargeImage(@NonNull Context context, int resizeX, int resizeY, @NonNull SubsamplingScaleImageView imageView, @Nullable Uri uri) {

    }
}
