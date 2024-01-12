package ls.dev.composeweather.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import ls.dev.composeweather.R
import ls.dev.composeweather.ui.components.ForecastsSectionComponent
import ls.dev.composeweather.ui.theme.Background
import ls.dev.composeweather.ui.theme.Blue80
import ls.dev.composeweather.ui.theme.Blue90
import ls.dev.composeweather.ui.theme.Pink40
import ls.dev.composeweather.ui.theme.Purple40

@Composable
fun App() {
    Column(
        Modifier
            .fillMaxHeight()
            .verticalScroll(rememberScrollState())
            .background(
                brush = Brush.verticalGradient(
                    colors = listOf(
                        Blue80, Blue90
                    )
                )
            )
            .padding(top = 16.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            "Mogi das Cruzes",
            fontSize = 16.sp,
            color = Color.White
        )

        Text(
            "Quinta-feira",
            fontSize = 28.sp,
            modifier = Modifier.padding(top = 32.dp),
            color = Color.White
        )

        Spacer(modifier = Modifier.size(16.dp))

        Image(
            painter = painterResource(id = R.drawable.cloud),
            contentDescription = "Cloud icon",
            Modifier
                .size(150.dp)
        )

        Text(
            "32ºC",
            fontSize = 96.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.offset(y = -(24.dp)),
            color = Color.White
        )


        ForecastsSectionComponent()

        Spacer(Modifier.size(16.dp))

        FilledTonalButton(onClick = {}) {
            Text("Mudar Cidade")
        }

    }
}

@Preview(showSystemUi = true)
@Composable
fun AppPreview() {
    App()
}