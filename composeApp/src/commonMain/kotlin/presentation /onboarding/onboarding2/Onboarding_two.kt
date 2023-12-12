package com.mahmoud.pdftalaaandroid.presentation.ui.onboarding.onboarding2


import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import com.mahmoud.pdftalaaandroid.R
import com.mahmoud.pdftalaaandroid.presentation.ui.onboarding.OnboardingViewModel
import `presentation `.onboarding.components.BaseOnboardingScreen



@Composable
fun OnboardingTwo(
    modifier : Modifier = Modifier,
    onNextClick : () -> Unit,
    onSkipClick : () -> Unit,
    onboardingViewModel: OnboardingViewModel
) {


    LaunchedEffect(key1 = true) {
        onboardingViewModel.onStepChange(1)
    }
    BaseOnboardingScreen(
        modifier = modifier,
        painterRes = R.drawable.onboarding_two_img,
        onBoardingTitle = stringResource(id = R.string.onboarding_2_title),
        onBoardingDescription = stringResource(id = R.string.onboarding_2_description),
        currentStep = onboardingViewModel.currentStep,
        onNextClick = {
            onNextClick()
        },
        onSkipClick = {
            onSkipClick()
            onboardingViewModel.setOnboardingShown()
        }
    )
}

