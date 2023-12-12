package com.mahmoud.pdftalaaandroid.presentation.ui.onboarding

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.setValue



class OnboardingViewModel  (
) {
    var currentStep by mutableIntStateOf(0)
        private set

    fun onStepChange(step : Int) {
        currentStep = step
    }

    fun setOnboardingShown() {
    }

//    fun hasOnboardingBeenShown()  : Boolean {
//    }


}