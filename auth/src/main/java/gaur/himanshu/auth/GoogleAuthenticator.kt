package gaur.himanshu.auth

class GoogleAuthenticator : Authenticator {
    override fun login(username: String, password: String) {

    }

    override fun logout(): Boolean {
        return true
    }
}