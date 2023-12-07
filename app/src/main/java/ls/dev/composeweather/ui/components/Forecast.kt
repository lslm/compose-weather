package ls.dev.composeweather.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import ls.dev.composeweather.R
import ls.dev.composeweather.ui.theme.Background
import ls.dev.composeweather.ui.theme.Primary
import ls.dev.composeweather.ui.theme.Secondary

@Composable
fun Forecast() {
    Column(
        Modifier
            .width(100.dp)
            .clip(RoundedCornerShape(16.dp))
            .background(color = Background)
            .padding(8.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            "SEG",
            fontSize = 28.sp,
            fontWeight = FontWeight.Medium,
            color = Primary
        )
        Image(
            painter = painterResource(id = R.drawable.cloud),
            contentDescription = "Cloud icon",
            Modifier.size(56.dp)
        )
        Text(
            "28º",
            fontSize = 24.sp,
            fontWeight = FontWeight.ExtraBold,
            color = Primary
        )
        Text(
            "19º",
            fontSize = 16.sp,
            color = Secondary
        )
    }
}

@Preview(
    showBackground = true
)
@Composable
fun ForecastPreview() {
    Forecast()
}
