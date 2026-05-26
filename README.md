# hello-sasi-ci (Java)

Minimal example of a GitHub Actions CI pipeline that runs JUnit 5 tests on every push and pull request.

![CI](https://github.com/rteusner/hello-sasi-ci/actions/workflows/ci.yml/badge.svg)

## What's in here

- `src/main/java/com/example/Hello.java` — a tiny class with a `greet()` method
- `src/test/java/com/example/HelloTest.java` — JUnit 5 tests for it
- `pom.xml` — Maven build config (Java 21, JUnit Jupiter 5.11)
- `.github/workflows/ci.yml` — the CI pipeline

## Run locally

```bash
mvn test
```

Or build and run:

```bash
mvn package
java -cp target/classes com.example.Hello
```

## How the pipeline works

On every push or PR to `main`, GitHub spins up an Ubuntu runner, installs JDK 21 (Temurin), caches the Maven dependencies, then runs `mvn test`. Green check = tests passed.
