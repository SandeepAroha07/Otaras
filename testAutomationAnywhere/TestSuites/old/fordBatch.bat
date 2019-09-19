@Echo off
SET LOGFILE=C:\mywork\AUTOMATION\NEW\batchfile_log.log
call :Logit >> %LOGFILE%
exit /b 0
:Logit

set projectLocation=C:\mywork\AUTOMATION\NEW\testAutomationAnywhere

cd %projectLocation%

set classpath=%projectLocation%\target\test-classes\;%projectLocation%\target\classes\;%projectLocation%\lib\*

java org.testng.TestNG %projectLocation%\TestSuites\Ford\ParallelSameFunctTestcmd.xml

pause