import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.mahmoud.talaa.SharedRes
import dev.icerock.moko.resources.compose.stringResource

@Composable
fun App() {

    MaterialTheme {
        Surface(modifier= Modifier.fillMaxSize()) {
            Text(text = stringResource(SharedRes.strings.hello))
        }
    }
}