package A.vcsRoots

import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.vcs.GitVcsRoot

object A_HttpsGithubComInnayanClean01 : GitVcsRoot({
    uuid = "6feb3666-3e28-4038-b77f-80dbcd31bf9f"
    name = "https://github.com/innayan/clean01"
    url = "https://github.com/innayan/clean01"
    authMethod = password {
        userName = "innayan"
        password = "credentialsJSON:27e8dc20-0ba4-4388-8caf-0101c45ce77a"
    }
})
