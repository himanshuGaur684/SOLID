package gaur.himanshu.solid

import gaur.himanshu.auth.Authenticator
import gaur.himanshu.auth.EmailAuthenticator
import gaur.himanshu.auth.credentials.Credentials

class AuthViewModel(
    private val authenticator: Authenticator
) {

    fun login(credentials: Credentials) {
        authenticator.login(credentials)
    }

    fun logout() {
        authenticator.logout()
    }

}