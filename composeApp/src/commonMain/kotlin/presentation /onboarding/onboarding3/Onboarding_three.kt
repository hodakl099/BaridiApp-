package com.mahmoud.pdftalaaandroid.presentation.ui.onboarding.onboarding3


import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import com.mahmoud.pdftalaaandroid.R
import com.mahmoud.pdftalaaandroid.presentation.ui.onboarding.OnboardingViewModel
import `presentation `.onboarding.components.BaseOnboardingScreen



@Composable
fun OnboardingThree(
    modifier : Modifier = Modifier,
    onNextClick : () -> Unit,
    onboardingViewModel: OnboardingViewModel
) {

    LaunchedEffect(key1 = true) {
        onboardingViewModel.onStepChange(2)
    }

    BaseOnboardingScreen(
        modifier = modifier,
        painterRes = R.drawable.onboarding_three_img,
        onBoardingTitle = stringResource(id = R.string.onboarding_3_title),
        onBoardingDescription =  stringResource(id = R.string.onboarding_3_description),
        currentStep = onboardingViewModel.currentStep,
        onNextClick = {
            onNextClick()
            onboardingViewModel.setOnboardingShown()
        },
        onSkipClick = {
            onNextClick()
            onboardingViewModel.setOnboardingShown()
        }
    )
}

