package com.artemissoftware.themisthemes.login.composables

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.artemissoftware.themisthemes.designsystem.Link
import com.artemissoftware.themisthemes.designsystem.TTButton
import com.artemissoftware.themisthemes.designsystem.TTTextField

@Composable
internal fun LoginFormSection(
    emailText: String,
    onEmailTextChange: (String) -> Unit,
    passwordText: String,
    onPasswordTextChange: (String) -> Unit,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
    ) {
        TTTextField(
            text = emailText,
            onValueChange = onEmailTextChange,
            label = "Email",
            hint = "john.doe@example.com",
            isInputSecret = false,
            modifier = Modifier
                .fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(16.dp))

        TTTextField(
            text = passwordText,
            onValueChange = onPasswordTextChange,
            label = "Password",
            hint = "Password",
            isInputSecret = true,
            modifier = Modifier
                .fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(24.dp))

        TTButton(
            text = "Log In",
            onClick = {},
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(16.dp))

        Link(
            text = "Don't have an account?",
            onClick = {},
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
        )
    }
}