package com.zhihu.matisse.internal.ui.widget

import android.graphics.Rect
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ItemDecoration

class MediaGridInset(
    private val spanCount: Int,
    private val spacing: Int,
    private val includeEdge: Boolean
) : ItemDecoration() {

    override fun getItemOffsets(
        outRect: Rect, view: View, parent: RecyclerView,
        state: RecyclerView.State
    ) {
        val position = parent.getChildAdapterPosition(view) // item position
        val column = position % spanCount // item column
        if (includeEdge) {
            // spacing - column * ((1f / spanCount) * spacing)
            outRect.left = spacing - column * spacing / spanCount
            // (column + 1) * ((1f / spanCount) * spacing)
            outRect.right = (column + 1) * spacing / spanCount
            if (position < spanCount) { // top edge
                outRect.top = spacing
            }
            outRect.bottom = spacing // item bottom
        } else {
            // column * ((1f / spanCount) * spacing)
            outRect.left = column * spacing / spanCount
            // spacing - (column + 1) * ((1f / spanCount) * spacing)
            outRect.right = spacing - (column + 1) * spacing / spanCount
            if (position >= spanCount) {
                outRect.top = spacing // item top
            }
        }
    }
}