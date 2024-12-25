package gaur.himanshu.notification

import gaur.himanshu.common.module.ModuleIdentifier


interface Notificable {
    fun shouldNotify(): Boolean
    fun notify(message: String, module: ModuleIdentifier)
}

open class NotificationNotifier(
    private val list: List<Notificable>
) {
   open fun send(message: String, module: ModuleIdentifier) {
        list.firstOrNull { it.shouldNotify() }?.notify(message, module)
    }
}


class SpecialNotifications(
    private val list: List<Notificable>
) : NotificationNotifier(list){
    override fun send(message: String, module: ModuleIdentifier) {

    }
}