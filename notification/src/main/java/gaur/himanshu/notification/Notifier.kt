package gaur.himanshu.notification

import gaur.himanshu.common.module.ModuleIdentifier

class Notifier {

    fun notify(message: String, moduleIdentifier: ModuleIdentifier) {
        when (moduleIdentifier) {
            ModuleIdentifier.BillingModule -> broadcast(message)
            ModuleIdentifier.UserModule -> broadcast(message)
        }
    }

    private fun broadcast(message: String) {

    }
}