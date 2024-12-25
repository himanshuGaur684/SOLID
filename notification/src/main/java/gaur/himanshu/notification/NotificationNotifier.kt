package gaur.himanshu.notification

import gaur.himanshu.common.module.ModuleIdentifier


class NotificationNotifier {

    private val notifier: Notifier by lazy { Notifier() }

    fun send(message: String, module: ModuleIdentifier) {
        when (module) {
            ModuleIdentifier.BillingModule -> notifier.notify(message, module)
            ModuleIdentifier.UserModule -> notifier.notify(message, module)
        }
    }
}