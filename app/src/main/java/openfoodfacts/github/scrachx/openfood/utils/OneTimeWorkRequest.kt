@file:Suppress("NOTHING_TO_INLINE")

package openfoodfacts.github.scrachx.openfood.utils

import androidx.work.ListenableWorker
import androidx.work.OneTimeWorkRequest
import androidx.work.OneTimeWorkRequestBuilder


inline fun <reified T : ListenableWorker> OneTimeWorkRequest(
    builderAction: OneTimeWorkRequest.Builder.() -> Unit = {},
): OneTimeWorkRequest {
    return OneTimeWorkRequestBuilder<T>().apply(builderAction).build()
}
