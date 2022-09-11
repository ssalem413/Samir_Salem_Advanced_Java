# ReadMe file First Java Project for Advanced Java


### - Every project should have a read me file similar to this one. 

## This project has two main purposes:

- Show to how to use the System Rules library. 

This library is super useful for testing

System.out, System.err and System.in
Command-line applications read from the command-line and write to it. Use SystemErrRule, SystemOutRule and TextFromStandardInputStream to provide the input text and verify the output.

Applications sometimes unintentionally write to System.out or System.err. Ensure that this does not happen by using DisallowWriteToSystemOut and and DisallowWriteToSystemErr.

System.exit
Use the ExpectedSystemExit rule to test code that calls System.exit(…). Verify that System.exit(…) is called, verify the status code of this call or check assertions the application terminated.

System Properties
If your test deals with system properties, you have to set them and restore them after the test. Use the ClearSystemProperties, ProvideSystemProperty and RestoreSystemProperties rules for this purpose.

Environment Variables
If your test needs to set an environment variable then use the EnvironmentVariables rule.

Security Managers
Use the ProvideSecurityManager rule to provide a specific security manager for your test. The system's security manager is restored after the test.

see:
src/main/java/com/origamisoftware/advanced_java/systemrules
src/test/java/com/origamisoftware/advanced_java/systemrules

see https://stefanbirkner.github.io/system-rules/index.html

- Provide a starting point for students to create their own classes and JUnit tests as part of a coding assignment. 

