package com.github.wbdev.intellij.services

import com.intellij.openapi.project.Project
import com.github.wbdev.intellij.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
