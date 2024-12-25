package gaur.himanshu.auth

import gaur.himanshu.auth.credentials.Credentials

class FingerprintAuthenticator : Authenticator {
    override fun login(credentials: Credentials) {
        if (credentials is Credentials.FingerPrintCredentials) {

        }

    }

    override fun logout(): Boolean {
        return false
    }
}