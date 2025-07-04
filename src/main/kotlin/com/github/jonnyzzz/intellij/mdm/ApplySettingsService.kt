package com.github.jonnyzzz.intellij.mdm

import com.intellij.openapi.components.Service
import com.intellij.openapi.diagnostic.thisLogger

@Service(Service.Level.APP)
class ApplySettingsService {
  private val log = thisLogger()

  fun applySettings() {
    log.info("Applying MDM settings...")
  }
}
