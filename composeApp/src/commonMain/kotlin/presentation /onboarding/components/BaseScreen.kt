//package `presentation `.onboarding.components
//
//import androidx.compose.foundation.Image
//import androidx.compose.foundation.layout.Box
//import androidx.compose.foundation.layout.Column
//import androidx.compose.foundation.layout.fillMaxSize
//import androidx.compose.foundation.layout.fillMaxWidth
//import androidx.compose.foundation.layout.height
//import androidx.compose.foundation.layout.padding
//import androidx.compose.foundation.rememberScrollState
//import androidx.compose.foundation.verticalScroll
//import androidx.compose.material.Text
//import androidx.compose.runtime.Composable
//import androidx.compose.ui.Alignment
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.graphics.Color
//import androidx.compose.ui.text.TextStyle
//import androidx.compose.ui.text.font.FontWeight
//import androidx.compose.ui.text.style.TextAlign
//import androidx.compose.ui.unit.dp
//import androidx.compose.ui.unit.sp
//import com.mahmoud.pdftalaaandroid.presentation.ui.onboarding.components.StepIndicator
//import org.jetbrains.compose.resources.ExperimentalResourceApi
//import org.jetbrains.compose.resources.painterResource
//
//@OptIn(ExperimentalResourceApi::class)
//@Composable
//fun BaseOnboardingScreen(
//    painterRes: Int,
//    onBoardingTitle: String,
//    onBoardingDescription: String,
//    modifier: Modifier = Modifier,
//    currentStep: Int,
//    onNextClick: () -> Unit,
//    onSkipClick : () -> Unit
//) {
//    Box(
//        modifier = modifier.fillMaxSize()
//            .verticalScroll(rememberScrollState())
//    ) {
//        Column(
//            modifier = Modifier
//                .fillMaxWidth()
//                .align(Alignment.TopStart)
//                .padding(top = 130.dp),
//            horizontalAlignment = Alignment.CenterHorizontally,
//        ) {
//            Image(
//                modifier = Modifier
//                    .padding(
//                        horizontal = 58.dp,
//                    )
//                    .fillMaxWidth()
//                    .height(300.dp),
//                painter = painterResource(res = ""),
//                contentDescription = "on boarding image base screen",
//            )
//            Text(
//                modifier = Modifier.padding(top = 16.dp ),
//                text = onBoardingTitle,
//                style = TextStyle(
//                    fontSize = 24.sp,
//                    lineHeight = 34.sp,
//                    fontFamily = openSans,
//                    fontWeight = FontWeight.W400,
//                    color = Color(0xFF2D2B2E),
//                    textAlign = TextAlign.Center,
//                )
//            )
//            Text(
//                modifier = Modifier.padding(top = 16.dp ),
//                text = onBoardingDescription,
//                style = TextStyle(
//                    fontSize = 14.sp,
//                    lineHeight = 24.sp,
//                    fontFamily = openSans,
//                    fontWeight = FontWeight.W400,
//                    color = Color(0xFF2D2B2E).copy(0.5f),
//                    textAlign = TextAlign.Center,
//                )
//            )
//        }
//        StepIndicator(
//            modifier = Modifier
//                .align(Alignment.BottomCenter)
//                .padding(bottom = 50.dp),
//            currentStep = currentStep,
//            onNextClick = onNextClick,
//            onSkipClick = onSkipClick
//        )
//    }
//}