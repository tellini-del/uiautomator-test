package com.example.sampleuiautomatorproject.util

//    companion object {
//        const val TIMEOUT = 25000L
//    }
//    private val device = UiDevice.getInstance(InstrumentationRegistry.getInstrumentation())
//    private val context = InstrumentationRegistry.getInstrumentation().context
//
//
//    @Before
//    fun setUp() {
//        val intent =
//                context.packageManager.getLaunchIntentForPackage("ru.ozon.app.android")?.apply {
//                    addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK)
//                }
//        device.pressHome()
//        context.startActivity(intent)
//    }

//    @Test
//    fun findPhilosophy() {
//        device.wait(
//                Until.findObject(By.res("ru.ozon.app.android:id/searchTv")),
//                TIMEOUT
//        ).click()
//
//        device.wait(
//                Until.findObject(By.res("ru.ozon.app.android:id/search_src_text")),
//                TIMEOUT
//        ).text = "Философия Java"
//
//        val realCash = device.wait(
//                Until.findObject(By.text("1 938 ₽")),
//                TIMEOUT
//        )
//        val realName = device.wait(
//                Until.findObject(By.text("Философия Java Эккель Брюс")),
//                TIMEOUT
//        )
//        assertTrue("Цена верная", realCash.text == "1 938 ₽")
//        assertTrue("Название совпадает", realName.text == "Философия Java Эккель Брюс")
//    }


//    @Test
//    fun AnotherWayToFindPhilosophy() {
//        byStringRes("ru.ozon.app.android:id/searchTv")
//                .waitFindObject()
//                .click()
//        byStringRes("ru.ozon.app.android:id/search_src_text")
//            .waitFindObject().text = "Философия Java Эккель Брюс"
//        val realCash = byText("1 938 ₽")
//                .waitFindObject()
//        val realName = byText("Философия Java Эккель Брюс")
//                .waitFindObject()
//
//        assertTrue("Цена верная", realCash.text == "1 938 ₽")
//        assertTrue("Название совпадает", realName.text == "Философия Java Эккель Брюс")
//    }






//    open fun open() {
//        val intent = context.packageManager.getLaunchIntentForPackage(packageName)?.apply {
//            addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK)
//        }
//        device.pressHome()
//        context.startActivity(intent)
//    }
//

//    fun pressReviewButton(searchText: String?) {
//        var search: UiScrollable? = null
//        var text: UiObject? = null
//        if (searchText != null) {
//            search = UiScrollable(byStringRes("ru.ozon.app.android:id/listRv").scrollable(true))
//            search.scrollIntoView(UiSelector().text("Написать отзыв")
//            text = UiObject(UiSelector().text("Написать отзыв"))
//            text.click()
//        }
//        var search = UiScrollable(byStringRes("ru.ozon.app.android:id/listRv").scrollable(true)).scrollIntoView(searchReviewButton.text("Написать отзыв")).click()
//       searchReviewButton.waitFindObject()

//  private val searchReviewButton = byStringRes("ru.ozon.app.android:id/buttonAtomTitleTv")
//  private val otecGroup2 = byStringRes("ru.ozon.app.android:id/listRv")
//  private val goodsInFav = byStringRes("ru.ozon.app.android:id/rootCl")
// 2nd variant
// UiScrollable(byStringRes("ru.ozon.app.android:id/listRv").scrollable(true)).scrollTextIntoView("Написать отзыв").click()

//        val elements: List<WebElement> = androidDriver.findElementByClassName("android.support.v7.widget.RecyclerView").findElements(By.id("com.osanda.exampleapp:id/textViewTitle"))
//        for (element in elements) {
//            System.out.println(element.getText())
//        }
//    }
//    fun scrollAndClick(String visibleText) {
//        findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""+visibleText+"\").instance(0))").click();
//    }

//        var b = goodsInFav.hasObject(byText("asd"))
//        print(b)


//        goodsInFav.waitFindObject()
//        var b: Boolean = false
//        if (otecGroup2.hasChild(byText("Философия Java Эккель Брюс | Эккель Брюс")) != null) { b = true
//        assertTrue("est takoe", b)}
//        else {
//            assertFalse("net takogo", b)
//        }
//        assertTrue("sd", otecGroup.hasChild(byText("Философия Java Эккель Брюс | Эккель Брюс")) = true)
//        assert(otecGroup.hasChild(byText("Философия Java Эккель Брюс | Эккель Брюс")) = true)
//        assertInstalled()
//        assertTrue("Товар с нужным названием попал в избранное", searchPageName.waitFindObject().text == "Философия Java Эккель Брюс | Эккель Брюс")
