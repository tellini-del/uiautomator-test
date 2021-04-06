package com.example.sampleuiautomatorproject.util

import androidx.test.uiautomator.By

fun byStringRes(stringRes: String) = By.res(stringRes)

fun byContentDescription(contentDescription: String) = By.desc(contentDescription)

fun byText(text: String) = By.text(text)

