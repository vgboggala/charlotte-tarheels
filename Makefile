.PHONY: bootstrap setup update run console clean build test cibuild
.DEFAULT_GOAL := help

help:
	echo "Primary goals are build, run, test, verify. 'make run' to execute"

bootstrap:
	echo "'Bootstrap' currently has not steps"

run: 
	./gradlew run

clean:
	./gradlew clean

build: test
	./gradlew build

test: 
	echo "Running unit tests"
	./gradlew test

verify: stagetests
	echo "Running cucumber tests"
	./gradlew cucumberCli

stagetests:
	cp -R src/test/resources/images output/images

cibuild: test verify build
