package gaur.himanshu.auth

interface Authenticator {

    fun login(username: String, password: String)

    fun logout(): Boolean

}