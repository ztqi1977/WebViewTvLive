package com.hxh19950701.webviewtvlive.adapter

import android.util.Log

object WebpageAdapterManager {

    private const val TAG = "WebpageAdapterManager"

    private val supportedWebpageAdapters = mutableListOf(
        TbsDebugWebpageAdapter(),
        ChromeUrlWebpageAdapter(),
        MgtvWebpageAdapter(),
        CctvWebpageAdapter(),
        GdtvWebpageAdapter(),
        SztvWebpageAdapter(),
        NtdtvWebpageAdapter(),
        EbcWebpageAdapter(),
        VoaNewsWebpageAdapter(),
        DwWebpageAdapter(),
        YoutubeWebpageAdapter(),
        FgtvWebpageAdapter(),
        TvbWebpageAdapter(),
        CommonWebpageAdapter(),
    )

    fun get(url: String): WebpageAdapter {
        var adapter = supportedWebpageAdapters[supportedWebpageAdapters.lastIndex]
        for (a in supportedWebpageAdapters) {
            if (a.isAdaptedUrl(url)) {
                adapter = a
                break
            }
        }
        Log.i(TAG, "Use ${adapter.javaClass.simpleName} for $url")
        return adapter
    }
}