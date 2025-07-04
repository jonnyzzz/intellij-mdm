package com.github.jonnyzzz.intellij.mdm

import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.components.service
import com.intellij.openapi.project.DumbAwareAction

class ApplySettingsAction : DumbAwareAction(MessageBundle.message("action.apply.settings.text")) {
  override fun actionPerformed(event: AnActionEvent) {
    service<ApplySettingsService>().applySettings()
  }
}


