package com.example.bottomnavigationbarjetpackcompose.navigation

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.bottomnavigationbarjetpackcompose.R

sealed class Screen(
    val route: String,
    @StringRes val resourceId: Int,
    @DrawableRes val drawableId: Int
) {
    object Home: Screen("home", R.string.home_icon, R.drawable.home_icon)
    object Search: Screen("search", R.string.search_icon, R.drawable.search_icon)
}
