
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
        gradle('-p nany-server test')
    }
}
