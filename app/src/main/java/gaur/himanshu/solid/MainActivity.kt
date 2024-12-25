package gaur.himanshu.solid

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import gaur.himanshu.auth.EmailAuthenticator
import gaur.himanshu.auth.FingerprintAuthenticator
import gaur.himanshu.auth.GoogleAuthenticator
import gaur.himanshu.solid.ui.theme.SOLIDTheme

class MainActivity : ComponentActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SOLIDTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    SOLIDTheme {
        Greeting("Android")
    }
}

fun main(){
    // google authentication
    val googleAuthenticator = GoogleAuthenticator()
    val googleViewModel = AuthViewModel(googleAuthenticator)

    // user authentication
    val emailAuthenticator = EmailAuthenticator()
    val emailViewModel = AuthViewModel(emailAuthenticator)

    // fingerprint authentication
    val fingerPrintAuthenticator = FingerprintAuthenticator()
    val fingerViewModel = AuthViewModel(fingerPrintAuthenticator)
}
