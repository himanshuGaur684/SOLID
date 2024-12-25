package gaur.himanshu.billing

import gaur.himanshu.model.Report

class BillingManager {

    fun createBill() {

    }

    fun extractReport(): Report {
        return Report("final report")
    }

    fun removeItem(): Boolean {
        return true
    }

    fun pay(billingNumber: Int) {

    }

    fun hasBeenPayed(billingNumber: Int): Boolean {
        return false
    }
}
