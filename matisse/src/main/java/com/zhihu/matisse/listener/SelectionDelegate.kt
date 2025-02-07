package com.zhihu.matisse.listener

import com.zhihu.matisse.internal.entity.Item
import com.zhihu.matisse.internal.model.SelectedItemCollection


/**
 * _   _ _______   ________ _       _____   __
 * | \ | |_   _\ \ / /| ___ \ |     / _ \ \ / /
 * |  \| | | |  \ V / | |_/ / |    / /_\ \ V /
 * | . ` | | |  /   \ |  __/| |    |  _  |\ /
 * | |\  |_| |_/ /^\ \| |   | |____| | | || |
 * \_| \_/\___/\/   \/\_|   \_____/\_| |_/\_/
 *
 *
 * Created by jameskong on 2019-06-03.
 */
interface SelectionDelegate {
    fun getCause(reach: SelectedItemCollection.MaxItemReach?): String?
    fun onTapItem(item: Item?, isDontShow: Boolean?)
}