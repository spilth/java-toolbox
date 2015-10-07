[![Stories in Ready](https://badge.waffle.io/TheJavaToolbox/java-toolbox.png?label=ready&title=Ready)](https://waffle.io/TheJavaToolbox/java-toolbox)
[![Circle CI](https://circleci.com/gh/TheJavaToolbox/java-toolbox.svg?style=svg)](https://circleci.com/gh/TheJavaToolbox/java-toolbox)

# The Java Toolbox

Java Library and Tool Discovery Website

## Requirements

- [Java 8 SDK](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)
- [Maven 3.X](http://maven.apache.org)

On a Mac you can install Maven with [Homebrew](http://brew.sh):

    $ brew install maven
    
## Tests

To run the test suite, run Maven with the `test` profile:

    $ mvn -P test

Or you can simply just run `mvn`.

## Development Server

To run a local development server, run Maven with the `development` profile.

    $ mvn -P development

Then go to <http://localhost:8080> to view the site.

## Troubleshooting

### Maven & JAVA_HOME

If Maven complains about `JAVA_HOME` not being set, you can set it with the following:

    $ export JAVA_HOME=$(/usr/libexec/java_home)
    
You'll likely want to add that to your `.bash_profile` or similar shell initialization script.
