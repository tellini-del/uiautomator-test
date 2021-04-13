package com.example.sampleuiautomatorproject.test

import androidx.test.ext.junit.runners.AndroidJUnit4
import com.example.sampleuiautomatorproject.application.Ozon
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)

class UnauthorizedReviewToRegister: AbstractApplicationTest<Ozon>(Ozon()) {

    @Test
    fun unauthorizedUserReviewToRegister () = with(app){
        openApp()
        tapOutside()
        clickSearch()
        typeToSearch("философия java")
        tapAboutProduct()
        searchForText("Написать отзыв")
        checkPageName()
    }
}