job('DSP-Nany') {
  scm {
        git {
            remote {
                github('SebJak/nanny_dsp')
                credentials('github_sjak')
            }
        }
    }
   
    triggers {
        scm('H/15 * * * *')
    }
    steps {
      gradle{
        useWrapper(false)
        gradleName('Gradle 3.5')
        tasks('test')
        switches('-p nany-server')}
    }
}
