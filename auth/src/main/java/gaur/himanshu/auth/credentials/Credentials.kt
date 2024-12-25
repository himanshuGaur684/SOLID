package gaur.himanshu.auth.credentials

sealed class Credentials {

    data class UserCredentials(val username: String, val password: String) : Credentials()

    data object FingerPrintCredentials : Credentials()

}