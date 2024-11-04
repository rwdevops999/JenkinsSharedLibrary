# SHARED LIBRARIES FOR JENKINS

## useage

@Library("jenkins-shared-library") \_

## mailTo

send extended email notification to receipient

> > steps {
> > mailTo(to: "rudi.welter@gmail.com", attachLog: false)
> > }
