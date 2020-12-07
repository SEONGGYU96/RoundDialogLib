package com.gugyu.rounddialoglib

import android.view.View

internal data class RoundDialogButton(
    val text: String,
    val canDismiss: Boolean,
    val listener: ((content: View?) -> Unit)?
)
