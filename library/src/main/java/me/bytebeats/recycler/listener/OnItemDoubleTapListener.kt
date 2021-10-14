package me.bytebeats.recycler.listener

import android.view.View
import androidx.recyclerview.widget.RecyclerView

/**
 * @Author bytebeats
 * @Email <happychinapc@gmail.com>
 * @Github https://github.com/bytebeats
 * @Created at 2021/10/14 21:06
 * @Version 1.0
 * @Description OnItemDoubleTapListener for RecyclerView
 */

interface OnItemDoubleTapListener {
    fun onItemDoubleTap(recyclerView: RecyclerView, child: View, position: Int)
}