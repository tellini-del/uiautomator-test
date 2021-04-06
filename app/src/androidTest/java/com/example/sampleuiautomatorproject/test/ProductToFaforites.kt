package com.example.sampleuiautomatorproject.test

import androidx.test.ext.junit.runners.AndroidJUnit4
import com.example.sampleuiautomatorproject.application.Ozon
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class ProductToFaforites: AbstractApplicationTest<Ozon>(Ozon()) {

    @Test
    fun addToFavorite() = with(app) {
        openApp()
        tapOutside()
        clickSearch()
        typeToSearch("философия java")
        tapAboutProduct()
        moveToFavorite()
        tapOutside()
        goToFavorite()
        checkFavoritePage()
        checkName()
    }
}