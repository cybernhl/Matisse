/*
 * Copyright 2017 Zhihu Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.zhihu.matisse.engine.impl;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;

import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import com.squareup.picasso.Picasso;
import com.zhihu.matisse.engine.ImageEngine;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/**
 * {@link ImageEngine} implementation using Picasso.
 */

public class PicassoEngine implements ImageEngine {

    @Override
    public void loadThumbnail(Context context, int resize, Drawable placeholder, ImageView imageView, Uri uri) {
//        Picasso.with(context).load(uri).placeholder(placeholder)
//                .resize(resize, resize)
//                .centerCrop()
//                .into(imageView);
    }

    @Override
    public void loadGifThumbnail(Context context, int resize, Drawable placeholder, ImageView imageView,
                                 Uri uri) {
        loadThumbnail(context, resize, placeholder, imageView, uri);
    }

    @Override
    public void loadImage(Context context, int resizeX, int resizeY, ImageView imageView, Uri uri) {
//        Picasso.with(context).load(uri).resize(resizeX, resizeY).priority(Picasso.Priority.HIGH)
//                .centerInside().into(imageView);
    }

    @Override
    public void loadGifImage(Context context, int resizeX, int resizeY, ImageView imageView, Uri uri) {
        loadImage(context, resizeX, resizeY, imageView, uri);
    }

    @Override
    public boolean supportAnimatedGif() {
        return false;
    }

    @Override
    public void loadLargeImage(@NonNull Context context, int resizeX, int resizeY, @NonNull SubsamplingScaleImageView imageView, @Nullable Uri uri) {

    }
}
