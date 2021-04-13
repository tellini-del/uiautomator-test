package com.example.sampleuiautomatorproject.application

import androidx.test.uiautomator.UiObject
import androidx.test.uiautomator.UiObjectNotFoundException
import androidx.test.uiautomator.UiScrollable
import androidx.test.uiautomator.UiSelector
import com.example.sampleuiautomatorproject.util.byContentDescription
import com.example.sampleuiautomatorproject.util.byStringRes
import com.example.sampleuiautomatorproject.util.byText
import com.example.sampleuiautomatorproject.util.device
import com.example.sampleuiautomatorproject.util.ext.hasObject
import com.example.sampleuiautomatorproject.util.ext.waitFindObject
import com.example.sampleuiautomatorproject.util.ext.waitIsClickable
import junit.framework.Assert.assertTrue


class Ozon : AbstractApplication("ru.ozon.app.android") {
    private val searchSelector = byStringRes("ru.ozon.app.android:id/searchTv")
    private val searchOutSelector = byStringRes("ru.ozon.app.android:id/touch_outside")
    private val searchInputSelector = byStringRes("ru.ozon.app.android:id/search_src_text")
    private val searchAddToFav = byStringRes("ru.ozon.app.android:id/favoriteIv")
    private val searchAboutProduct = byContentDescription("Философия Java Эккель Брюс")
    private val searchGoToFavorite = byStringRes("ru.ozon.app.android:id/menu_favorites")
    private val searchPageName = byStringRes("ru.ozon.app.android:id/titleTv")
    private val searchCabinet = byStringRes("ru.ozon.app.android:id/menu_profile")
    private val searchRegistryButton = byStringRes("ru.ozon.app.android:id/buttonAtomTitleTv")
    private val searchMailRegistrationButton = byText("Войти по почте")
    private val searchMailField = byStringRes("ru.ozon.app.android:id/fieldEt")
    private val searchSubmitButton = byStringRes("ru.ozon.app.android:id/submitBtn")
    private val searchHintText = byStringRes("ru.ozon.app.android:id/textinput_error")
    private val searchRegistrationPageName = byStringRes("ru.ozon.app.android:id/titleTv")
    private val otecGroup = byStringRes("ru.ozon.app.android:id/contentElementsVAL")

    fun clickSearch() {
        searchSelector.waitFindObject().click()
    }

    fun typeToSearch(text: String) {
        searchInputSelector.waitFindObject().text = text
    }

    fun tapOutside() {
        searchOutSelector.waitFindObject()
        device.pressBack()
    }

    fun checkSumAndName() {
        val realCash = byText("1 938 ₽")
                .waitFindObject()
        val realName = byText("Философия Java Эккель Брюс")
                .waitFindObject()
        assertTrue("Цена верная", realCash.text == "1 938 ₽")
        assertTrue("Название совпадает", realName.text == "Философия Java Эккель Брюс")
    }

    fun tapAboutProduct() {
    searchAboutProduct.waitFindObject().click()
    }

    fun moveToFavorite() {
    searchAddToFav.waitFindObject().waitIsClickable(true, 5000)
    searchAddToFav.waitFindObject().click()
    }

    fun goToFavorite() {
    searchGoToFavorite.waitFindObject().click()
    }

    fun checkFavoritePage() {
    assertTrue("Находимся на странице Избранное", searchPageName.waitFindObject().text == "Избранное")
    }

    fun checkName() {
        var a = false
        if (otecGroup.hasObject(byStringRes("ru.ozon.app.android:id/titleTv").textContains("Философия Java Эккель Брюс | Эккель Брюс")))
        { a = true }
        assertTrue(
                "Есть название товара в избранном",
                a
        )
    }

    fun goToCabinet() {
        searchCabinet.waitFindObject().click()
    }

    fun goToRegistration() {
        searchRegistryButton.waitFindObject().click()
    }

    fun goToMailRegistration() {
        searchMailRegistrationButton.waitFindObject().click()
    }

    fun setWrongMail(text: String) {
        searchMailField.waitFindObject().text = text
    }

    fun getCodeRegistration() {
        searchSubmitButton.waitFindObject().click()
    }

    fun checkHintErrorWithWrongMail() {
        assertTrue("Текст подсказки под полем верный", searchHintText.waitFindObject().text == "Некорректный формат почты")
    }

    @Throws(UiObjectNotFoundException::class)
    fun searchForText(searchText: String?) {
        searchAddToFav.waitFindObject().waitIsClickable(true, 5000)
        searchAddToFav.waitFindObject()
        var textScroll: UiScrollable? = null
        var text: UiObject? = null
        if (searchText != null) {
            textScroll = UiScrollable(UiSelector().scrollable(true))
            textScroll.scrollIntoView(UiSelector().text(searchText))
            text = UiObject(UiSelector().text(searchText))
            text.click()
        }
    }

    fun checkPageName() {
        assertTrue("Открывается страница регистрации", searchRegistrationPageName.waitFindObject().text == "Вход или регистрация")
    }

}