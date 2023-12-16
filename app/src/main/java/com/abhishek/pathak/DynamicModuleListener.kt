package com.abhishek.pathak

interface DynamicModuleListener {
    fun onDownloading()
    fun onDownloadCompleted()
    fun onInstallSuccess()
    fun onFailed()
}