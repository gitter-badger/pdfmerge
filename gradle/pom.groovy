name = "$projectName"

description = "$projectDescription"

developers {
    developer {
        id = "ancho"
        name = "Frank Becker"
        email = "frank@calmdevelopment.de"
        url = "https://calmdevelopment.de"
        timezone = "Europe/Berlin"
        roles {
            role = "developer"
        }
        properties {
            twitter = "@knarfancho"
        }
    }
}

licenses {
    license {
        name = "Apache License, Version 2.0"
        url = "http://www.apache.org/licenses/LICENSE-2.0.txt"
        distribution = "repo"
    }
}

scm {
    url = "https://github.com/ancho/pdfmerge/"
    connection = "scm:git:git@github.com:ancho/pdfmerge.git"
    developerConnection = "scm:git:https://github.com/ancho/pdfmerge.git"
}

issueManagement{
    system = "GitHub Issues"
    url = "https://github.com/ancho/pdfmerge/issues"
}
