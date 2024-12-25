package gaur.himanshu.auth

class EmailAuthenticator : Authenticator {
    override fun login(username: String, password: String) {

    }

    override fun logout(): Boolean {
        return true
    }
}