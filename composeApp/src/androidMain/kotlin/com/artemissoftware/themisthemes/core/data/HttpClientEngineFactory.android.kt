package com.artemissoftware.themisthemes.core.data

import io.ktor.client.engine.HttpClientEngine
import io.ktor.client.engine.okhttp.OkHttp

actual class HttpClientEngineFactory actual constructor() {
    actual fun getHttpEngine(): HttpClientEngine {
        return OkHttp.create()
    }
}