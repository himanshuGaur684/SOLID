package gaur.himanshu.common.module

sealed class ModuleIdentifier {

    data object BillingModule : ModuleIdentifier()

    data object UserModule : ModuleIdentifier()
}