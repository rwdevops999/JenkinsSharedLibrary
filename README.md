# SHARED LIBRARIES FOR JENKINS

## useage

@Library("jenkins-shared-library") \_

## mailTo

send extended email notification to receipient

```Jenkins
    mailTo(to: "rudi.welter@gmail.com", attachLog: false)
```

## logMessage

log message with date/time

```jenkins
    logMessage("test");
```

> > 11/04/2014 18:50:23 test
