//package com.mahmoud.pdftalaaandroid.presentation.ui.onboarding.components
//
//import androidx.compose.foundation.background
//import androidx.compose.foundation.clickable
//import androidx.compose.foundation.layout.Arrangement
//import androidx.compose.foundation.layout.Box
//import androidx.compose.foundation.layout.Row
//import androidx.compose.foundation.layout.Spacer
//import androidx.compose.foundation.layout.fillMaxWidth
//import androidx.compose.foundation.layout.height
//import androidx.compose.foundation.layout.padding
//import androidx.compose.foundation.layout.width
//import androidx.compose.foundation.shape.CircleShape
//import androidx.compose.material.Text
//import androidx.compose.runtime.Composable
//import androidx.compose.runtime.CompositionLocalProvider
//import androidx.compose.ui.Alignment
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.graphics.Color
//import androidx.compose.ui.platform.LocalLayoutDirection
//import androidx.compose.ui.res.stringResource
//import androidx.compose.ui.text.TextStyle
//import androidx.compose.ui.text.font.FontWeight
//import androidx.compose.ui.text.style.TextAlign
//import androidx.compose.ui.unit.LayoutDirection
//import androidx.compose.ui.unit.dp
//import androidx.compose.ui.unit.sp
//import com.mahmoud.pdftalaaandroid.R
//import com.mahmoud.pdftalaaandroid.presentation.fonts.AppGoogleFonts.openSans
//import com.mahmoud.pdftalaaandroid.theme.ColdTurkey
//import com.mahmoud.pdftalaaandroid.theme.Startos
//import dev.icerock.moko.resources.compose.stringResource
//
//
//@Composable
//fun StepIndicator(
//    modifier: Modifier = Modifier,
//    currentStep: Int,
//    onNextClick : () -> Unit,
//    onSkipClick : () -> Unit
//) {
//    CompositionLocalProvider(LocalLayoutDirection provides LayoutDirection.Ltr) {
//        Row(
//            horizontalArrangement = Arrangement.SpaceBetween,
//            verticalAlignment = Alignment.CenterVertically,
//            modifier = modifier
//                .padding(horizontal = 40.dp)
//                .fillMaxWidth()
//        ) {
//            Text(
//                modifier = Modifier.clickable { onSkipClick() },
//                text = stringResource(id = R.string.skip),
//                style = TextStyle(
//                    fontSize = 18.sp,
//                    lineHeight = 28.sp,
//                    fontFamily = openSans,
//                    fontWeight = FontWeight.W200,
//                    color = Color(0xFF2D2B2E),
//                )
//            )
//            Row(
////                verticalAlignment = Alignment.CenterVertically
//            ) {
//                for (i in 0 until 3) {
//                    Spacer(modifier = Modifier.width(if (i > 0) 8.dp else 0.dp))
//                    Box(
//                        modifier = Modifier
//                            .width(if (i == currentStep) 15.dp else 7.dp)
//                            .height(6.dp)
//                            .background(
//                                if (i == currentStep) Startos else ColdTurkey,
//                                shape = CircleShape
//                            )
//                    )
//                }
//            }
//
//            Text(
//                modifier = Modifier.clickable { onNextClick() },
//                text = stringResource(id = R.string.next),
//                style = TextStyle(
//                    fontSize = 18.sp,
//                    lineHeight = 28.sp,
//                    fontFamily = openSans,
//                    fontWeight = FontWeight(400),
//                    color = Color(0xFF2D2B2E),
//                )
//            )
//        }
//    }
//
//}
//
//
