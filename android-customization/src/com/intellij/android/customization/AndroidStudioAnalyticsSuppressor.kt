// Copyright 2000-2025 JetBrains s.r.o. and contributors. Use of this source code is governed by the Apache 2.0 license.
package com.intellij.android.customization

import com.intellij.ide.ApplicationInitializedListener

// used only for debugging purposes in IntelliJ repository
internal class AndroidStudioAnalyticsSuppressor : ApplicationInitializedListener {
  override suspend fun execute() {
  }
}
