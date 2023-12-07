package ls.dev.composeweather.ui.components

import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import ls.dev.composeweather.ui.theme.Secondary

@Composable
fun ForecastsSection() {
    Column {
        Text(
            "Previsão para os próximos 5 dias",
            Modifier.padding(start = 16.dp, bottom = 16.dp),
            fontSize = 20.sp,
            fontWeight = FontWeight(400),
            color = Secondary
        )
        Row(
            Modifier
                .fillMaxWidth()
                .horizontalScroll(rememberScrollState())
                .padding(horizontal = 16.dp),
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            Forecast()
            Forecast()
            Forecast()
            Forecast()
            Forecast()
        }
    }
}

@Composable
@Preview(showBackground = true)
fun ForecastsSectionPreview() {
    ForecastsSection()
}