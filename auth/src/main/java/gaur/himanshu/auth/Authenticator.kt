package gaur.himanshu.auth

import gaur.himanshu.auth.credentials.Credentials

interface Authenticator {

    fun login(credentials: Credentials)

    fun logout(): Boolean

}