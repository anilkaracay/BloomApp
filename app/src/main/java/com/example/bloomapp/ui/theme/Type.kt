package com.example.bloomapp.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.bloomapp.R

private val NunitoBold = FontFamily(Font(R.font.nunitosans_bold))
private val NunitoSemiBold = FontFamily(Font(R.font.nunitosans_semibold))
private val NunitoLight = FontFamily(Font(R.font.nunitosans_light))

// Set of Material typography styles to start with
val Typography = Typography(
  h1 = TextStyle(
    fontFamily = NunitoBold,
    fontSize = 18.sp,

    ),
  h2 = TextStyle(
    fontFamily = NunitoBold,
    fontSize = 14.sp,
    letterSpacing = 0.15.sp
  ),
  subtitle1 = TextStyle(
    fontFamily = NunitoLight,
    fontSize = 16.sp,

    ),
  body1 = TextStyle(
    fontFamily = NunitoLight,
    fontSize = 14.sp
  ),
  body2 = TextStyle(
    fontFamily = NunitoLight,
    fontSize = 12.sp
  ),
  button = TextStyle(
    fontFamily = NunitoSemiBold,
    fontSize = 14.sp,
    letterSpacing = 1.sp
  ),
  caption = TextStyle(
    fontFamily = NunitoSemiBold,
    fontSize = 12.sp,

    )

)


/* Other default text styles to override
  button = TextStyle(
      fontFamily = FontFamily.Default,
      fontWeight = FontWeight.W500,
      fontSize = 14.sp
  ),
  caption = TextStyle(F
      fontFamily = FontFamily.Default,
      fontWeight = FontWeight.Normal,
      fontSize = 12.sp
  )
  */
