package gaur.himanshu.auth

class FingerprintAuthenticator : Authenticator {
    override fun login(username: String, password: String) {
        throw IllegalArgumentException("username and password is not used")
    }

    override fun logout(): Boolean {
        return false
    }
}