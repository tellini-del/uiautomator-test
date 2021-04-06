package com.example.sampleuiautomatorproject.test

import androidx.test.ext.junit.runners.AndroidJUnit4
import com.example.sampleuiautomatorproject.application.Ozon
import org.junit.Test
import org.junit.runner.RunWith

@RunWith (AndroidJUnit4::class)
class EmailValidation: AbstractApplicationTest<Ozon>(Ozon()) {

    @Test
    fun checkHintWithWrongMail() = with(app) {
        openApp()
        tapOutside()
        goToCabinet()
        goToRegistration()
        goToMailRegistration()
        setWrongMail("sadagas")
        getCodeRegistration()
        checkHintErrorWithWrongMail()
    }
}