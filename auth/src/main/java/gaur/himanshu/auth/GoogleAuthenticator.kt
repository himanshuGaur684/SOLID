package gaur.himanshu.auth

import gaur.himanshu.auth.credentials.Credentials

class GoogleAuthenticator : Authenticator {
    override fun login(credentials: Credentials) {
        if(credentials is Credentials.UserCredentials){

        }
    }

    override fun logout(): Boolean {
        return true
    }
}